package PraciceCodes;

//import java.util.Arrays;
import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayEquals {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
      int totalNum=  random.ints(100,1,25).sum();
        System.out.println(totalNum );

//        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        int[][] numbersCopy = Arrays.copyOf(numbers, numbers.length);
//
//        System.out.println("Are these two-dimensional arrays equal?");
//        System.out.println(Arrays.deepEquals(numbers, numbersCopy));
//
//        System.out.println(Arrays.deepToString(numbersCopy));
    }
}
