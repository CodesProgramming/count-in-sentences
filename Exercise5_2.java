package exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise5_2 {

    public static void main(String[] args) {
        final String FILE_PATH = "E:/lab3_2.txt";
        
        File file = new File(FILE_PATH);

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String s = scan.nextLine();
                lines++;
                characters += s.length();
                words = s.split("\\s+").length;
            }
            
            System.out.println("Characters: " + characters);
            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
            
        } catch (FileNotFoundException fnfe) {
            System.out.println("Cannot read" + FILE_PATH + "file!");
        }
        

    }
}
