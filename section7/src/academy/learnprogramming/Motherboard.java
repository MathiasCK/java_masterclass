package academy.learnprogramming;

public class Motherboard {

    private String model;
    private String manifacurer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manifacurer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manifacurer = manifacurer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programeName) {
        System.out.println("Program " + programeName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManifacurer() {
        return manifacurer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
