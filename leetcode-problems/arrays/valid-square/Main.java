class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 1, e = num;
        while (s <= e) {
            long m = s + (e-s)/2;
            if (m * m == num) {
                return true;
            } else if (m * m < num) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return false;
    }
}