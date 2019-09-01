package com.company;
import java.util.Collections;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Finder {
    private String result;
    private List<String> fileLines;

    public Finder(String fileName) {
        try {
            // check if the file has any lines.
            if (Files.lines(Paths.get(fileName)).count() > 0) {

                //  read the file
                fileLines = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset());

                // Sort the file.
                sortFile();

                // find the middle element.
                findMiddleElement();

                // print the middle element.
                printResult();
            } else {
                // print an empty string if there are no empty lines.
                result = "";
                printResult();
            }

        } catch (Exception e) {
            System.out.println("File not found or file is empty.");
        }
    }
    private void sortFile() {
        Collections.sort(fileLines);
    }
    private void findMiddleElement() {
        float fileSize = fileLines.size();
        result = fileLines.get((int) Math.ceil(fileSize / 2) - 1);
    }
    private void printResult() {
        System.out.println(result);
    }
    public String returnResult() {
        return result;
    }
}
