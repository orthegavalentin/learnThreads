package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
      Hello one=new Hello(1000);

     Thread t1=new Thread(one);
     Thread t2=new Thread(one);
     t1.start();
     t2.start();
     t1.join();
     t2.join();

     System.out.println("counter = "+one.getCounter());

    }
}



