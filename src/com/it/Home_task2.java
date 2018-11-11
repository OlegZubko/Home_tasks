package com.it;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Home_task2 {
    public static void main(String[] args) {

        //Task_2
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter quantity of numbers: ");
        Integer n = scan.nextInt();

        String previous = "";
        String next = "";
        String shortest = "";
        String longest = "";
        int medlength = 0;
        //int intnum[] = new int[n];

        System.out.print("Please enter " + n + " whole numbers: ");
        Scanner scan1 = new Scanner(System.in);
        String vvod = scan1.nextLine();
        String[] num = vvod.split(" ");

        /*for (int i = 0; i < n; i++) {
            intnum[i] = Integer.parseInt(num[i]);
        }*/

        //Task_2.1, Task_2.2
        //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        //Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.
        /*for (int i = n-1; i > 0; i--) {
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
        System.out.println("The longest number: "+ longest + ", Quantity of digits: " + longest.length());*/

        //Task_2.3
        //Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
        /*for (int i = 0; i < n; i++) {
            medlength += num[i].length();
        }
        System.out.println("Medium length = "+ (medlength = medlength / n));
        System.out.println();
        System.out.println("Numbers with length less than medium length:");
        for (int i = 0; i < n; i++) {
            if (num[i].length() < medlength) {
                System.out.println("Number: " + num[i] + ", Length: " + num[i].length());
            }
        }
        System.out.println();
        System.out.println("Numbers with length more than medium length:");
        for (int i = 0; i < n; i++) {
            if (num[i].length() > medlength) {
                System.out.println("Number: " + num[i] + ", Length: " + num[i].length());
            }
        }*/

        //Task_2.6
        //Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        /*boolean find = false;
        int i = 0;

        while (!find) {
            String[] sorttemp = num[i].split("");
            String[] temp = num[i].split("");
            Arrays.sort(sorttemp);
            if (Arrays.equals(temp, sorttemp)) {
                System.out.println("Number with digits are in ascending order: " + String.join("", temp));
                find = true;
            }
            if (i == (num.length - 1)) {
                find = true;
            }
            i++;
        }*/

        //Task_2.7
        //Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

        //Task_2.8
        //Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.
        /*int k = (int) Math.sqrt(n);
        int[][] resArray = new int[k][k];
        int a = 0;
        System.out.println("Result massive NxN");
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                a = (k * i) + j;
                resArray[i][j] = Integer.parseInt(num[a]);
                System.out.print(resArray[i][j] + " ");
            }
            System.out.println();
        }*/
        /*int[][] resArray = new int[n][n];
        int a = 0;
        System.out.println("Result massive NxN");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a++;
                resArray[i][j] = a;
                System.out.print(resArray[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}
