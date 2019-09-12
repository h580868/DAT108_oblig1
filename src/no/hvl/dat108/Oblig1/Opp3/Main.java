package no.hvl.dat108.Oblig1.Opp3;

import java.util.List;
import java.util.function.Function;

public class Main {

    void lonnsTillegg(Ansatt ansatt) {

    }

    void skrivUtAlle(List<Ansatt> ansatte){
        Ansatt.forEach(n -> System.out.println(n));
    }

    private static void lonnsOppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> someFunction) {
        for (Ansatt an:ansatte) {
            an.setAarslonn(someFunction(an.getAarslonn(), 1) );
        }
        //setAarslonn();
    }

    public static void main(String[] args) {

        Ansatt ansatt1;


    }
}
