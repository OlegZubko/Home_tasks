package com.it;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Home_tasks {
    public static void main(String[] args) {
//Task_1
        //Task_1.1
        /*System.out.println("Please enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name + ", glad to see you");*/
        //Task_1.2
        /*System.out.println("Please enter number");

        Scanner scan = new Scanner(System.in);
        String a1 = scan.nextLine();
        for (int i = a1.length() - 1; i >= 0; i--) {
            System.out.print(Integer.parseInt("" + (char) a1.getBytes()[i]));
        }
        System.out.println();*/

        //Task_1.3
        /*System.out.println("Please enter quantity of random numbers");

        Scanner scan = new Scanner(System.in);
        Integer a1 = scan.nextInt();
        Random rand = new Random();
        for (int i = 0; i < a1; i++) {
            System.out.print(" " + rand.nextInt(100));
        }
        System.out.println();
        for (int i = 0; i < a1; i++) {
            System.out.println(" " + rand.nextInt(100));
        }*/
        //Task_1.4
        /*String origin_pass = "qwerty";

        System.out.println("Please enter password");
        Scanner scan = new Scanner(System.in);
        String pass = scan.next();
        //Boolean res = (origin_pass.equals(pass));
        if ((origin_pass.equals(pass)) == true) {
            System.out.println("Password is correct");

        } else {
            System.out.println("Password is incorrect");
        }*/

        //Task_1.5
       /* Integer sum = 0;
        Integer product = 1;

        System.out.print("Please enter whole numbers:");
        Scanner scan = new Scanner(System.in);
        String vvod = scan.nextLine();
        String[] col = vvod.split(" ");
        for (int i = 0; i <col.length ; i++) {
            sum = sum + Integer.parseInt(col[i]);
            product = product * Integer.parseInt(col[i]);
        }
        System.out.println("Summa of numbers = "+ sum);
        System.out.println("Product of numbers = "+ product);*/

        //Task_1.6

        //int n = 4;
        /*Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number: ");
        Integer n = scan.nextInt();

        String[] even = new String[n];
        String[] odd = new String[n];
        int intnum[] = new int[n];

        System.out.print("Please enter " + n + " whole numbers: ");
        Scanner scan1 = new Scanner(System.in);
        String vvod = scan1.nextLine();
        String[] num = vvod.split(" ");

        for (int i = 0; i < n; i++) {
            intnum[i] = Integer.parseInt(num[i]);
        }*/
        //System.out.println(Arrays.toString(intnum));

        //Task_1.6.1
        //Even numbers
        /*System.out.print("Even nnumbers: ");
        for (int i = 0; i < n; i++) {

            if (Integer.parseInt(num[i]) % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        }

        //Odd numbers
        System.out.println();
        System.out.print("Odd nnumbers: ");
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(num[i]) % 2 != 0) {
                System.out.print(num[i] + " ");
            }
        }*/

        //Task_1.6.2
        //Max and min numbers
        /*for (int i = intnum.length-1; i > 0; i--) {
            for (int i1 = 0; i1 < i; i1++) {
                if (intnum[i1] > intnum[i1+1]) {
                    int temp=intnum[i1];
                    intnum[i1]=intnum[i1+1];
                    intnum[i1+1]=temp;
                }
            }
        }
        //System.out.println(Arrays.toString(intnum));
        System.out.println("Min element: " + String.valueOf(intnum[0]));
        System.out.println("Max element: " + String.valueOf(intnum[n-1]));*/

        //Task_1.6.3
        //Divider 3
       /* System.out.print("Divider 3: ");
        for (int i = 0; i < n; i++) {

            if (intnum[i] % 3 == 0) {
                System.out.print(intnum[i] + " ");
            }
        }
        System.out.println();

        //Divider 9
        System.out.print("Divider 9: ");
        for (int i = 0; i < n; i++) {

            if (intnum[i] % 9 == 0) {
                System.out.print(intnum[i] + " ");
            }
        }
        System.out.println();*/

        //Task_1.6.4
        //Divider 5 and 7
        /*System.out.print("Divider 5 and 7: ");
        for (int i = 0; i < n; i++)  {

            if ((intnum[i] % 5 == 0) && ((intnum[i] % 7 == 0)) ) {
                System.out.print(intnum[i] + " ");
            }
        }
        System.out.println();*/




        //Task_1.6.6
        //Lucky numbers
        /*int m = 4;
        int temp[] = new int[m];
        System.out.print("Please enter " + n + " whole numbers which containe " + m + " digits: ");
        Scanner scan2 = new Scanner(System.in);
        String lnvvod = scan2.nextLine();
        String[] lnum = lnvvod.split(" ");

        System.out.print("Lucky number(s): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[j] = lnum[i].getBytes()[j];
            }
            if ((temp[1] + temp[0]) == (temp[3] + temp[2])) {
                System.out.print(lnum[i] + " ");
            }
        }
        System.out.println();*/

        //Task_1.6.7
        //
        /*System.out.print("Elements equal to half summa of neighbors: ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (intnum[i] == (intnum[i + 1] / 2)) {
                    System.out.print(intnum[i] + " ");
                }
            } else if (i == (n-1)) {
                if (intnum[i] == (intnum[i - 1] / 2)) {
                    System.out.print(intnum[i] + " ");
                }
            } else {
                if (intnum[i] == ((intnum[i - 1] + intnum[i + 1]) / 2)) {
                    System.out.print(intnum[i] + " ");
                }
            }

        }*/
    }
}
