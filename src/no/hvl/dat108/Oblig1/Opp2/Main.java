package no.hvl.dat108.Oblig1.Opp2;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
//  2a
        List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
       Collections.sort(listen,(s1,s2)-> Integer.parseInt(s1)-Integer.parseInt(s2));
       System.out.println(listen);



       //   2b
        // i. Summen av 12 og 13
        System.out.println(beregn((a,b) ->(a+b), 12, 13));
        // ii. Den største av -5 og 3
        System.out.println(beregn((a,b) -> {
            if(a>b) {return a;} else { return b;}
        }, -5, 3));
        // iii. Avstanden (absoluttverdien av differansen) mellom 54 og 45
        System.out.println(beregn((a,b) ->(a-b), 54, 45));
    }

    public static int beregn( BiFunction<Integer, Integer, Integer> bi, int a, int b){

        return bi.apply(a,b);
    }

}
