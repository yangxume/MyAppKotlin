package com.xy.myappkotlin;

public class LambdaTest {

    public void main(String [] args){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        thread1.start();

        Thread thread2 = new Thread(() -> System.out.print("hello2"));
        thread2.start();

    }

}
