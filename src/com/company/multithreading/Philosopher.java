package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Philosopher extends Thread{
    private int philosopherNumber;
    private Fork leftFork;
    private Fork rightFork;

    Philosopher(int philosopherNumber, Fork leftFork, Fork rightFork) {
        this.philosopherNumber = philosopherNumber;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void run(){
        System.out.println(" Philosopher " + philosopherNumber);

        while (true) {
            leftFork.grab();
            System.out.println(" Philosopher " + philosopherNumber + " grabs left fork.");
            rightFork.grab();
            System.out.println(" Philosopher " + philosopherNumber + " grabs right fork.");
            this.eat();
            leftFork.release();
            System.out.println(" Philosopher " + philosopherNumber + " releases left fork.");
            rightFork.release();
            System.out.println(" Philosopher " + philosopherNumber + " releases right fork.");
        }
    }

    private void eat() {
        try {
            int sleepTime = ThreadLocalRandom.current().nextInt(0, 1000);
            System.out.println(" Philosopher " + " eats for " + sleepTime);
            Thread.sleep(sleepTime);
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
