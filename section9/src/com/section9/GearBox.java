package com.section9;

import java.util.ArrayList;

public class GearBox {

    ArrayList<Gear> gears;
    private final int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 0; i < maxGears; i++) {
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if(number > 0 && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if(newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("New gear : " + newGear);
            return;
        }
        System.out.println("Grind!");
        this.currentGear = 0;
    }

    public double wheelSpeed(int revs) {
        if(this.clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    private static class Gear {
        private final int gearNumber;
        private final double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }
    }

    public static void main(String[] args) {

        GearBox gearBox = new GearBox(6);
        gearBox.operateClutch(true);
        gearBox.changeGear(1);
        gearBox.operateClutch(false);
        System.out.println(gearBox.wheelSpeed(1000));
        gearBox.changeGear(2);
        System.out.println(gearBox.wheelSpeed(1000));
        gearBox.operateClutch(true);
        gearBox.changeGear(3);
        gearBox.operateClutch(false);
        System.out.println(gearBox.wheelSpeed(6000));
    }
}
