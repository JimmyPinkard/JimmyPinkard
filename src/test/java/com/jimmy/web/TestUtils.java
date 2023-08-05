package com.jimmy.web;

import java.io.File;
import java.util.Scanner;

public class TestUtils {
    public static String readFile(final String path) {
        StringBuilder contents = new StringBuilder();
        File file = new File(path);
        Scanner scanner;
         try {
             scanner = new Scanner(file);
         } catch (Exception e) {
             return null;
         }
        while(scanner.hasNextLine()) {
            contents.append(scanner.nextLine());
        }
        return contents.toString();
    }
}
