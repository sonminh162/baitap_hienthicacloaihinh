package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("-menu-");
        System.out.println("1.print the rectangle");
        System.out.println("2.print the square triangle(top-left,top-right,botton-left,botton-right)");
        System.out.println("3.print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int i,j;
        switch(choice){
            case 1:
                for(i=1;i<=3;i++) {
                    for (j = 1; j <= 7; j++) System.out.print("*");
                    System.out.println("");
                }
                break;
            case 2:
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                System.out.printf("\n\n\n");
                for(i=1;i<=5;i++){
                    for(j=5;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for(i=1;i<=5;i++){
                    for(j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for(i=1;i<=6;i++){System.out.print("*");}
                System.out.println("");
                for(i=1;i<=5;i++){
                    for(j=5;j>=i;j--){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
