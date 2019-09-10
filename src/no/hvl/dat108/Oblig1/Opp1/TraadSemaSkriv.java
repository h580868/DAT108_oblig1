package no.hvl.dat108.Oblig1.Opp1;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class TraadSemaSkriv implements Runnable {
    private static ArrayList<String> names;
    private static int nameCounter = 0;
    private Semaphore sema;

    public TraadSemaSkriv(ArrayList<String> names, Semaphore sema) {
        this.names = names;
        this.sema = sema;
    }

    @Override
    public synchronized void run() {
        int i = 0;
        while (i < 5) {
            try {
                sema.acquire();
                Person.setName(names.get(nameCounter % names.size()));
                nameCounter++;
                sema.release();
                i++;
                //wait(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
