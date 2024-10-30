class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(Integer.toString(nums[i]));
        }

        list.sort((a, b) -> (b + a).compareTo(a + b));
        
        StringBuilder num = new StringBuilder();
        for (String n : list) {
            num.append(n);
        }

        String result = num.toString();
        if (result.startsWith("0")) {
            result = "0";
        }
        return result;
    }
}
