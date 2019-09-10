package no.hvl.dat108.Oblig1.Opp1;


public class Person {
    private static StringBuffer name;


    public Person() {
        name = new StringBuffer();

    }

    public static String getName() {
        return name.toString();
    }

    public static void setName(String newName) {
        if (name.length() > 0) {
            name.replace(0, name.length(), newName);
        } else {
            name.append(newName);
        }
    }


}
