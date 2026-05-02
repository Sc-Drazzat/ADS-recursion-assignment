package Tasks;

import Utility.SortingAlgorithms;

import java.util.Scanner;

public class MedianElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int sizeOfArray = scanner.nextInt();
        int[] array = new int[sizeOfArray];
        System.out.println("Enter the elements:");
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scanner.nextInt();
        }
        SortingAlgorithms.mergeSort(array, 0, sizeOfArray - 1);
        double median;
        if (sizeOfArray % 2 == 0) {
            median = (array[sizeOfArray / 2 - 1] + array[sizeOfArray / 2]) / 2.0;
        } else {
            median = array[sizeOfArray / 2];
        }
        System.out.println("The median is: " + median);
    }
}
