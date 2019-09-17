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

    private static void skrivUtAlle(List<Ansatt> ansatte){
        ansatte.forEach(Ansatt::print);
    }

    private static void lonnsOppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> someFunction) {
        ansatte.forEach(a -> someFunction.apply((Ansatt) someFunction));

    }

    public static void main(String[] args) {

        Ansatt a1 = new Ansatt("Hassan", "Ali", Kjonn.MANN,"Student", 50000);
        Ansatt a2 = new Ansatt("Katarina", "Nederlid", Kjonn.KVINNE, "Student", 50001);
        List<Ansatt> ansatte = new LinkedList<>();
        ansatte.add(a1);
        ansatte.add(a2);


        a1.print();
        a2.print();

        skrivUtAlle(ansatte);

        out.println("Running lonnsTilleg");
        lonnsTillegg(ansatte);
        skrivUtAlle(ansatte);
    }
}
