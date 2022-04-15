package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    int[] array;
    @BeforeEach
    void setUp(){
       array = new int[10];
    }
    @Test
    void arrayElementCanBeInitializedToMinusOneTest(){
        int [] expectedArray={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        //given i have an array
        for (int i = 0; i < array.length; i++) {
            assertEquals(0, array[i]);
        }
        //when i pass the array into a given method
        DuplicateElimination.initializeValues(array);
       //assert that the arrays elements are assigned the value -1
        for (int i = 0; i < array.length; i++) {
            assertEquals(-1, array[i]);
        }
        //ArrayEquals asserts that the two arrays contain the same elements
        assertArrayEquals(expectedArray,array);
    }
    @Test
    void processTheArrayToRemoveDuplicateValuesTest(){
        int [] expectedArray={10, 20, 45, 67, 89, 100, 53, 44, 31};
        //given
        array = new int[]{10, 20, 20, 45, 67, 89, 100, 53, 44, 31};
        //when
      int[] arrayOfUniqueElements =  DuplicateElimination.removeDuplicateValues(array);
       //assert
        assertArrayEquals(expectedArray, arrayOfUniqueElements);
    }


}