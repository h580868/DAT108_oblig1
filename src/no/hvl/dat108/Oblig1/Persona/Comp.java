package no.hvl.dat108.Oblig1.Persona;

public class Comp {

    public static void main(String[] args) {

        //Person person = new Person("Jim");
        StringBuffer person = new StringBuffer();


        TraadSkriv tS1 = new TraadSkriv(person, "Jim");
        TraadSkriv tS2 = new TraadSkriv(person, "John");
        TraadSkriv tS3 = new TraadSkriv(person, "Cake");
        TraadSkriv tS4 = new TraadSkriv(person, "Pompadour");
        TraadSkriv tS5 = new TraadSkriv(person, "Swede");
        tS1.run();
        tS2.run();
        tS3.run();
        tS4.run();
        tS5.run();

        TraadLes tL1 = new TraadLes(person);
        TraadLes tL2 = new TraadLes(person);
        TraadLes tL3 = new TraadLes(person);
        TraadLes tL4 = new TraadLes(person);
        TraadLes tL5 = new TraadLes(person);
        tL1.run();
        tL2.run();
        tL3.run();
        tL4.run();
        tL5.run();


        //sout + tab = System.out.println

        // psvm + tab = public static ....


    }
}
