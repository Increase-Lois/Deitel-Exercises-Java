package TestAndMethod;

import ClassExercises.TestDriller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {

    @Test
    public void perCopyIs2KTest() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(4,2000);
        assertEquals(8000,price);
    }
    @Test
    public void perCopyIs1800Test() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(9,1800);
        assertEquals(16200,price);
    }
    @Test
    public void perCopyIs1600Test() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(29,1600);
        assertEquals(46400,price);
    }
    @Test
    public void perCopyIs1500Test() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(35,1500);
        assertEquals(52500,price);
    }
    @Test
    public void perCopyIs1300Test() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(50,1300);
        assertEquals(65000,price);
    }
    @Test
    public void perCopyIs1200Test() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(100,1200);
        assertEquals(120000,price);
    }
    @Test
    public void perCopyIs1100Test() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(256,1100);
        assertEquals(281600,price);
    }
    @Test
    public void perCopyIs1KTest() {
        TestDriller copy = new TestDriller();
        int price= copy.calculateQuantityAgainstPrice(555,1000);
        assertEquals(555000,price);
    }
}
