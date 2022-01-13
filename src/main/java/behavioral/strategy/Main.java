package behavioral.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = init();
        SortAlgorithm bubble = new BubbleSort();
        bubble.sort(a);
        printArray(a);

        int[] b = init();
        SortAlgorithm merge = new MergeSort();
        merge.sort(b);
        printArray(b);

        int[] c = init();
        SortAlgorithm quick = new QuickSort();
        quick.sort(c);
        printArray(c);
    }
    private static int[] init(){
        return new int[]{1,3,5,3,7,2,4};
    }
    private static void printArray(int[] a){
        Arrays.stream(a).forEach(e->System.out.print(e+" "));
        System.out.println();
    }
}
