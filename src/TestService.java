import java.util.*;

public class TestService {
    public static List<String> words = new ArrayList<>(List.of("abc", "abc", "bcb", "bcb", "e"));

    public static void printEven(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void printEvenNoRepeat(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                Arrays.sort(new Integer[]{nums.get(i)});
                System.out.print(nums.get(i) + " ");
            }
        }
    }

    public static void printWords() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void printWordsUnique() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size()) ;
    }
}


