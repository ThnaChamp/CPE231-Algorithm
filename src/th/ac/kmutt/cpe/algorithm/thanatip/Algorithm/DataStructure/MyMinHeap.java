package th.ac.kmutt.cpe.algorithm.thanatip.Algorithm.DataStructure;

import java.util.*;


public class MyMinHeap {

    private ArrayList<Long> heap;

    public MyMinHeap() {
        heap = new ArrayList<>();
    }

    public MyMinHeap(List<Long> list) {
        heap = new ArrayList<>(list);
        buildHeap();
    }

    private void buildHeap() {
        int lastParentIndex = (heap.size() / 2) - 1;
        for (int i = lastParentIndex; i >= 0; i--) {
            heapifyDown(i);
        }
    }

    public void add(long value) {
        heap.add(value); 
        heapifyUp(heap.size() - 1);
    }

    public long poll() {

        long minValue = heap.get(0);
        long lastValue = heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0);
        }

        return minValue;
    }


    private void heapifyDown(int i) {
        long value = heap.get(i);
        int n = heap.size();

        while (leftChildIndex(i) < n) {
            int j = leftChildIndex(i);


            if (j < n - 1 && heap.get(j) > heap.get(j + 1)) {
                j++; 
            }


            if (value <= heap.get(j)) {
                break; 
            }


            heap.set(i, heap.get(j));
            i = j;
        }
        heap.set(i, value);
    }


    private void heapifyUp(int i) {
        long value = heap.get(i);
        while (i > 0 && value < heap.get(parentIndex(i))) {
            heap.set(i, heap.get(parentIndex(i)));
            i = parentIndex(i);
        }
        heap.set(i, value);
    }

    private int parentIndex(int i) {
        return (i - 1) / 2;
    }

    private int leftChildIndex(int i) {
        return (2 * i) + 1;
    }

    private int rightChildIndex(int i) {
        return (2 * i) + 2;
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public long peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        return heap.get(0);
    }

    @Override
    public String toString() {
        return heap.toString();
    }

    public long result = 0;

    public long solve(MyMinHeap heap) {

        while (heap.size() > 1) {
            long min1 = heap.poll();
            long min2 = heap.poll();
            long sum = min1 + min2;
            result += sum;
            heap.add(sum);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Long> data = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            data.add(sc.nextLong());
        }
        MyMinHeap heap = new MyMinHeap(data);
        long sum = heap.solve(heap);
        System.out.println(sum);

    }
}
