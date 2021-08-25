package br.edu.ifpb.domain.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ImageFromFile {

    private final Path path;
    public ImageFromFile(String path) {
        this(Paths.get(path));
    }
    public ImageFromFile(Path path) {
        this.path = path;
    }
    public byte[] toBytes(){
        try {
            return Files.readAllBytes(path);
        }catch (IOException ex){
            return new byte[0];
        }
    }
}
