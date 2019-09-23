package com.company;

public class Main {
    private static int philosophersNumber = 4;
    private static Philosopher[] philosophers = new Philosopher[philosophersNumber];
    private static Fork[] forks = new Fork[philosophersNumber];

    public static void main(String[] args) {
        System.out.println("Dining philosophers problem.");

        for (int i = 0; i < philosophersNumber; i++) {
            forks[i] = new Fork();
        }

        for (int i = 0; i < philosophersNumber; i++) {
            philosophers[i] = new Philosopher(i, forks[i], forks[(i + 1) % philosophersNumber]);
            philosophers[i].start();
        }

        while (true) {
            try {
                Thread.sleep(1000);
                boolean deadlock = true;
                for (Fork fork : forks) {
                    if (fork.isFree()) {
                        deadlock = false;
                        break;
                    }
                }
                if (deadlock) {
                    Thread.sleep(1000);
                    System.out.println("There is a deadlock!");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

        System.out.println("Bye!");
        System.exit(0);
    }

}