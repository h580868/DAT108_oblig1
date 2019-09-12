package no.hvl.dat108.Oblig1.Opp3;

import java.util.List;
import java.util.function.Function;

public class Main {

    void lonnsTillegg(Ansatt ansatt) {

    }

    void skrivUtAlle(List<Ansatt> ansatte){
        ansatte.forEach(n -> System.out.print(n));
    }

    private static void lonnsOppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> someFunction) {
        ansatte.forEach(a -> someFunction.apply((Ansatt) someFunction));

    }

    public static void main(String[] args) {

        Ansatt ansatt1;


    }
}
