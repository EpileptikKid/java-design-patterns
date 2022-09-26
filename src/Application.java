package Facade;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4video = converter.convertVideo("youtube.ogg", "mp4");
    }
}
