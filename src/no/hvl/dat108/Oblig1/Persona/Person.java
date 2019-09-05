package no.hvl.dat108.Oblig1.Persona;


public class Person {
    private StringBuffer fName;
    private StringBuffer lName;

    public Person(StringBuffer fName, StringBuffer lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public StringBuffer getlName() {
        return lName;
    }

    public void setlName(StringBuffer lName) {
        this.lName = lName;
    }

    public StringBuffer getfName() {
        return fName;
    }

    public void setfName(StringBuffer fName) {
        this.fName = fName;
    }
}
