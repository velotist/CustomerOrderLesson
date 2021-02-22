package com.tutorial;


import java.io.*;

/**
 * @author maximilian lamm brain.free.kontakt@gmail.com
 * @project CoustomerOrderTutorial
 */

public class Main {
    public static void main(String[] args) {
        String text = "Hallo user 4 bestellt 3 Kisten Banane + 5 Äpfel + 71 Erdbeeren";
        wirteFile(text);
    }

    private static File getFile() {
        return new File("src/main/resources/log/order.txt");
    }

    private static void wirteFile(String text) {
        try {
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(getFile(), true)));

            bw.write(text + "\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
