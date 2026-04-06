package cpack;

import apack.A;

public class C {

    public void display() {

        A obj = new A(10, 20, 30);

        System.out.println("Class C (Without Inheritance)");

        System.out.println("Public: " + obj.pubVar);

        System.out.println("Private (via method): " + obj.getPrivVar());
    }
}
