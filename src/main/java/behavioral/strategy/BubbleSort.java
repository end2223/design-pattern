package behavioral.strategy;

import java.util.Arrays;
import java.util.Collection;

public class BubbleSort implements SortAlgorithm{
    @Override
    public void sort(int[] a) {
        System.out.println("Bubble Sort");
        Arrays.sort(a);
    }
}
