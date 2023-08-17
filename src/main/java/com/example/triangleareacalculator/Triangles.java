package com.example.triangleareacalculator;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Triangles {
    static List<String> loadFromFile(String name){
        List<String> lines;
        try{
            lines = Files.readAllLines(Path.of(name));
        }
        catch(Exception e){
            return null;
        }
        return lines;
     }
}
