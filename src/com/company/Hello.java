package com.company;

public class Hello implements Runnable{
    private int numberOfTimes;
    private int counter=0;
    public Hello(int numberOfTimes)
    {
        this.numberOfTimes=numberOfTimes;
    }

    public synchronized void  increment(int i){
        this.counter++;


    }
    public int getCounter(){
        return this.counter;
    }
    public void run() {
        for(int i=0;i<numberOfTimes;i++){

          this.increment(i);
        }
    }
}
