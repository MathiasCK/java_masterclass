package academy.learnprogramming;

public class Case {

    private String model;
    private String manifacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manifacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manifacturer = manifacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed!");
    }

    public String getModel() {
        return model;
    }

    public String getManifacturer() {
        return manifacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
