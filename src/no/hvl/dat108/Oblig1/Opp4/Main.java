package no.hvl.dat108.Oblig1.Opp4;

import no.hvl.dat108.Oblig1.Opp3.Kjonn;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static List<String> bareEtternavn(List<Ansatt> liste) {
        return liste.stream().map(a -> a.getEtternavn()).collect(Collectors.toList());
    }

    private static int antallKvinner(List<Ansatt> liste) {
        return (int)liste.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).count();
    }

    private static double kvinneGjennomLonn(List<Ansatt> liste) {
        List<Integer> kvinneLonnListe = liste.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).map(a -> a.getAarslonn()).collect(Collectors.toList());
        double gjennLonn = kvinneLonnListe.stream().mapToDouble(a -> a.doubleValue()).sum() / kvinneLonnListe.size();
        return gjennLonn;
    }

    private static void sjefLonnsOkning(List<Ansatt> liste) {
        liste.stream()
                .filter(a -> a.getStilling().toLowerCase().contains("sjef"))
                .forEach(a -> a.setAarslonn((int)(a.getAarslonn() * 1.07)));
    }

    public static void main(String[] args) {

        List<Ansatt> ansatte = new LinkedList<Ansatt>();
        Ansatt jim = new Ansatt("Jim", "Jimson", Kjonn.MANN, "Coffeemaker", 50);
        Ansatt jane = new Ansatt("Jane", "Janesdaughter", Kjonn.KVINNE, "Sjef", 50000);
        ansatte.add(jim);
        ansatte.add(jane);

        bareEtternavn(ansatte).forEach(a -> System.out.println(a));
        System.out.println("Antall kvinner: " + antallKvinner(ansatte));
        System.out.println("Kvinnelig gjennomsnittslonn: " + kvinneGjennomLonn(ansatte));
        System.out.println("Ny lonn for sjef" + ansatte.stream().filter(a -> a.getStilling().toLowerCase().contains("sjef")).map(a -> a.getAarslonn()).forEach(a -> a.toString(););

    }
}
