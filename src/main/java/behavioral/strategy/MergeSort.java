package behavioral.strategy;

import java.util.Arrays;

public class MergeSort implements SortAlgorithm{
    @Override
    public void sort(int[] a) {
        System.out.println("Merge Sort");
        Arrays.sort(a);
    }
}
