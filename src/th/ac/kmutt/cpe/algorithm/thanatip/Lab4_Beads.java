//Thanatip Nitinantakul 67070501023
package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.Searching.*;

public class Lab4_Beads {

    public static void main(String[] args) {
        ArrayList<Character> beadsList = new ArrayList<>();

        SearchContext<Character> solver = new SearchContext<Character>(new BeadSearch<>());

        Scanner sc = new Scanner(System.in);

        //Input
        String beads = sc.next();
        String front = sc.next();
        String rear = sc.next();
        int p = sc.nextInt();

        //UpperCase
        beads = beads.toUpperCase();
        front = front.toUpperCase();
        rear = rear.toUpperCase();

        for (int i = 0; i < beads.length(); i++) {
            beadsList.add(beads.charAt(i));
        }

        int count = solver.executeSearch(beadsList, front.charAt(0), rear.charAt(0), p);
        System.out.println(count);
    }
}
