package th.ac.kmutt.cpe.algorithm.thanatip;

import java.util.ArrayList;
import java.util.Collections;

public class JohnsonTrotterClean {

    private static final int LEFT = -1;
    private static final int RIGHT = 1;

    public void generate(int n) {
        if (n <= 0) {
            System.out.println("n must be positive");
            return;
        }

        ArrayList<Integer> perm = new ArrayList<>();
        ArrayList<Integer> directions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            perm.add(i + 1);
            directions.add(LEFT);
        }

        System.out.println(perm);

        while (true) {
            int mobileIndex = findLargestMobileIndex(perm, directions);

            if (mobileIndex == -1) {
                break;
            }

            int k = perm.get(mobileIndex);
            int dir = directions.get(mobileIndex);
            int swapIndex = mobileIndex + dir;

            // 1. ใช้ Collections.swap ตามที่คุณสนใจ
            Collections.swap(perm, mobileIndex, swapIndex);
            Collections.swap(directions, mobileIndex, swapIndex);

            System.out.println(perm);

            // 2. ส่วนนี้ยังต้องวน loop เพื่อ "กลับทิศทาง" (ไม่ใช่ reverse list)
            reverseDirections(perm, directions, k);
        }
    }

    private int findLargestMobileIndex(ArrayList<Integer> perm, ArrayList<Integer> directions) {
        int n = perm.size();
        int largestMobileVal = -1;
        int mobileIndex = -1;

        for (int i = 0; i < n; i++) {
            int currentVal = perm.get(i);
            int currentDir = directions.get(i);
            int neighborIndex = i + currentDir;

            if (neighborIndex >= 0 && neighborIndex < n) {
                if (currentVal > perm.get(neighborIndex)) {
                    if (currentVal > largestMobileVal) {
                        largestMobileVal = currentVal;
                        mobileIndex = i;
                    }
                }
            }
        }
        return mobileIndex;
    }

    /**
     * เมธอดนี้ "กลับทิศทาง" (1 <-> -1) ของตัวเลขที่ > k ไม่สามารถใช้
     * Collections.reverse() ซึ่งเป็นการ "กลับลำดับ" List ได้
     */
    private void reverseDirections(ArrayList<Integer> perm, ArrayList<Integer> directions, int k) {
        for (int i = 0; i < perm.size(); i++) {
            if (perm.get(i) > k) {
                directions.set(i, directions.get(i) * -1);
            }
        }
    }

    public static void main(String[] args) {
        JohnsonTrotterClean jt = new JohnsonTrotterClean();

        System.out.println("--- Generating permutations for n = 3 ---");
        jt.generate(3);

        System.out.println("\n--- Generating permutations for n = 4 ---");
        jt.generate(4);
    }
}

