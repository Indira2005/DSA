public class Main {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                // This branch handles both target == letters[mid] and target > letters[mid]
                start = mid + 1;
            }
        }
        // Modulo ensures circular behavior for the array
        return letters[start % letters.length];
    }
}
