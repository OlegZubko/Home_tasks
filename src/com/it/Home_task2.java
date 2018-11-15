package com.it;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Home_task2 {
    public static void main(String[] args) {

        //Task_2
        /*Scanner scan = new Scanner(System.in);
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
        String[] num = vvod.split(" ");*/

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


        //Task_2.9
        //Ввести с консоли n-размерность матрицы a [n] [n].
        //Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Please enter number of dimensions: ");
        Integer n = scan1.nextInt();
        Integer resArray1[][] = new Integer[n][n];
        System.out.println("------ Initial matrix ------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int a = new Random().ints(1, -n, n + 1).findFirst().getAsInt();
                resArray1[i][j] = a;
                System.out.print(resArray1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /*
        Task_2.9.1
        Упорядочить строки (столбцы) матрицы в порядке возрастания значений.
        */
        //Sorted lines
        /*Integer[][] finlinesort = new Integer[n][n];

        for (int i = 0; i < n; i++) {

            System.arraycopy(resArray1[i], 0, finlinesort[i], 0, resArray1.length);
            Arrays.sort(finlinesort[i]);
        }
        System.out.println("------ Matrix with sorted lines ------");
        PrintMatrix(n, finlinesort);*/

        //Sorted columns
        /*Integer columnsort[] = new Integer[n];
        Integer fincolsort[][] = new Integer[n][n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                columnsort[j] = resArray1[j][i];
            }
            Arrays.sort(columnsort);
            for (int j = 0; j < n; j++) {
                fincolsort[j][i] = columnsort[j];
            }
        }
        System.out.println("------ Matrix with sorted columns ------");
        PrintMatrix(n, fincolsort);*/



         /*
        Task_2.9.2
        Выполнить циклический сдвиг заданной матрицы на k позиций
        Сдвиг влево
        */
        /*Integer ShiftLeft[][] = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(resArray1[i], 0, ShiftLeft[i], 0, resArray1.length);
        }
        Scanner scanL = new Scanner(System.in);
        System.out.print("Please enter number for shift left: ");
        int stepL = scanL.nextInt();
        if (stepL > ShiftLeft.length || stepL < 1) {
            System.out.println("Shift is impossible");
        } else {
            int buff;
            for (int r = 0; r < stepL; r++) {
                for (int i = 0; i < ShiftLeft.length; i++) {
                    buff = ShiftLeft[i][0];
                    for (int j = 0; j < ShiftLeft.length - 1; j++) {
                        ShiftLeft[i][j] = ShiftLeft[i][j + 1];
                    }
                    ShiftLeft[i][ShiftLeft.length - 1] = buff;
                }
            }

        }
        System.out.println("------ Shifted left Matrix ------");
        PrintMatrix(n, ShiftLeft);
        System.out.println();*/

        //Сдвиг враво
        /*Integer ShiftRight[][] = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(resArray1[i], 0, ShiftRight[i], 0, resArray1.length);
        }
        Scanner scanR = new Scanner(System.in);
        System.out.print("Please enter number for shift right: ");
        int stepR = scanR.nextInt();
        if (stepR > resArray1.length || stepR < 1) {
            System.out.println("Shift is impossible");

        } else {
            int buff, i, j;
            for (int r = 0; r < stepR; r++) {
                for (i = 0; i < ShiftRight.length; i++) {
                    buff = ShiftRight[i][ShiftRight.length - 1];
                    for (j = ShiftRight.length - 1; j > 0; j--) {
                        ShiftRight[i][j] = ShiftRight[i][j - 1];
                    }
                    ShiftRight[i][0] = buff;
                }
            }

        }
        System.out.println("------ Shifted right Matrix ------");
        PrintMatrix(n, ShiftRight);
        System.out.println();*/

        //Сдвиг вверх
        /*Integer ShiftTop[][] = new Integer[n][n];
        Integer TempShift[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(resArray1[i], 0, ShiftTop[i], 0, resArray1.length);
        }
        Scanner scanT = new Scanner(System.in);
        System.out.print("Please enter number for shift top: ");
        int stepT = scanT.nextInt();
        if (stepT > resArray1.length || stepT < 1) {
            System.out.println("Shift is impossible");
        } else {
            for (int r = 0; r < stepT; r++) {
                TempShift = ShiftTop[0];
                for (int i = 0; i < ShiftTop.length - 1; i++) {
                    ShiftTop[i] = ShiftTop[i + 1];
                }
                ShiftTop[ShiftTop.length - 1] = TempShift;
            }
        }
        System.out.println("------ Shifted top Matrix ------");
        PrintMatrix(n, ShiftTop);
        System.out.println();*/

        //Сдвиг вниз
        Integer ShiftDown[][] = new Integer[n][n];
        Integer TempShift[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(resArray1[i], 0, ShiftDown[i], 0, resArray1.length);
        }
        Scanner scanD = new Scanner(System.in);
        System.out.print("Please enter number for shift down: ");
        int stepD = scanD.nextInt();
        if (stepD > resArray1.length || stepD < 1) {
            System.out.println("Shift is impossible");
        } else {
            for (int r = 0; r < stepD; r++) {
                TempShift = ShiftDown[ShiftDown.length - 1];
                for (int i = ShiftDown.length - 1; i > 0; i--) {
                    ShiftDown[i] = ShiftDown[i - 1];
                }
                ShiftDown[0] = TempShift;
            }
        }
        System.out.println("------ Shifted down Matrix ------");
        PrintMatrix(n, ShiftDown);
        System.out.println();
    }


    private static void PrintMatrix(Integer n, Integer[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
