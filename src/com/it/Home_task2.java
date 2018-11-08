package com.it;

import java.util.Arrays;
import java.util.Scanner;

public class Home_task2 {
    public static void main(String[] args) {

        //Task_2.1, Task_2.2
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter quantity of numbers: ");
        Integer n = scan.nextInt();

        //int intnum[] = new int[n];
        String previous = "";
        String next= "";
        String shortest = "";
        String longest = "";
        String lmed[] =new  "";


        System.out.print("Please enter " + n + " whole numbers: ");
        Scanner scan1 = new Scanner(System.in);
        String vvod = scan1.nextLine();
        String[] num = vvod.split(" ");

        /*for (int i = 0; i < n; i++) {
            intnum[i] = Integer.parseInt(num[i]);
        }*/

        for (int i = n-1; i > 0; i--) {
            for (int i1 = 0; i1 < i; i1++) {
                previous = num[i1];
                next = num[i1 + 1];
                if (previous.length() > next.length()) {
                    String temp = num[i1];
                    num[i1] = num[i1 + 1];
                    num[i1 + 1] = temp;
                }
            }
        }
        shortest = num[0];
        longest = num[n - 1];
        System.out.println(Arrays.toString(num));
        System.out.println("The shortest number: "+ shortest + ", Quantity of digits: " + shortest.length());
        System.out.println("The longest number: "+ longest + ", Quantity of digits: " + longest.length());

        //Task_2.3
        for (int i = n-1; i > 0; i--) {
            for (int i1 = 0; i1 < i; i1++) {
                previous = num[i1];
                next = num[i1 + 1];
                if (previous.length() > next.length()) {
                    String temp = num[i1];
                    num[i1] = num[i1 + 1];
                    num[i1 + 1] = temp;
                }
            }
        }
        shortest = num[0];
        longest = num[n - 1];
        System.out.println(Arrays.toString(num));
        System.out.println("The shortest number: "+ shortest + ", Quantity of digits: " + shortest.length());
        System.out.println("The longest number: "+ longest + ", Quantity of digits: " + longest.length());
    }
}
