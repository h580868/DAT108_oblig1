package no.hvl.dat108.Oblig1.Persona;

public class TraadLes implements Runnable{
    private StringBuffer person;
    public TraadLes(StringBuffer person) {
        this.person = person;
    }

    @Override
    public void run() {
        System.out.println(person);
    }
}
