package com.it;

public class Girl {

    String name;
    int age;

    public Girl(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Girl() {
        System.out.println("Hi! Iam a new Girl");
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinima() {
        System.out.println("go to cinema ok say -" + name);
    }

    public void goToRest(String rest) {
        if ("Кулиничи".equals(rest)) {
            System.out.println(" no say - "+name);

        }else {
            System.out.println(" yes say - "+name);

        }
    }

    public int countSumInts(int... i) {
        int sum = 0;
        for (int i1 : i) {
            sum += i1;
        }
        return sum;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("goodbye my love");;
    }
}
