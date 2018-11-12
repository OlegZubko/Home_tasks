package com.it;

public class main {

    public static void main(String[] args) {
        Girl girl = new Girl("Ira", 20);
        System.out.println(girl);
        Girl girl1 = new Girl("Kate", 22);
        System.out.println(girl1);
        girl.goToCinima();
        girl1.goToCinima();

        girl.goToRest("Кулиничи");
        girl1.goToRest("Буфет");

        System.out.println(girl.countSumInts(1,2,10));
        girl = null;
        System.gc();
    }

}
