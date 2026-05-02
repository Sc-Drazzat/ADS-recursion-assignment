package Utility;

public class SortingAlgorithms {
    public static String bubbleSortString(String word) {
        char[] charArray = word.toCharArray();
        char tempChar;
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    tempChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = tempChar;
                }
            }
        }
        String sortedString = new String(charArray);
        return sortedString;
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[right];
        array[right] = temp;
        return i + 1;
    }

    public static void mergeSort(int[] array, int left, int right){
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int sizeSubarrayLeft = middle - left + 1;
        int sizeSubarrayRight = right - middle;
        int[] subarrayLeft = new int[sizeSubarrayLeft];
        int[] subarrayRight = new int[sizeSubarrayRight];
        for (int i = 0; i < sizeSubarrayLeft; i++) {
            subarrayLeft[i] = array[left + i];
        }
        for (int j = 0; j < sizeSubarrayRight; j++) {
            subarrayRight[j] = array[middle + 1 + j];
        }
        int indexSubarrayLeft = 0, indexSubarrayRight = 0, indexMergedArray = left;
        while (indexSubarrayLeft < sizeSubarrayLeft && indexSubarrayRight < sizeSubarrayRight) {
            if (subarrayLeft[indexSubarrayLeft] <= subarrayRight[indexSubarrayRight]) {
                array[indexMergedArray] = subarrayLeft[indexSubarrayLeft];
                indexSubarrayLeft++;
            } else {
                array[indexMergedArray] = subarrayRight[indexSubarrayRight];
                indexSubarrayRight++;
            }
            indexMergedArray++;
        }
        while (indexSubarrayLeft < sizeSubarrayLeft) {
            array[indexMergedArray] = subarrayLeft[indexSubarrayLeft];
            indexSubarrayLeft++;
            indexMergedArray++;
        }
        while (indexSubarrayRight < sizeSubarrayRight) {
            array[indexMergedArray] = subarrayRight[indexSubarrayRight];
            indexSubarrayRight++;
            indexMergedArray++;
        }
    }
}
