package no.hvl.dat108.Oblig1.Persona;

public class TraadSkriv implements Runnable{
    private StringBuffer person;
    private String name;

    public TraadSkriv(StringBuffer person, String name) {
        this.person = person;
        this.name = name;
    }
    @Override
    public void run() {
        while (true) {
            person.replace(0, person.length(), name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
