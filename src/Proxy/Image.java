package Proxy;

public class Image implements ImageInterface {
    private String filename;

    public Image(String filename) {
        this.filename = filename;
        this.loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename + " ...");
    }

    @Override
    public void display() {
        System.out.println("Display " + filename + ";");
    }
}
