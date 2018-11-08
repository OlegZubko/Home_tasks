package com.it;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {

        //    public static void main(String[] args) {
//        System.out.println(Arrays.toString(" 100    ml " //вывод строки без пробелов
//                .trim()
//                .split("\\s+")));
//    }
//    public static void main(String[] args) {
////        System.out.println(" 100    ml "
////                .trim()  //убирает пробелы по краям      вывод строки 100
////                .split("\\s+") [0]);
////    }
//        String s = " 100    ml "
//                .trim()  //убирает пробелы по краям      вывод строки 100
//                .split("\\s+") [0];
//        System.out.println(s);
//        int i = Integer.parseInt(s);
//        System.out.println(i+10);
//        String b = "12.3";                                //parsing String
//        double v = Double.parseDouble(b);
//        System.out.println(v+0.1);
//
//        int a=100;
//        String s1 = String.valueOf(a);
//        String s2 = ""+a;                      //перевод в строку
        //}
//    public static void main(String[] args) {
//        //System.out.println(System.currentTimeMillis() + "@gmail.com");       // generate email
//       String collect = new Random()
//                .ints('A', 'z')
//                .mapToObj(s->""+(char) s)// преобраз в строки
//                .limit(5)
//               // .forEach(s->System.out.print(s+ " ")); // write
//               .collect(Collectors.joining(" ")); //собираем в строку
//        System.out.println(collect);
//    }
//    public static void main(String[] args) {
//        //System.out.println("4/2=" + 4 / 2 == "4/2=2"); //true
//        System.out.println("asd".equals("asd"));
//        System.out.println("asd"=="asd"); //неправильно                //сравнение строк
//        String a = "aaa";
//        String b = new String("aaa");
//        System.out.println(a.equals(b));
//        System.out.println(a==b); //неправильно
//    }
//    public static void main(String[] args) {
////        byte b1 =50, b2 = -99;
////        short k = b1 + b2;
////        System.out.println("k =" + k);
////    }
//    public static void main(String[] args) {
//        byte b1 =50, b2 = 99;
//        byte k = b1 + b2;
//        System.out.println("k =" + k);
//    }

        /*String s =" 100    ml "
                .trim()
                .split("\\s+")[0];
        System.out.println(s);
        int i = Integer.parseInt(s);
        System.out.println(i+10);
        String b = "12.3";
        double v = Double.parseDouble(b);
        System.out.println(v+1.1);
        System.out.println(b+1.1);
        int a = 100;
        String s1 = String.valueOf(a);
        String s2 = "" + a;
        System.out.println(s2);*/

        /*System.out.println(System.currentTimeMillis() + "@gmail.com");*/

        /*String collect = new Random()
                .ints('1', 'z')
                .mapToObj(s -> "" + (char) s)
                .limit(25)
                //.forEach(s->System.out.println(s+ " "));
                .collect(Collectors.joining(" "));
        System.out.println(collect);*/

        //System.out.println("4/2="+4/2=="4/2=2");

        /* System.out.println("asd".equals("asd"));
        System.out.println("asd"==("asd"));
        String a = "aaa";
        String b = new String("aaa");
        System.out.println(a.equals(b));
        System.out.println(a==b);*/
        /*byte b1 = 50, b2 = 99;
        byte k = (byte) (b1 + b2);
        System.out.println("k="+k);*/

        /*int  a= 26;
        if (a>=18 &&  a<20) {
            System.out.println("hi");
        }else if (a>=20 & a<=25){
            System.out.println("hi hi hi");
        }
        else {
            System.out.println("bye");
        }*/

        /*int age = 21;
        if (age>=3 & age<=6) {
            System.out.println("kg");
                  }
        else if (age>=7 & age<=17)
            {
                System.out.println("school");
            }
            else if (age>=17 & age<=22)
            {
                System.out.println("Un");
        }*/

        /*int a = 2;
        switch (a) {

            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("bye");
        }*/

        /*int a = 0;
        while (a<10) {
            System.out.println("hi");
            a++;
        }*/

        /*int a=12;
        do {
            System.out.println("hi");
            a++;
        } while (a<10);*/

        /*int a=100;
        int b=300;
        while (++a<--b);
        System.out.println(a);*/
        /*for (int i = 0; i <100 ; i++) {
            System.out.println("i = " + i);
        }*/

        /*int[] a = {10, 20, 30, 40, 50, 60};
         *//*for (int i = 0; i < a.length; i++) {
            System.out.println("i = " + a[i]);
        }
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println("i = " + a[i]);
        }*//*
        for (int i : a) {
            System.out.println("i = " + i);
        }*/

        /*for (int i = 0; i <= 100; i++) {
            if (i%2==0) {
                System.out.println("i = " + i);
            }

        }*/
        /*int a=100;
        do {
            System.out.println(a);
            a++;
        } while (a<100);*/

        /*int a=0;
        while (a<101) {
            if (a%2==0);{
            System.out.println(a);
        }}*/

        /*int a1[]={1,2,3};
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
        */

         /*for (int i = 0; i < 10; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }*/

        /*System.out.println(Arrays.toString(args));
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);

        }*/
        /*int a[]={1,2,3,4,5,6,7};
        int a1[]={1,2,3,4};

        System.out.println(Arrays.toString(a));
        revers(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(a1));
        revers(a1);
        System.out.println(Arrays.toString(a1));

    }

    private static void revers(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }*/

        //Сортировка

        /*int a[]={2,4,5,3,1};
        System.out.println(Arrays.toString(a));

        for (int i = a.length-1; i > 0; i--) {
            for (int i1 = 0; i1 < i; i1++) {
                if (a[i1]>a[i1+1]) {
                    int temp=a[i1];
                    a[i1]=a[i1+1];
                    a[i1+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));*/


        /*System.out.println("123".getBytes().length);
        System.out.println("123".getBytes()[0]);
        System.out.println(Integer.parseInt(""+(char) "123".getBytes()[0]));
        */
    }
}
