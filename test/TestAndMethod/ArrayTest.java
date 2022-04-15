package TestAndMethod;

import ClassExercises.Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {


    @Test
    public void TotalCanBeCalculatedTest() {
        Array chapter = new Array ();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = chapter.calculateTotalOf(numbers);
        assertEquals(15, result);
    }

    @Test
    public void MinimumCanBeCalculatedTest() {
        Array chapter = new Array ();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = chapter.calculateMinimumOf(numbers);
        assertEquals(1, result);
    }

    @Test
    public void MaximumCanBeCalculatedTest() {
        Array chapter = new Array ();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = chapter.calculateMaximumOf(numbers);
        assertEquals(5, result);
    }

    @Test
    public void AverageCanBeCalculatedTest() {
        Array chapter = new Array ();
        int[] numbers = {1, 2, 3, 4, 5};
        double result = chapter.calculateAverageOf(numbers);
        assertEquals(3.0, result);
    }

}
