package Tasks;

import Utility.SortingAlgorithms;
import java.util.Scanner;

public class AnagramSortChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1, word2;
        System.out.println("Enter your first word");
        word1 = scanner.nextLine();
        System.out.println("Enter your second word");
        word2 = scanner.nextLine();
        System.out.println(SortingAlgorithms.bubbleSortString(word1));
        System.out.println(SortingAlgorithms.bubbleSortString(word2));
        if (SortingAlgorithms.bubbleSortString(word1).equals(SortingAlgorithms.bubbleSortString(word2))){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
