package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.*;
import th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.HuffmanTree.*;

public class Lab9_GreedyI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<HuffmanNode> q = new PriorityQueue<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String alph = sc.next();
            double freq = sc.nextDouble();
            HuffmanNode node = new HuffmanNode(alph, freq);
            q.add(node);
        }
        HuffmanTree tree = new HuffmanTree();
        tree.buildTree(q);
        // tree.preorderTraversal();

        String originalText = sc.next();
        
        System.out.println("Original: " + originalText);
        String encodedResult = tree.encode(originalText);
        System.out.println("Encoded:  " + encodedResult);

        String decodedResult = tree.decode(encodedResult);
        System.out.println("Decoded:  " + decodedResult);
        
        sc.close();
    }
}
