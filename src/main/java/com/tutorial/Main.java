package com.tutorial;


import java.io.*;

/**
 * @author maximilian lamm brain.free.kontakt@gmail.com
 * @project CoustomerOrderTutorial
 */
public class Main {
    public static void main(String[] args) {
        String text = "Hallo user1 bestellt 3 kisten Banane";
        wirteFile(text);
    }

    private static String getPath(){
        return "src/main/resources/log/order.txt";
    }

    private static void wirteFile(String text) {
       try{
           BufferedWriter bw = new BufferedWriter(
                   new FileWriter(getPath()));
           bw.write(readFile() + "\n");
           bw.write(text);
           bw.close();
       }catch(Exception ex){
           ex.printStackTrace();
           return;
       }
    }

    //TODO: read file dont work
    private static String readFile() {
        String txt = "";
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(getPath().toString()));

            while (br.readLine()!=null ){
                txt = br.readLine();
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println(txt);
        return txt;
    }
}
