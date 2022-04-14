package PraciceCodes;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MultidimensionalArraysWithFemi {
    private static int[][] multidimensionalArray = new int[1][3];
    private static int[][] staticallyInitializedMultidimensionalArray = {{1, 2, 3}};

    public static void main(String[] args) {
        multidimensionalArray[0][0] = 1;
        multidimensionalArray[0][1] = 2;
        multidimensionalArray[0][2] = 3;

        for (int index = 0; index < multidimensionalArray.length; index++) {
            for (int index2 = 0; index2 < multidimensionalArray[index].length; index2++) {
                System.out.println("from multidimensionalArray at index" + " " + index + index2 + "--->"+ multidimensionalArray[index][index2]);            }
        }

        for (int index = 0; index < staticallyInitializedMultidimensionalArray.length; index++) {
            for (int index2 = 0; index2 < staticallyInitializedMultidimensionalArray[index].length; index2++) {
                System.out.println("from staticallyInitializedMultiDimensionalArray at index" + " " + index + index2 + "--->"+
                        staticallyInitializedMultidimensionalArray[index][index2]);            }
        }


    }

}
