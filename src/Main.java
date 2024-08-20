import Task1.HeapSort;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{ 4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5 };
        HeapSort.sort(array); // 1 2 2 3 4 5 5 6 8 8 9

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}