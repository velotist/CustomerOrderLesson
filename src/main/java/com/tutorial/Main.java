package com.tutorial;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author maximilian lamm brain.free.kontakt@gmail.com
 * @project CoustomerOrderTutorial
 */
public class Main {
    public static void main(String[] args) throws IOException {
        wirteFile();
    }

    private static void wirteFile() throws IOException {
        System.out.println("hier wird eine Datei gelesen" + getPath().toString() + " order.text");
    }

    private static Path getPath(){
        return Paths.get("/resources/");
    }
}
