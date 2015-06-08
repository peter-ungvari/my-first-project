package org.example;

public class Hello {

    private int count;

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
        hello.sayHello();
        hello.sayHello();
        hello.sayHello();
        hello.sayHello();
        hello.sayHello();
    }

    String helloMessage() {
        ++ count;
        return "hello" + count;
    }

    public void sayHello() {
        System.out.println(helloMessage());
    }
}
