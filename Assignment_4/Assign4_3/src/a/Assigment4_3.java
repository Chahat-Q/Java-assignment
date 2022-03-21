package a;

import java.util.Scanner;
import java.io.File;
public class Assigment4_3{
    public static void main(String[] args) {
        File myFile = new File("data");
        try {
            Scanner doubleScanner = new Scanner(myFile);
            double bigDouble = Double.MIN_VALUE; //Initialize with a very small value
            double smallDouble = Double.MAX_VALUE; //Initialize with a very big value
            double currentDouble;
            while (doubleScanner.hasNextDouble()) {
                currentDouble = doubleScanner.nextDouble();
                if (currentDouble > bigDouble) {
                    bigDouble = currentDouble; //find the biggest number in file
                }
                if (currentDouble < smallDouble) {
                    smallDouble = currentDouble; //find the smallest number in the file
                }
            }
            System.out.println("The largest number is " + bigDouble); //print the number outside the while loop
            System.out.println("the smallest number is " + smallDouble);
        } catch (Exception l) {
            System.err.println(l.getMessage());
        }
    }
}