package com;
import java.util.Scanner;

public class bankapp {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerId' to access your Bank Account");
        String name = sc.nextLine();
        String customerId = sc.nextLine();
        BankAccount obj1 = new BankAccount(name, customerId);
        obj1.menu();
    }

}

class BankAccount{
    double bal;
    double prevTrans;
    String customerName;
    String customerId;

    BankAccount(String customerName, String customerId){
        this.customerName = customerName;
        this.customerId = customerId;
    }

    void deposit(double amount){
        if(amount!= 0){

        bal+=amount;
        prevTrans=amount;
        }
    }
    
    void withdraw(double amt){

        if(amt!=0 && bal>=amt){
            bal-=amt;
            prevTrans=-amt;
        }
        else if(bal<amt){
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTrans(){
        if(prevTrans>0){
            System.out.println("Deposited: " +prevTrans); 
        }
        else if(prevTrans<0){
            System.out.println("Withdrawn: " +Math.abs(prevTrans));
        }
        else {
            System.out.println("No Transaction occured");
        }
    }

    void menu(){
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("This is Your ID:"+customerId);
        System.out.println("\n");
        System.out.println("Choose of the following Options to Proceed:");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");

        do{
            System.out.println("********************************************");
            System.out.println("Please Enter one option: ");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch(option){
                case 'a':
                System.out.println("......................");
                System.out.println("Balance ="+bal);
                System.out.println("......................");
                System.out.println("\n");
                break;

                case 'b':
                System.out.println("......................");
                System.out.println("Enter amount to deposit: ");
                System.out.println("......................");
                double amt = sc.nextDouble();
                deposit(amt);
                System.out.println("\n");
                break;

                case 'c':
                System.out.println();
                System.out.println();
                System.out.println();
                double amtW = sc.nextDouble();
                withdraw(amtW);
                System.out.println("\n");
                break;

                case 'd':
                System.out.println("........................");
                System.out.println("Previous Transaction");
                getPreviousTrans();
                System.out.println("......................");
                System.out.println("\n");
                break;

                case 'e':
                System.out.println("....................");
                break;

                default:
                System.out.println("Choose correct option to proceed");
                break;

            }
        } while (option!= 'e');

        System.out.println("Thank for using our banking services");
    }

}