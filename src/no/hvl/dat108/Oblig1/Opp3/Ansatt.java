package no.hvl.dat108.Oblig1.Opp3;

import java.util.List;
import java.util.function.Function;

public class Ansatt {
    private String fornavn;
    private String etternavn;
    private String stilling;
    private int aarslonn;

    public Ansatt(String fornavn, String etternavn, String stilling, int aarslonn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.stilling = stilling;
        this.aarslonn = aarslonn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getStilling() {
        return stilling;
    }

    public void setStilling(String stilling) {
        this.stilling = stilling;
    }

    public int getAarslonn() {
        return aarslonn;
    }

    public void setAarslonn(int aarslonn) {
        this.aarslonn = aarslonn;
    }

    private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Integer> thisIsAnInt) {

    //setAarslonn();
    }

    /*private static void skrivUtAlle(List<Ansatt> ansatte){
        Ansatt.forEach(n -> System.out.println(n));
    }*/
}
  /*  Ansatte har fornavn (String),
  etternavn (String),
  kjonn (Kjonn),
  stilling (String)
  aarslonn (int)

   Vi tenker at vi har en liste av ansatte og skal lage en metode som utfører
    lønnsoppgjør (oppdaterer de ansattes lønn etter en viss algoritme).
       Denne metoden ligger i Oppg3, og ser slik ut:
private static void lonnsoppgjor(List<Ansatt> ansatte, ???) ...
*/