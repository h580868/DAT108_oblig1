package no.hvl.dat108.Oblig1.Opp4;

import no.hvl.dat108.Oblig1.Opp3.Kjonn;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private List<String> bareEtternavn(List<Ansatt> liste) {

        return liste.stream().map(a -> a.getEtternavn()).collect(Collectors.toList());

    }

    private static int antallKvinner(List<Ansatt> liste) {
        return (int)liste.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).count();
    }

    public static void main(String[] args) {

        List<Ansatt> ansatte = new LinkedList<Ansatt>();
        Ansatt jim = new Ansatt("Jim", "Jimson", Kjonn.MANN, "Coffeemaker", 50);
        ansatte.add(jim);

        System.out.println("" + antallKvinner(ansatte));

    }
}
