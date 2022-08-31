package com;

import java.util.Scanner;

public class scanned{

    public static void  main (String[] args) {

    Scanner yes = new Scanner(System.in);
    System.out.println("Enter Your Name: ");
    String name = yes.nextLine();
    
    System.out.println("Enter Your Location: ");
    String location = yes.nextLine();

    System.out.println("Enter Your Phone Number: ");
    int phone = yes.nextInt();
    
}
}

