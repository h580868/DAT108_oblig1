package no.hvl.dat108.Oblig1.Opp1;

import java.util.concurrent.Semaphore;

public class TraadSemaLes implements Runnable {
    Semaphore sema;

    public TraadSemaLes(Semaphore sema) {
        this.sema = sema;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 25; i++) {
            try {
                sema.acquire();
                System.out.println(Person.getName());
                sema.release();
                //wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
