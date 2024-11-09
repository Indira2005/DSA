class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList <Boolean> list = new ArrayList<>();
        boolean result[] = new boolean[candies.length];
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            candies[i] += extraCandies;
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= max) {
                result[i] = true;
            }
        }
        for (int i = 0; i < result.length; i++) {
            list.add(result[i]);
        }
        return list;
    }
}