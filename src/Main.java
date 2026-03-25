import java.util.Scanner;

public class Main {
    public static int sumOfSquares(int n) {
        //Time complexity is O(n), function call itself n times from n to 1
        //Space complexity is O(n) each recursive call takes place in stack, starting from n to 1
        if (n == 1) return 1;
        return n * n + sumOfSquares(n - 1);
    }
    public static int sumOfElements(int[] array, int n){
        if (n==0) return array[0];
        return array[n-1] + sumOfElements(array, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(sumOfElements(arr, 4));
    }
}