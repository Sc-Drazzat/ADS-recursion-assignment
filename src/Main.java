import java.util.Scanner;

public class Main {
    //1
    public static int sumOfSquares(int n) {
        //Time complexity is O(n), function call itself n times from n to 1
        //Space complexity is O(n) each recursive call takes place in stack, starting from n to 1
        if (n == 1) return 1;
        return n * n + sumOfSquares(n - 1);
    }
    //2
    public static int sumOfElements(int[] array, int n){
        //Time complexity is O(n), function call itself n times from element arr[n-1] to arr[0]
        //Space complexity is O(n) each recursive call takes place in stack, starting element arr[n-1] to arr[0]
        if (n==1) return array[0];
        return array[n-1] + sumOfElements(array, n-1);
    }
    //3


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(sumOfElements(arr, 4));
    }
}