package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        // get the only object available
        SingleObject obj = SingleObject.getInstance();

        // show message
        obj.showMessage();
    }
}
