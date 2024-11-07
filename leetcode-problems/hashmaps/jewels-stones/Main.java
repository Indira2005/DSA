class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewels_set = new HashSet<>();
        for (char c: jewels.toCharArray()) {
            jewels_set.add(c);
        }

        int numJewels = 0;
        for (char c: stones.toCharArray()) {
            if (jewels_set.contains(c)) {
                numJewels++;
            }
        }
        return numJewels;
    }
}