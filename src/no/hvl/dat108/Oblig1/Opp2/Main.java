package no.hvl.dat108.Oblig1.Opp2;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
        Collections.sort(listen);
        Collections.sort(listen, (s1, s2) -> s1.length()-s2.length());
        System.out.println(listen);
    }
}
