package academy.learnprogramming;

public class Couch {

    private String color;
    private int year;
    private boolean isLeather;

    public Couch(String color, int year, boolean isLeather) {
        this.color = color;
        this.year = year;
        this.isLeather = isLeather;
    }

    public void getCouch() {
        String leatherInfo = isLeather ? " and is made from leather" : "";
        System.out.println("The couch is " + color + " and is made in " + year + leatherInfo);
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeather() {
        return isLeather;
    }
}
