class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s)/2;
            if (arr[m+1] > arr[m]) {
                s = m + 1;
            } else if (arr[m] < arr[m-1]) {
                e = m - 1;
            } else {
                return m;
            }
        }
        return s;
    }
}