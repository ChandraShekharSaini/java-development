package Printer;

import java.io.*;

public class PrinterE {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Java Development\\IO\\Printer\\Baba.txt";

        FileWriter fr = new FileWriter(path , true);
        PrintWriter pwriter = new PrintWriter(fr);

        pwriter.println("I am Java Developer");
        pwriter.println(1222);
        pwriter.println(true);
        pwriter.println("I am Java Development Close");
        pwriter.println("I am Pyhon Development Close");

        pwriter.close();

    }
}
