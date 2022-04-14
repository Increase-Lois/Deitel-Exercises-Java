package DeitelCodes_Java.ChapterSeven_ArraysAndArraylist;

public class InitArray {
    public static void main(String[] args) {

        int [] array = new int[15];

        System.out.printf("%s%10s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++){
            System.out.printf("%6d%8d%n", i,array[i]);
        }
    }
}
