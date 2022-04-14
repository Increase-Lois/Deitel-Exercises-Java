package PraciceCodes;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRoll {
    public static void main(String[] args) {
        int[] dice = new int[7];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i <= 60_000_000; i++){
            ++dice[1 + random.nextInt(6)];
        }
//        System.out.println(Arrays.toString(dice));
        for (int j = 1; j < dice.length; j++){
            System.out.println(j +" : "+ dice[j]); // TODO: 2/22/22 Displays the no of times an index is shown
        }
    }
}
