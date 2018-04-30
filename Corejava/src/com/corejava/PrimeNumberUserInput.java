package com.corejava;

import java.util.Scanner;

public class PrimeNumberUserInput {
   
        public static void main(String args[]) { //forgot to add main
            System.out.println("This program takes the user input and prints the prime numbers until that number");
            System.out.println ("Enter Number:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for(int i=2;i<num;i++){
              for(int j=2; j<i; j++){
                if(num%j == 0){
                  System.out.print(" ");
                }
                else{
                  System.out.print(i);
                }
              }
            }
        }
    }



