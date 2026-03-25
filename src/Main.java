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
    public static int sumOfElements(int[] array, int n) {
        //Time complexity is O(n), function call itself n times from element arr[n-1] to arr[0]
        //Space complexity is O(n) each recursive call takes place in stack, starting element arr[n-1] to arr[0]
        if (n == 1) return array[0];
        return array[n - 1] + sumOfElements(array, n - 1);
    }

    //3 Two ways to solve
    // first
    //Time complexity is O(n^2), function call itself n times and in each call use pow() function which take O(n) time
    // pow() function is inside of sumOfPowers so it is n*n = n^2 time
    //Space complexity is O(n) each recursive call takes place in stack, each pow() takes place too, but it completes and clears stack
    // before next recursion
    public static int sumOfPowers1(int n, int b) {
        if (n == 0) return 1;
        return pow(n, b) + sumOfPowers1(n - 1, b);
    }

    public static int pow(int n, int b) {
        if (n == 0) return 1;
        return b * pow(n - 1, b);
    }

    // second
    //Time complexity is O(n), function call itself n times calculating from power n to power 0
    //Space complexity is O(n) each recursive call takes place in stack
    public static int sumOfPowers2(int n, int b, int cur) {
        if (n == 0) return cur;
        return cur + sumOfPowers2(n - 1, b, cur * b);
    }

    //4
    //Time complexity is O(n), function call itself n times inputting and printing values
    //Space complexity is O(n) each recursive call takes place in stack
    public static void reverse(int n, Scanner sc){
        if (n==0) return;
        int x = sc.nextInt();
        reverse(n-1, sc);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.println("n:");
        int n = sc.nextInt();
        System.out.println(sumOfSquares(n));
        //2
        System.out.println("n1:");
        int n1 = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumOfElements(arr,n1));
        //3
        System.out.println("n2:");
        int n2 = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();
        System.out.println(sumOfPowers1(n2,b));
        System.out.println(sumOfPowers2(n2,b,1));
        //4
        System.out.println("n3:");
        int n3 = sc.nextInt();
        System.out.println("Enter sequence");
        reverse(n3,sc);
    }
}