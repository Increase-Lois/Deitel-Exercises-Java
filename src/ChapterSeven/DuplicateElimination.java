package ChapterSeven;
/*
(Duplicate Elimination) Use a one-dimensional array to solve the following problem:
Write an application that inputs ten numbers, each between 10 and 100, both inclusive. Save
each number that was read in an array that was initialized to a value of -1 for all elements. Assume
a value of -1 indicates an array element is empty. You are then to process the array, and remove
duplicate elements from the array containing the numbers you input. Display the contents of the
array to demonstrate that the duplicate input values were actually removed. [Note: do not display
the array elements where the value is -1.]
 */
public class DuplicateElimination {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = -1;
        }
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                if(myArray[i] != -1){

                }

            }

        }

    }

    private static int[] numbers = new int[10];

    public static void initializeValues(int[] value){
        for (int i = 0; i < value.length; i++) {
            value[i] = -1;

        }

    }
//array = {1,2,1,2,4}
    public static int[] removeDuplicateValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] == array[j]) {
                    array[i] = -1;
                }
            }
        }
        int count= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1){
                count++;
            }
        }
        int[] finalResult = new int[count];
        int finalResultCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1){
                finalResult[finalResultCount] = array[i];
                finalResultCount++;
            }

        }
        return finalResult;
    }
}
