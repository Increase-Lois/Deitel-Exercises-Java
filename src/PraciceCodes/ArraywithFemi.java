package PraciceCodes;

public class ArraywithFemi {
//    int[] array = new int[];
private static int[] arrayOfNumbers = {1,2,3,4};
private static  int [] arrayOfNums = new int[4];

private static int[][] multidimensionalarrayOfNumbers = new int[3][3];
    public static void main(String[] args) {
        //one-dimensional array
        arrayOfNums[0] = 1;
        arrayOfNums[1] =2;
        arrayOfNums[2]=3;
        arrayOfNums[3]=4;

        for (int index=0; index<arrayOfNums.length; index++){
            System.out.printf("from arrayOfNumbers, item at index %d is --->%d%s\n",index, arrayOfNumbers[index], " ");
//           System.out.printf("from array arrayOfNums--->%d%s", arrayOfNums[index], ", ");
        }

        for (int index=0; index<arrayOfNums.length; index++){
           System.out.printf("from array arrayOfNums, item at index is %d--->%d%s\n",index, arrayOfNums[index], " ");
        }

    }
}
