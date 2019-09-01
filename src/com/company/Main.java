package com.company;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0) {
            Finder finder = new Finder("src/com/company/file.txt");
        } else {
            Finder finder = new Finder(args[0]);
        }
    }
}









