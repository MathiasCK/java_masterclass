package academy.learnprogramming;

public class Computer {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public Computer(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        monitor.drawPixelAt(1200, 1500, "red");

    }

    public void load(String programName) {
        motherboard.loadProgram(programName);
    }

    public static void main(String[] args) {

        Case theCase = new Case("220B", "Apple", "200", new Dimensions(10, 20, 40));
        Monitor monitor = new Monitor("HD", "Apple", 40,  new Resolution(20, 10));
        Motherboard motherboard = new Motherboard("Model", "Apple", 5, 5, "bios");

        Computer computer = new Computer(theCase, monitor, motherboard);

        // computer.getMonitor().drawPixelAt(1500, 1200, "red");
        // computer.getMotherboard().loadProgram("Java");
        // computer.getTheCase().pressPowerButton();

        computer.powerUp();
        computer.load("Java");
    }

}
