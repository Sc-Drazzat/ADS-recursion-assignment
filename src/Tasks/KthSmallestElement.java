package Tasks;

import Utility.SortingAlgorithms;

import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Enter numbers of your array");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = scanner.nextInt();
        SortingAlgorithms.quickSort(array,0,sizeOfArray-1);
        System.out.println("K-th smallest element is: " + array[k-1]);
    }
}
