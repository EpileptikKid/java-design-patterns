package Proxy;

public class Application {
    public static void main(String[] args) {
        String filename = "test.png";

        ImageInterface image1 = new Image(filename);
        image1.display();

        ImageInterface image2 = new ProxyImage(filename);
        image2.display();
        image2.display();
    }
}
