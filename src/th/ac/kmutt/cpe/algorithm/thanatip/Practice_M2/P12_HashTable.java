package th.ac.kmutt.cpe.algorithm.thanatip.Practice_M2;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.DataStructure.HashTable;

public class P12_HashTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        int z = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            list.add(word);
        }

        HashTable hash = new HashTable(z);
        hash.solve(list);
        System.out.println(hash.getHashTable());

    }
}
