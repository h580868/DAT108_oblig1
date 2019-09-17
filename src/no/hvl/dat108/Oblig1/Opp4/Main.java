package no.hvl.dat108.Oblig1.Opp4;

import no.hvl.dat108.Oblig1.Opp3.Kjonn;

import java.util.*;
import java.util.stream.Collectors;
import static java.lang.System.out;

public class Main {

    private static List<String> bareEtternavn(List<Ansatt> liste) {
        return liste.stream().map(Ansatt::getEtternavn).collect(Collectors.toList());
    }

    private static int antallKvinner(List<Ansatt> liste) {
        return (int)liste.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).count();
    }

    private static double kvinneGjennomLonn(List<Ansatt> liste) {
        List<Integer> kvinneLonnListe = liste.stream().filter(a -> a.getKjonn() == Kjonn.KVINNE).map(Ansatt::getAarslonn).collect(Collectors.toList());
        return kvinneLonnListe.stream().mapToDouble(Integer::doubleValue).sum() / kvinneLonnListe.size();
    }

    private static void sjefLonnsOkning(List<Ansatt> liste) {
        liste.stream()
                .filter(a -> a.getStilling().toLowerCase().contains("sjef"))
                .forEach(a -> a.setAarslonn((int)(a.getAarslonn() * 1.07)));
    }

    private static void sjefsLonnPrint(List<Ansatt> liste) {
        liste.stream()
                .filter(a -> a.getStilling().toLowerCase().contains("sjef"))
                .forEach(a -> out.println(a.getEtternavn() + ": "+ a.getAarslonn()));
    }

    private static boolean tjenerMerEnn(List<Ansatt> liste, int number) {
        return liste.stream().anyMatch(a -> a.getAarslonn() >= number);
    }

    private static void printAlle(List<Ansatt> liste) {
        liste
                .forEach(a -> out.println("Navn: " + a.getFornavn() + " " + a.getEtternavn() + ", Stilling: " + a.getStilling()));
    }

    private static Ansatt tjenerMinst(List<Ansatt> liste) {
        return Collections.min(liste, Comparator.comparing(Ansatt::getAarslonn));
        //only finds one, but finding multiple would be a mess of for loops as far as I gathered
    }

    private static void printHeltall(int start, int stop) {
        List<Integer> intListe = new LinkedList<>();
        for (int i = start; i <= stop; i++) {
            intListe.add(i);
        }
        intListe.stream()
                .filter(a -> (a % 3 == 0) || (a % 5 == 0))
                .forEach(a -> out.print(a.toString() + " "));
        //couldn't find out how to split lines after X input, but this is still better than several hundred lines
    }


    public static void main(String[] args) {

        List<Ansatt> ansatte = new LinkedList<>();
        Ansatt jim = new Ansatt("Jim", "Jimson", Kjonn.MANN, "Coffeemaker", 50);
        Ansatt jane = new Ansatt("Jane", "Janesdaughter", Kjonn.KVINNE, "Sjef", 500000);
        Ansatt joan = new Ansatt("Joan", "Lane", Kjonn.KVINNE, "Consultant", 1000000);
        Ansatt john = new Ansatt("John", "Smith", Kjonn.MANN, "Office Drone", 150000);
        ansatte.add(jim);
        ansatte.add(jane);
        ansatte.add(joan);
        ansatte.add(john);

        bareEtternavn(ansatte).forEach(out::println);
        out.println("Antall kvinner: " + antallKvinner(ansatte));
        out.println("Kvinnelig gjennomsnittslonn: " + kvinneGjennomLonn(ansatte));
        sjefLonnsOkning(ansatte);
        out.print("Ny lonn for sjefer:\n" );
        sjefsLonnPrint(ansatte);
        int arbitraryNumber = 800000;
        out.println("Det er " + tjenerMerEnn(ansatte, arbitraryNumber) + " at noen tjener mer enn " + arbitraryNumber);
        printAlle(ansatte);

        Ansatt minst = tjenerMinst(ansatte);
        out.println("Den som tjener minst er: " + minst.getFornavn() + " "
                + minst.getEtternavn() + " og tjener " + minst.getAarslonn());

        int firstNum = 1;
        int lastNum = 1000;
        out.println("Printing all numbers between " + firstNum + " and " + lastNum + " divisible by 3 or 5");
        printHeltall(firstNum, lastNum);
    }
}
