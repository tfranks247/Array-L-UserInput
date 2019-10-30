package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList <Double> inputs = new ArrayList<Double>();

        System.out.println("Enter some numbers and type any string to see inputs: ");
        while (in.hasNextDouble()) {
            inputs.add(in.nextDouble());
        }
        System.out.println(inputs);
	// write your code here
    }
}
