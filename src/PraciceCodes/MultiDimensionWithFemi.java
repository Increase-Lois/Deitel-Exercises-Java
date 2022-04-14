package PraciceCodes;

public class MultiDimensionWithFemi {
    private static int[][] multiArray = {{1,2,3}, {4,5,6} ,{7,8,9}};

    public static void main(String[] args) {
        System.out.println("for i loop");
        for (int index = 0; index < multiArray.length; index++){
            for (int index2 = 0; index2 < multiArray[index].length ; index2++) {
                System.out.println(multiArray[index][index2]);
            }
            System.out.println();
        }
        System.out.println("for each loop");
        for (int[] innerArray:multiArray) {
            for (int element:innerArray) {
                System.out.println(element);
            }
            System.out.println();
        }
    }
}
