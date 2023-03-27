package com.theatre;

import java.util.*;

public class Theatre {

  private final String theatreName;
  private List<Seat> seats = new ArrayList<Seat>();

  static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
    @Override
    public int compare(Seat seat1, Seat seat2) {
      if (seat1.getPrice() < seat2.getPrice()) {
        return -1;
      } else if (seat1.getPrice() > seat2.getPrice()) {
        return 1;
      }
      return 0;
    }
  };

  public Theatre(String theatreName) {
    this(theatreName, 8, 12);
  }

  public Theatre(String theatreName, int numRows, int seatsPerRow) {
    this.theatreName = theatreName;

    int lastRow = 'A' + (numRows - 1);
    double price = 12.00;

    for (char row = 'A'; row <= lastRow; row++) {
      for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {

        if (row < 'D' && (seatNum >= 4 && seatNum <= 9)) {
          price = 14.00;
        }
        if (row > 'F' || (seatNum < 4 || seatNum > 9)) {
          price = 7.00;
        }
        Seat seat = new Seat(row + String.format("%02d", seatNum), price);
        this.seats.add(seat);
      }
    }
  }

  public String getTheatreName() {
    return this.theatreName;
  }

  public boolean reserveSeat(String seatNumber) {
    int low = 0;
    int high = seats.size() - 1;
    while (low <= high) {
      int mid = (low + high) / 2;
      Seat midVal = seats.get(mid);

      int cmp = midVal.getSeatNumber().compareTo(seatNumber);

      if (cmp < 0) {
        low = mid + 1;
      } else if (cmp > 0) {
        high = mid - 1;
      } else {
        return seats.get(mid).reserve();
      }
    }

    System.out.println("There is no seat " + seatNumber);
    return false;
    /*
     * Seat requestedSeat = new Seat(seatNumber);
     * int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
     * 
     * if (foundSeat >= 0) {
     * return seats.get(foundSeat).reserve();
     * }
     * 
     * System.out.println("There is no seat " + seatNumber);
     * return false;
     */
  }

  public Collection<Seat> getSeats() {
    return this.seats;
  }

  public class Seat implements Comparable<Seat> {
    private final String seatNumber;
    private double price;
    private boolean resevred = false;

    public Seat(String seatNumber, double price) {
      this.seatNumber = seatNumber;
      this.price = price;
    }

    @Override
    public int compareTo(Seat seat) {
      return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    public boolean reserve() {
      if (!this.resevred) {
        this.resevred = true;
        System.out.println("Seat " + this.seatNumber + " sucessfully reserved");
        return true;
      }
      System.out.println("Seat " + this.seatNumber + " is already reserved");
      return false;
    }

    public boolean cancel() {
      if (this.resevred) {
        this.resevred = false;
        System.out.println("Reservation of seat " + this.seatNumber + " canceled");
        return true;
      }
      System.out.println("Cannot cancel seat " + this.seatNumber + " it is not reserved");
      return false;
    }

    public String getSeatNumber() {
      return this.seatNumber;
    }

    public double getPrice() {
      return this.price;
    }
  }
}
