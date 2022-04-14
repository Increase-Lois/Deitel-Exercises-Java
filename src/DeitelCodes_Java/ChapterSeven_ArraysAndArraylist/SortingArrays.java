package DeitelCodes_Java.ChapterSeven_ArraysAndArraylist;

import java.util.Arrays;
import java.util.Scanner;

/*
Create a program using arrays that sort a list of integers in descending order.
Descending order is highest to lowest value.
In other words if the array had the values in it 106,26,81,5,15
your program should ultimately have an array with 106,81,26,15,5 in it.
Set up the program so that the numbers to sort are read in from the keyboard.
Implement the following methods -getIntegers, printArray, and sortIntegers
getIntegers returns an array of entered integers from the keyboard
printArray prints out the contents of the array
and sortIntegers should sort the array and return a new array containing the sorted numbers
you will have to figure out how to copy the array elements from the passed array into a new array and sort them
and return the new sorted array.

 */
public class SortingArrays {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] numbers = {106, 26, 81, 5, 15};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
//    public static int getIntegers(int capacity){
//        int [] array = new int[capacity];
//        System.out.println("Enter " + capacity +" integer values:\n");
//        for (int i=0; i < array.length; i++){
//           array[i] = scanner.nextInt();
//    }
//        return array;

    public static void printArray(int[] array){
        for (int i=0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i=0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
