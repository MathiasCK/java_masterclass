package academy.learnprogramming;

public class Printer {

    private int toner = -1;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int toner, boolean isDuplex) {
        if(toner > 0 && toner <= 100) {
            this.toner = toner;
        }
        this.isDuplex = isDuplex;
    }

    public int addToner(int amount) {
        if(amount > 0 && toner <= 100) {
            if(this.toner + amount > 100) {
                return -1;
            }
            this.toner += amount;
            return this.toner;
        }

        return -1;
    }

    public void printPage(int pages) {
        if(isDuplex) {
            this.numberOfPagesPrinted += Math.ceil(pages / 2);
            System.out.println("Pages printed: " + this.numberOfPagesPrinted);
            return;
        }
        this.numberOfPagesPrinted += pages;
        System.out.println("Pages printed: " + this.numberOfPagesPrinted);
    }

    public int getToner() {
        return toner;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public static void main(String[] args) {

        Printer printer = new Printer(999,  true);
        printer.printPage(100);
    }
}
