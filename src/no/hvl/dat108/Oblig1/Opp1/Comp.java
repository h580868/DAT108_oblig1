package no.hvl.dat108.Oblig1.Opp1;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Comp {

    private static ArrayList<String> personer = new ArrayList<>();

    public static void main(String[] args) {


        //StringBuffer person = new StringBuffer();


        personer.add("Jim");
        personer.add("John");
        personer.add("Cake");
        personer.add("Pompadour");
        personer.add("Swede");

        Person person = new Person();

        TraadSkriv tSkriv1 = new TraadSkriv(personer);
        TraadSkriv tSkriv2 = new TraadSkriv(personer);
        TraadSkriv tSkriv3 = new TraadSkriv(personer);
        TraadSkriv tSkriv4 = new TraadSkriv(personer);
        TraadSkriv tSkriv5 = new TraadSkriv(personer);



        TraadLes tL1 = new TraadLes();
        TraadLes tL2 = new TraadLes();
        TraadLes tL3 = new TraadLes();
        TraadLes tL4 = new TraadLes();
        TraadLes tL5 = new TraadLes();

        tSkriv1.run();
        tL1.run();
        tSkriv2.run();
        tL2.run();
        tSkriv3.run();
        tL3.run();
        tSkriv4.run();
        tL4.run();
        tSkriv5.run();
        tL5.run();


        Semaphore sema = new Semaphore(1);

        TraadSemaSkriv tSemaSkriv1 = new TraadSemaSkriv(personer, sema);
        TraadSemaLes tSemaLes1 = new TraadSemaLes(sema);

        tSemaSkriv1.run();
        tSemaLes1.run();

        //sout + tab = System.out.println

        // psvm + tab = public static ....


    }
}
