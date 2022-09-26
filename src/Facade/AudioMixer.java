package Facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("AudioFixer: fixing audio...");
        return new File("tmp");
    }
}
