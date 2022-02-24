package com.GTN;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Mini Project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber;

        do{
            System.out.println("Guess The Number: ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber) {
                System.out.println("WOOHOO... CORRECT NUMBER");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        }while (userNumber >= 0);
    }
}
