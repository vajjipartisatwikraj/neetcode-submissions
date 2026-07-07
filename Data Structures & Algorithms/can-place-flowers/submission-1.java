class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (n <= 0) return true;
        
        for (int i = 0; i < len; i++) {
            if (n == 0) return true;
            
            if (flowerbed[i] == 0) {
                boolean leftValid = (i == 0 || flowerbed[i - 1] != 1);
                boolean rightValid = (i == len - 1 || flowerbed[i + 1] != 1);
                
                if (leftValid && rightValid) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n <= 0;
    }
}