package bpack;

import apack.A;

public class B extends A {

    public B(int a, int b, int c) {
        super(a, b, c);
    }

    public void display() {
        System.out.println("Class B (Using Inheritance)");

        System.out.println("Public: " + pubVar);
        System.out.println("Protected: " + protVar);

        System.out.println("Private (via method): " + getPrivVar());
    }
}
