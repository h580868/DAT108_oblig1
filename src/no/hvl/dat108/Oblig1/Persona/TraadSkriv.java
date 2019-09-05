package no.hvl.dat108.Oblig1.Persona;

public class TraadSkriv implements Runnable{
    StringBuffer person;

    public TraadSkriv(StringBuffer person) {
        this.person = person;
    }
    @Override
    public void run() {
        String string = "John";
        person.replace(0,string.length(), string);
    }
}
