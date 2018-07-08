package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();

        for (Iterator itr = repo.getIterator(); itr.hasNext();) {
            String name = (String)itr.next();
            System.out.println("Name: " + name);
        }
    }
}
