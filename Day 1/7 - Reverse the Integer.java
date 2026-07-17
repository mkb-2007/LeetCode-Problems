class Solution {
    public int reverse(int x) {
        long reversed = 0;
        
        while (x != 0) {
            int pop = x % 10;
            reversed = reversed * 10 + pop;
            x /= 10;
        }
        
        // Check for 32-bit signed integer overflow
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }
}
