package com.company;

import java.util.concurrent.Semaphore;

class Fork {
    private Semaphore mutex = new Semaphore(1);

    void grab(){
        try {
            mutex.acquire();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    void release() {
        mutex.release();
    }

    boolean isFree() {
        return mutex.availablePermits() > 0;
    }
}