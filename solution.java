class Solution {
    public char findKthBit(int n, int k) {
        return kthBitHelper(n, k);
    }

    private char kthBitHelper(int n, int k) {
        
        if (n == 1) {
            return '0';
        }

        int mid = 1 << (n - 1);

        if (k == mid) {
            return '1'; 
        } else if (k < mid) {
            return kthBitHelper(n - 1, k); 
        } else {
            
            char bit = kthBitHelper(n - 1, (1 << n) - k); 
            return bit == '0' ? '1' : '0'; 
        }
    }
}
