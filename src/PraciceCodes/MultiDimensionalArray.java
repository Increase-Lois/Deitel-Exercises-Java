package PraciceCodes;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[] []  box = new int[5][5];
        for (int row = 0; row < box.length; row++){
            for (int column = 0; column < box.length; column++){
                System.out.print(box[row][column] + " ");
            }
            System.out.println();
    }
}
}
