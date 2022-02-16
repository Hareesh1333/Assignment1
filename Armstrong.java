package com;
/*
 if we take any number , individual no. should be cubed
 and summed among themselves , and we should get same number which we have taken
*/

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        System.out.print("Enter 3 digit number to check whether it is an armstrong number : ");
        Scanner spb = new Scanner(System.in);
        int x = spb.nextInt() , rem , orgnl , otpt = 0;
        orgnl = x;
        while (orgnl != 0){
            rem = orgnl % 10;
            otpt += Math.pow(rem,3);
            orgnl=orgnl/10;
            }
        if (otpt == x){
            System.out.println("It is an Armstrong Number ");
        }
        else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}
