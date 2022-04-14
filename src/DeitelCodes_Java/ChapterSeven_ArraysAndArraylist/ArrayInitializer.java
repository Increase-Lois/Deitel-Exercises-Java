package DeitelCodes_Java.ChapterSeven_ArraysAndArraylist;

public class ArrayInitializer {
    public static void main(String[] args) {
        int [] array = {24,35,78,98,45,6,12,4,90,74};

        System.out.printf("%s%8s%n", "Index", "Value");

        for (int i = 0; i < array.length; i++){
            System.out.printf("%5d%8d%n", i,array[i]);
        }
    }
    }

