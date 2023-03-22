package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Number A: ");
        double a = Double.valueOf(reader.readLine());

        System.out.println("Number B: ");
        double b = Double.valueOf(reader.readLine());

        Calculator c = new Calculator(a,b);


    }
}