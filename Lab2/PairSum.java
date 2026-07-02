import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create and fill the array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integer values:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force (nested loop) search for a matching pair
        boolean found = false;

        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = i + 1; j < arr.length && !found; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\n--- Pair Sum Result ---");
                    System.out.println("Pair found at indices " + i + " and " + j);
                    System.out.println("Values: " + arr[i] + " and " + arr[j]);
                    System.out.println("Equation: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        // Step 5: No pair found
        if (!found) {
            System.out.println("\nNo pair of numbers in the array sums to " + target + ".");
        }

        scanner.close();
    }
}
