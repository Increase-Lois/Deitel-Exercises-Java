package ChapterFourteen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* (Defining Your Own String Methods) Write your own versions of String search methods indexOf and lastIndexOf .*/
public class SearchMethod {
    private String string;

    public SearchMethod(String string) {
        this.string = string;
    }

    public int _lastIndexOf(char character) {
        int returnIndex = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character)
                returnIndex = i;
        }
        return returnIndex;
    }

    public int _lastIndexOf(char character, String string) {
        int returnIndex = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character)
                returnIndex = i;
        }
        return returnIndex;
    }

    public  int _indexOf(boolean shouldIgnoreCase, char character) {
        int _index = -1;
        if (shouldIgnoreCase) {
            string = string.toLowerCase();
            character = Character.toLowerCase(character);
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == character) {
                    return i;
                }
            }
        }
            else{
                 _indexOf(character);
            }
            return _index;
    }

    private int _indexOf(char character) {
        int _returnInt = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character)
                _returnInt = i;
            }

            return _returnInt;
        }

        public int countOf(char character){
        int count = 0;
            for (int i = 0; i < count; i++) {
                count = i;
            }
            return count;
        }
        public String[] _split(String delimiter){
        if (delimiter.equals("")){
            String[] splitString = new String[string.length()];
            for (int i = 0; i < string.length(); i++) {
                splitString[i] = String.valueOf(string.charAt(i));
            }
            return splitString;
        }
        int length = delimiter.length();
        int lastIndex = 0;
        List<String> splitString = new ArrayList<>();
            for (int i = 0; i < string.length(); i++) {
                if(i+1 -length >= 0){
                    String subStringOne = string.substring(lastIndex, i+1);
                    if (subStringOne.equals(delimiter)){
                        String subString = string.substring(lastIndex, i+1-length);
                        if (!subString.equals("")){
                            splitString.add(subString);
                        }
                        lastIndex = i+1;
                    }
                }
            }
            splitString.add(string.substring(lastIndex));
            String[] splitStringArray = new String[splitString.size()];
            for (int i = 0; i < splitStringArray.length; i++) {
                splitStringArray[i] = splitString.get(i);
            }

            return splitStringArray;
        }

    }









//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a word");
//        String input = scanner.nextLine();
//        System.out.println(_lastIndexOf('a',input));
//        System.out.println();
//    }
//}
