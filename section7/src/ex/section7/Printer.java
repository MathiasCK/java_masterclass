package ex.section7;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            return this.tonerLevel += tonerAmount;
        }
        return -1;
    }

    public void printPages(int pages) {
        if(this.duplex) {
            this.pagesPrinted += Math.ceil(pages / 2);
            return;
        }
        this.pagesPrinted += pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
