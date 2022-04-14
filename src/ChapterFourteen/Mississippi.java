package ChapterFourteen;

import java.util.ArrayList;
import java.util.List;

public class Mississippi {
    public static void main(String[] args) {
        String  word ="MiSsiSsippi";
        List<Integer> listOfIndices = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equalsIgnoreCase("s")) {
                listOfIndices.add(i);
            }
        }
        System.out.println(listOfIndices);
        String input = "     chair   man    ";
        System.out.println(input.replace(" ",""));

        }

    }



