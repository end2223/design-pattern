package behavioral.strategy;

import java.util.Arrays;

public class QuickSort implements SortAlgorithm{
    @Override
    public void sort(int[] a) {
        System.out.println("Quick Sort");
        Arrays.sort(a);
    }
}
