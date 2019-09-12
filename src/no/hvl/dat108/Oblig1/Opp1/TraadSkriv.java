package no.hvl.dat108.Oblig1.Opp1;

import java.util.ArrayList;

public class TraadSkriv implements Runnable{
    private static ArrayList<String> names;
    private static int nameCounter = 0;

    public TraadSkriv(ArrayList<String> names) {
        this.names = names;
    }
    @Override
    public synchronized void run() {
        Person.setName(names.get(nameCounter % names.size()));
        nameCounter ++;
    }


}
