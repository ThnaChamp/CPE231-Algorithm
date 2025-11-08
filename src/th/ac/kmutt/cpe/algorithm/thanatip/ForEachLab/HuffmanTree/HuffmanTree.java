package th.ac.kmutt.cpe.algorithm.thanatip.ForEachLab.HuffmanTree;

import java.util.*;

public class HuffmanTree {

    HuffmanNode huffmanTree;
    Map<String, String> codeTable = new HashMap<>();

    public void buildTree(PriorityQueue<HuffmanNode> q) {
        while (q.size() > 1) {
            System.out.println(q);
            HuffmanNode minNode1 = q.poll();
            HuffmanNode minNode2 = q.poll();
            double freqSum = minNode1.freq + minNode2.freq;

            HuffmanNode parent = new HuffmanNode("$", freqSum);
            parent.leftChild = minNode1;
            parent.rightChild = minNode2;

            q.add(parent);
        }

        this.huffmanTree = q.poll();

        buildCodeTable(this.huffmanTree, "");
    }

    private void buildCodeTable(HuffmanNode node, String currentCode) {
        if (node == null) {
            return;
        }

        if (node.alph != null && !node.alph.equals("$")) {
            this.codeTable.put(node.alph, currentCode);
            return;
        }

        buildCodeTable(node.leftChild, currentCode + "0");
        buildCodeTable(node.rightChild, currentCode + "1");
    }

    public String encode(String text) {
        StringBuilder encodedString = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String charStr = String.valueOf(text.charAt(i));
            String code = this.codeTable.get(charStr);
            if (code != null) {
                encodedString.append(code);
            } else {
                System.out.println("Not found " + charStr);
            }
        }
        return encodedString.toString();
    }

    public String decode(String encodedText) {
        StringBuilder decodedString = new StringBuilder();

        HuffmanNode currentNode = this.huffmanTree;

        for (int i = 0; i < encodedText.length(); i++) {
            char bit = encodedText.charAt(i);

            if (bit == '0') {
                currentNode = currentNode.leftChild;
            } else {
                currentNode = currentNode.rightChild;
            }

            if (currentNode.leftChild == null && currentNode.rightChild == null) {
                decodedString.append(currentNode.alph);
                currentNode = this.huffmanTree;
            }
        }
        return decodedString.toString();
    }

    public void preorderTraversal() {
        preorderTraversal(huffmanTree);
    }

    private void preorderTraversal(HuffmanNode tree) {
        if (tree == null) {
            return;
        }
        if (tree.alph != null) {
            System.out.println(tree.alph + ":" + tree.freq);
        }
        preorderTraversal(tree.leftChild);
        preorderTraversal(tree.rightChild);
    }
}
