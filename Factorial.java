package com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        /* Factorial of n is n! = 1.2.3....(n-1).n
                 n should be >= 0 */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= num){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of "+ num + " : " + factorial);
    }
}
