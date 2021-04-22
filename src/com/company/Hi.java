package com.company;

public class Hi implements Runnable{
      private int numberOfTimes;
     public Hi(int numberOfTimes)
     {
         this.numberOfTimes=numberOfTimes;
     }

    public void run() {
        for(int i=0;i<numberOfTimes;i++){

            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
