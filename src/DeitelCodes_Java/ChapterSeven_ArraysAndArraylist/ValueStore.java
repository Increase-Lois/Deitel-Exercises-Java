package DeitelCodes_Java.ChapterSeven_ArraysAndArraylist;

public class ValueStore {
    public static void main(String[] args) {
        final  int ARRAY_LENGTH =15;
        int [] array = new int[ARRAY_LENGTH];


        for (int i = 0; i < array.length; i++){
            array[i] = 2 + 2 * i;
        }
        System.out.printf("%s%10s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++){
            System.out.printf("%6d%8d%n", i,array[i]);
        }
    }

}
