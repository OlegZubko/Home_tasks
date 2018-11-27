package com.it;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;

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


        MatrixGeneration matrixGeneration = new MatrixGeneration().invoke();
        Integer n = matrixGeneration.getN();
        int[][] resArray1 = matrixGeneration.getResArray1();

        sorter(n, resArray1); //Task_2.9.1
        shiftMatrix(n, resArray1); //run Task_2.9.2
        //inDecrease(resArray1); //run Task_2.9.3
        //sumElements(resArray1); //run Task_2.9.4
        //rotateMatrix(resArray1);//run Task_2.9.5
        //arithmeticAvg(resArray1);//run Task_2.9.6
        //tightenMatrix();//run Task_2.9.7
        //zeroElementsEnd(resArray1);//run Task_2.9.8

    }

    /*Task_2.9.1
    Упорядочить строки (столбцы) матрицы в порядке возрастания значений. */
    private static void sorter(Integer n, int[][] resArray1) {
        Scanner scanSort = new Scanner(System.in);
        System.out.print("Please select what you would like to sort: " + "\n" + "Sort line => 1" + "\n" + "Sort columns => 2" + "\n");
        int sort = scanSort.nextInt();
        int[][] finlinesort = new int[n][n];
        int columnsort[] = new int[n];
        int[][] fincolsort = new int[n][n];
        switch (sort) {
            case 1: //Sorted lines
                for (int i = 0; i < n; i++) {
                    System.arraycopy(resArray1[i], 0, finlinesort[i], 0, resArray1.length);
                    Arrays.sort(finlinesort[i]);
                }
                System.out.println("------ Matrix with sorted lines ------");
                PrintMatrix(n, finlinesort);
                break;
            case 2://Sorted columns
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
                PrintMatrix(n, fincolsort);
                break;
            default:
                System.out.println("Impossible to sort, please use 1 or 2 to chose sort of lines or sort of columns!");
        }
        System.out.println();
    }

    /* Task_2.9.2
    Выполнить циклический сдвиг заданной матрицы на k  */
    private static void shiftMatrix(Integer n, int[][] resArray1) {
        Scanner scanShift = new Scanner(System.in);
        System.out.print("Please enter where you would like to shift Matrix: " + "\n" + "Shift left => 1" + "\n" + "Shift right => 2" + "\n" + "Shift top => 3" + "\n" + "Shift bottom => 4 " + "\n");
        int shift = scanShift.nextInt();
        Scanner scanL = new Scanner(System.in);
        System.out.print("Please enter number of positions to shift: ");
        int step = scanL.nextInt();
        int buff;
        if (step > resArray1.length || step < 1) {
            System.out.println("Shift is impossible");
        } else {
            switch (shift) {
                case 1: //shift left
                    for (int r = 0; r < step; r++) {
                        for (int i = 0; i < resArray1.length; i++) {
                            buff = resArray1[i][0];
                            System.arraycopy(resArray1[i], 1, resArray1[i], 0, resArray1.length - 1);
                            resArray1[i][resArray1.length - 1] = buff;
                        }
                    }
                    System.out.println("------ Shifted left Matrix ------");
                    PrintMatrix(n, resArray1);
                    System.out.println();
                    break;
                case 2: //shift right
                    for (int r = 0; r < step; r++) {
                        for (int i = 0; i < resArray1.length; i++) {
                            buff = resArray1[i][resArray1.length - 1];
                            System.arraycopy(resArray1[i], 0, resArray1[i], 1, resArray1.length - 1);
                            resArray1[i][0] = buff;
                        }
                    }
                    System.out.println("------ Shifted right Matrix ------");
                    PrintMatrix(n, resArray1);
                    System.out.println();
                    break;
                case 3: //shift top
                    int TempShift[];
                    for (int r = 0; r < step; r++) {
                        TempShift = resArray1[0];
                        System.arraycopy(resArray1, 1, resArray1, 0, resArray1.length - 1);
                        resArray1[resArray1.length - 1] = TempShift;
                    }
                    System.out.println("------ Shifted top Matrix ------");
                    PrintMatrix(n, resArray1);
                    System.out.println();
                    break;
                case 4: //shift bottom
                    for (int r = 0; r < step; r++) {
                        TempShift = resArray1[resArray1.length - 1];
                        for (int i = resArray1.length - 1; i > 0; i--) {
                            resArray1[i] = resArray1[i - 1];
                        }
                        resArray1[0] = TempShift;
                    }
                    System.out.println("------ Shifted down Matrix ------");
                    PrintMatrix(n, resArray1);
                    System.out.println();
                    break;
                default:
                    System.out.println("Shift is impossible, please use 1-4 for direction to shift!");
                    break;

            }
        }
    }

    /*Task_2.9
    Ввести с консоли n-размерность матрицы a [n] [n].
    Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.*/
    static class MatrixGeneration {
        private Integer n;
        private int[][] resArray1;

        public Integer getN() {
            return n;
        }

        public int[][] getResArray1() {
            return resArray1;
        }

        public MatrixGeneration invoke() {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Please enter number of dimensions: ");
            n = scan1.nextInt();
            resArray1 = new int[n][n];
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
            return this;
        }
    }

    //Task_2.9.3
    /*Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.*/
    private static void inDecrease(int[][] b) {
        int[] oneDimArray = new int[b.length * b.length];
        int c = 0, r = 0, max = 0, h = 0, m = 0, min = 0, h1 = 0;
        for (int[] x : b) {
            for (int z : x) {
                oneDimArray[c++] = z;
            }
        }
        for (int i = 0; i < oneDimArray.length - 1; i++) {
            if (oneDimArray[i] < oneDimArray[i + 1]) {
                r += 1;
                if (r > max) {
                    max = r;
                    h = i + 1;
                }
            } else {
                r = 0;
            }
            if (oneDimArray[i] > oneDimArray[i + 1]) {
                m += 1;
                if (m > min) {
                    min = m;
                    h1 = i + 1;
                }
            } else {
                m = 0;
            }
        }
        int[] maxIncSeq = new int[max + 1];
        int[] maxDecSeq = new int[min + 1];
        System.arraycopy(oneDimArray, (h - max), maxIncSeq, 0, (max + 1));
        System.arraycopy(oneDimArray, (h1 - min), maxDecSeq, 0, (min + 1));
        System.out.println("Max sequence elements which are increasing: ");
        System.out.println((max + 1) + " element(s)" + " -> " + Arrays.toString(maxIncSeq));
        System.out.println("Max sequence elements which are decreasing: ");
        System.out.println((min + 1) + " element(s)" + " -> " + Arrays.toString(maxDecSeq));
    }

    //Task_2.9.4
    /*Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.*/
    private static void sumElements(int[][] resArray1) {
        int posElements[] = new int[2];
        int el, n, sum, j;
        System.out.println("Sum of elements between first two positive elements:");
        for (int i = 0; i < resArray1.length; i++) {
            el = 0;
            n = 0;
            j = 0;
            sum = 0;
            posElements[1] = 0;
            while (el != 2 & j != resArray1.length) {
                if (resArray1[i][j] > 0) {
                    posElements[n] = j;
                    n++;
                    el++;
                }
                j++;
            }
            if (posElements[1] != 0) {
                if (posElements[0] != posElements[1] - 1) {
                    for (int k = posElements[0] + 1; k < posElements[1]; k++) {
                        sum += resArray1[i][k];
                    }
                    System.out.println("Line " + i + ": Sum = " + sum);
                } else {
                    System.out.println("Line " + i + ": Sum = 00");
                }

            } else {
                System.out.println("Line " + i + ": doesn't contain two positive elements");
            }
        }

    }

    /*Task_2.9.5.
    Повернуть матрицу на 90 (180, 270) градусов против часовой стрелки.*/
    private static void rotateMatrix(int[][] resArray1) {
        System.out.print("Please select rotation in degree to left( 90 or 180 or 270) and enter it: ");
        Scanner scan = new Scanner(System.in);
        Integer rotation = scan.nextInt();
        int temp[][] = new int[resArray1.length][resArray1.length];

        if (rotation == 90 || rotation == 180 || rotation == 270) {
            for (int i = 0; i < resArray1.length; i++) {
                for (int j = 0; j < resArray1.length; j++) {
                    switch (rotation) {
                        case 90:
                            temp[3 - j][i] = resArray1[i][j];
                            break;
                        case 180:
                            temp[Math.abs(i - (resArray1.length - 1))][Math.abs(j - (resArray1.length - 1))] = resArray1[i][j];
                            break;
                        case 270:
                            temp[j][resArray1.length - 1 - i] = resArray1[i][j];
                            break;
                    }
                }
            }
            System.out.println("Matrix rotated for " + rotation + " degree");
            PrintMatrix(resArray1.length, temp);
        } else {
            System.out.println("You entered incorrect value, please use 90 or 180 or 270.");
        }

    }

    /*Task_2.9.6
    Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.*/
    private static void arithmeticAvg(int[][] resArray1) {
        for (int i = 0; i < resArray1.length; i++) {
            int arithmeticAvg = IntStream.of(resArray1[i]).sum() / resArray1.length;
            System.out.println("Arithmetic average for line " + i + " is equal to " + arithmeticAvg);
            for (int j = 0; j < resArray1.length; j++) {
                resArray1[i][j] = resArray1[i][j] - arithmeticAvg;
            }
        }
        System.out.println("New matrix in which from each element subtracted arithmetical average of its line:");
        PrintMatrix(resArray1.length, resArray1);
    }

    /*Task_2.9.7.
    Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.*/
    private static void tightenMatrix() {
        //int testMatrix[][] = new int[n][n];
        int n = 4;
        int testMatrix[][] = {{0, 3, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 65, 0, 0}};
        int zeroLine[] = new int[n];
        int zeroColumn[] = new int[n];
        int zeroLineEl, zeroColEl;
        int l = 0;
        int c = 0;
        System.out.println("Initial matrix:");
        PrintMatrix(n, testMatrix);
        /*for (int i = 0; i < zeroLine.length; i++) {
            zeroLine[i] = -1;
            zeroColumn[i] = -1;
        }*/
        for (int i = 0; i < testMatrix.length; i++) {
            zeroLineEl = 0;
            zeroColEl = 0;
            for (int j = 0; j < testMatrix.length; j++) {
                if (testMatrix[i][j] == 0) {
                    zeroLineEl++;
                }
                if (testMatrix[j][i] == 0) {
                    zeroColEl++;
                }
            }
            if (zeroLineEl != testMatrix.length) {
                zeroLine[l] = i;
                l++;
            }
            if (zeroColEl != testMatrix.length) {
                zeroColumn[c] = i;
                c++;
            }
        }
        System.out.println("Result Matrix with removed lines and columns which contain only zeroes:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(testMatrix[zeroLine[i]][zeroColumn[j]] + " ");
            }
            System.out.println();
        }
    }

    /*Task_2.9.8.
    Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных.*/
    private static void zeroElementsEnd(int[][] resArray1) {
        int nullEl = 0;
        int notNullEl;
        System.out.println("Refactor lines of matrix so elements equal to 0, moved to the end of line");
        for (int i = 0; i < resArray1.length; i++) {
            for (int j = 0; j < resArray1.length; j++) {
                if (resArray1[i][j] == 0 && j < resArray1.length - 1) {
                    notNullEl = 0;
                    for (int m = j + 1; m < resArray1.length; m++) {
                        if (resArray1[i][m] != 0) {
                            notNullEl++;
                        }
                    }
                    if (notNullEl > 0) {
                        while (resArray1[i][j] == 0) {
                            nullEl++;
                            for (int k = j; k < resArray1.length - 1; k++) {
                                resArray1[i][k] = resArray1[i][k + 1];
                            }
                            resArray1[i][resArray1.length - 1] = 0;

                        }
                    }
                }
            }

        }

        if (nullEl != 0) {
            System.out.println("Matrix with elements equal to 0 are shifted to the end of line:");
            PrintMatrix(resArray1.length, resArray1);
        } else {
            System.out.println("Matrix doesn't need to be changed:");
            PrintMatrix(resArray1.length, resArray1);

        }
    }

    private static void PrintMatrix(Integer n, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
