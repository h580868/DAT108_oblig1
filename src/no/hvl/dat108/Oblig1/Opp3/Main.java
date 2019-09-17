package no.hvl.dat108.Oblig1.Opp3;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import static java.lang.System.out;

public class Main {

    private static void lonnsTillegg(List<Ansatt> liste) {
        //hmm.. I'll just make one line for each thing
        liste //+25 as a flat salary raise
                .forEach(a -> a.setAarslonn(a.getAarslonn() + 25));
        liste //+1% flat raise
                .forEach(a -> a.setAarslonn((int)(a.getAarslonn() * 1.01)));
        liste.stream() //+50 aarslonn for having low aarslonn
                .filter(a -> a.getAarslonn() < 75000).forEach(a -> a.setAarslonn(a.getAarslonn() + 50));
        liste.stream() //+5% salary for being a man
                .filter(a -> a.getKjonn() == Kjonn.MANN).forEach(a -> a.setAarslonn((int)(a.getAarslonn() * 1.05)));
        liste.stream() //+6% salary for being a woman
                .filter(a -> a.getKjonn() == Kjonn.KVINNE).forEach(a -> a.setAarslonn(((int)(a.getAarslonn() * 1.06))));
    }

    private static void lonnsTillegg(Ansatt ansatt) {
        ansatt.setAarslonn(ansatt.getAarslonn() + 25);
        ansatt.setAarslonn((int)(ansatt.getAarslonn() * 1.01)); //+25 as a flat salary raise
        if (ansatt.getAarslonn() < 75000) {
            ansatt.setAarslonn(ansatt.getAarslonn() + 50); //+50 aarslonn for having low aarslonn
        }
        if (ansatt.getKjonn() == Kjonn.MANN) {
            ansatt.setAarslonn((int)(ansatt.getAarslonn() * 1.05)); //+5% salary for being a man
        } else if (ansatt.getKjonn() == Kjonn.KVINNE) {
            ansatt.setAarslonn((int)(ansatt.getAarslonn() * 1.06)); //+6% salary for being a woman
        } //other genders do not get raises, apparently
    }

    private static void lonnsTilleggNoStream(List<Ansatt> liste) {
        for (Ansatt ansatt: liste) {
            ansatt.setAarslonn(ansatt.getAarslonn() + 25); //+25 as a flat salary raise
            ansatt.setAarslonn((int)((ansatt.getAarslonn() * 1.01)));
            if (ansatt.getAarslonn() < 75000) {
                ansatt.setAarslonn(ansatt.getAarslonn() + 50); //+50 aarslonn for having low aarslonn
            }
            if (ansatt.getKjonn() == Kjonn.MANN) {
                ansatt.setAarslonn((int)(ansatt.getAarslonn() * 1.05)); //+5% salary for being a man
            } else if (ansatt.getKjonn() == Kjonn.KVINNE) {
                ansatt.setAarslonn((int)(ansatt.getAarslonn() * 1.06)); //+6% salary for being a woman
            } //other genders do not get raises, apparently
        }
    }

    private static void skrivUtAlle(List<Ansatt> ansatte){
        ansatte.forEach(Ansatt::print);
    }

    private static void lonnsOppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> someFunction) {
        ansatte.forEach(a -> someFunction.apply((Ansatt) someFunction));

    }

    public static void main(String[] args) {

        Ansatt a1 = new Ansatt("Hassan", "Ali", Kjonn.MANN,"Student", 50000);
        Ansatt a2 = new Ansatt("Katarina", "Nederlid", Kjonn.KVINNE, "Student", 50001);
        Ansatt a3 = new Ansatt("Nagae", "Slithery", Kjonn.KVINNE, "Snek", 100000);
        Ansatt a4 = new Ansatt("Jim", "Jimson", Kjonn.MANN, "Coffeemaker", 50);
        Ansatt a5 = new Ansatt("Jane", "Janesdaughter", Kjonn.KVINNE, "Sjef", 500000);
        Ansatt a6 = new Ansatt("Joan", "Lane", Kjonn.KVINNE, "Consultant", 1000000);
        Ansatt a7 = new Ansatt("John", "Smith", Kjonn.MANN, "Office Drone", 150000);
        List<Ansatt> ansatte = new LinkedList<>();
        ansatte.add(a1);
        ansatte.add(a2);
        ansatte.add(a3);
        ansatte.add(a4);
        ansatte.add(a5);
        ansatte.add(a6);
        ansatte.add(a7);

        a1.print();
        a2.print();

        skrivUtAlle(ansatte);

        out.println("Running lonnsTilleg");
        lonnsTillegg(ansatte);
        skrivUtAlle(ansatte);

        Ansatt b1 = new Ansatt("Hassan", "Ali", Kjonn.MANN,"Student", 50000);
        Ansatt b2 = new Ansatt("Katarina", "Nederlid", Kjonn.KVINNE, "Student", 50001);
        Ansatt b3 = new Ansatt("Nagae", "Slithery", Kjonn.KVINNE, "Snek", 100000);
        Ansatt b4 = new Ansatt("Jim", "Jimson", Kjonn.MANN, "Coffeemaker", 50);
        Ansatt b5 = new Ansatt("Jane", "Janesdaughter", Kjonn.KVINNE, "Sjef", 500000);
        Ansatt b6 = new Ansatt("Joan", "Lane", Kjonn.KVINNE, "Consultant", 1000000);
        Ansatt b7 = new Ansatt("John", "Smith", Kjonn.MANN, "Office Drone", 150000);
        List<Ansatt> bAnsatte = new LinkedList<>();
        bAnsatte.add(b1);
        bAnsatte.add(b2);
        bAnsatte.add(b3);
        bAnsatte.add(b4);
        bAnsatte.add(b5);
        bAnsatte.add(b6);
        bAnsatte.add(b7);



        //lonnsOppgjor();
    }
}
