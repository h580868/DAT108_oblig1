package no.hvl.dat108.Oblig1.Opp1;


public class Person {
    private StringBuffer name;


    public Person(String name) {
        this.name.append(name);

    }

    public StringBuffer getName() {
        return name;
    }

    public void setName(StringBuffer name) {
        this.name = name;
    }


}