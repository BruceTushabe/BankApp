package com;
import java.util.Scanner;

class testScanner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the width of the Rectangle: ");
            double width = in.nextDouble();
            System.out.println("Enter the height of the Rectangle: ");
            double height = in.nextDouble();

            double totalArea = width * height;
            System.out.println("THE TOTAL AREA IS: " + totalArea);

        } finally {
            in.close();
        }
    }
}



