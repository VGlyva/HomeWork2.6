import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new LinkedHashSet<>(nums);
        List<Integer> numbers = new ArrayList<>(set);
        TestService.printEven(nums);
        System.out.println("===");
        TestService.printEvenNoRepeat(numbers);
        System.out.println();
        TestService.printWords();
        TestService.printWordsUnique();

    }

}