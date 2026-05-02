package Tasks;

import Utility.Compare;

import java.util.Scanner;

public class OptimalShippingCapacity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of packages");
        int numberOfPackages = scanner.nextInt();
        int[] weights = new int[numberOfPackages];
        System.out.println("Enter the weights of the packages");
        for (int i = 0; i < numberOfPackages; i++) {
            weights[i] = scanner.nextInt();
        }
        System.out.println("Enter the number of days");
        int days = scanner.nextInt();
        int result = shipWithinDays(weights, days);
        System.out.println("The minimum capacity of the ship is: " + result);
    }

    public static int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int weight : weights) {
            left = Compare.max(left, weight);
            right += weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            int need = 1;
            int currentLoad = 0;
            for (int weight : weights) {
                if (currentLoad + weight > mid) {
                    need++;
                    currentLoad = 0;
                }
                currentLoad += weight;
            }
            if (need > days) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
    return left;
    }
}
