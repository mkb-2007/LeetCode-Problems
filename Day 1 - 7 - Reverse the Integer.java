import java.util.Scanner;

class Solution {
    // Your original LeetCode method
    public int reverse(int x) {
        long reversed = 0;
        
        while (x != 0) {
            int pop = x % 10;
            reversed = reversed * 10 + pop;
            x /= 10;
        }
        
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }

    // Main method added for running locally
    public static void main(String[] args) {
        Solution solver = new Solution();
        Scanner scanner = new Scanner(System.class);
        
        System.out.print("Enter an integer to reverse: ");
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            int result = solver.reverse(input);
            System.out.println("Reversed Integer: " + result);
        } else {
            System.out.println("Please enter a valid 32-bit integer.");
        }
        
        scanner.close();
    }
}
