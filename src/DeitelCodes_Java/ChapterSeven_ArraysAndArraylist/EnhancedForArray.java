package DeitelCodes_Java.ChapterSeven_ArraysAndArraylist;

public class EnhancedForArray {
    public static void main(String[] args) {
        int [] array ={23,67,33,4,2,4,244,56,13,32};
        int sum = 0;

        for(int number : array){
            sum += number;
        }
        System.out.println("Total array of elements is: " + sum);
    }
}
