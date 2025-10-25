package th.ac.kmutt.cpe.algorithm.thanatip.Searching;

import java.util.ArrayList;

//เป็นตัวกำหนดว่า จะต้องมี Method 
public interface SearchStrategy<T extends Comparable<T>> {

    public abstract int search(ArrayList<T> list, T target1, T target2, int p); //Abstract Method
}
