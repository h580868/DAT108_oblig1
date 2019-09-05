package no.hvl.dat108.Oblig1.Persona;

public class Comp {

    public static void main(String[] args) {

        //Person person = new Person("Jim");
        StringBuffer person = new StringBuffer("Jim");


        TraadSkriv tS1 = new TraadSkriv(person);
        tS1.run();

        TraadLes tL1 = new TraadLes(person);
        tL1.run();

        //sout + tab = System.out.println

        // psvm + tab = public static ....


    }
}
