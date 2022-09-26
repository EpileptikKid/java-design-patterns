package Proxy;

public class ProxyImage implements ImageInterface {
    private String filename;
    private Image image;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (this.image == null) {
            this.image = new Image(filename);
        }
        image.display();
    }
}
