package academy.learnprogramming;

public class Monitor {

    private String model;
    private String manifacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manifacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manifacturer = manifacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing " + color + " pixel at: " + x + "," + y);
    }

    public String getModel() {
        return model;
    }

    public String getManifacturer() {
        return manifacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
