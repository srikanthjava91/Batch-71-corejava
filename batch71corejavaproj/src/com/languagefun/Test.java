package com.languagefun;

public class Test {
    static Test t;

    public static void main(String[] args) {
        Test obj = new Test();
        obj = null;
        System.gc();
        System.out.println(t);
    }

    protected void finalize() {
    	System.out.println("finalize called ");
        t = this;
    }
}