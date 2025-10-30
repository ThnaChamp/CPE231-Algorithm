package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.DataStructure;

import java.util.*;

public class HashTable {

    private int z;
    private List<String> hashTable = new ArrayList<>();

    public HashTable(int z) {
        this.z = z;
        for (int i = 0; i < this.z; i++) {
            hashTable.add(null);
        }
    }

    public void solve(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            String word = list.get(i);
            int sum = 0;
            int order = 0;
            for (int j = 0; j < word.length(); j++) {
                int numChar = word.charAt(j) - 64;
                sum += numChar;
            }
            order = sum % z;

            while (hashTable.get(order) != null) {
                order++;
            }

            hashTable.set(order, word);
        }
    }

    public List<String> getHashTable() {
        return hashTable;
    }
}
