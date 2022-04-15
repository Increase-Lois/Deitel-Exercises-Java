package TestAndMethod;

import ClassExercises.Aircondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionTest {
    @Test
    public void iHaveAnAcAndItIsOn(){
        Aircondition ac = new Aircondition("Samsung");
        assertFalse(ac.isOn);
        //when i turn it on
        ac.turnOn();
        //check that it is on
        assertTrue(ac.isOn);
    }

    @Test
    public void iHaveAnAcAndItIsOff(){
        Aircondition ac = new Aircondition("Samsung");
        ac.turnOn();
        assertTrue(ac.isOn);
        //when i turn it off
        ac.turnOff();
        //check that is off
        assertFalse(ac.isOn);
    }

    @Test
    public void acTemperatureCanBeIncreasedTest(){
        Aircondition ac = new Aircondition("Samsung");
        ac.turnOn();
        assertTrue(ac.isOn);
        int currentTemperature =ac.getTemperature();
        assertEquals(16,currentTemperature);
        //when i increase
        ac.increaseTemperature();
        //check
        currentTemperature=ac.getTemperature();
        assertEquals(17,currentTemperature );
    }
    @Test
    public void acTemperatureCanBeReducedTest(){
        Aircondition ac = new Aircondition("Samsung");
        //given
        ac.turnOn();
        assertTrue(ac.isOn);
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.increaseTemperature();
        assertEquals(19,ac.getTemperature());
        //when
        ac.decreaseTemperature();
        ac.decreaseTemperature();
        //check
        assertEquals(17, ac.getTemperature());
    }

    @Test
    public void acTemperatureCantGoAbove30Test() {
        Aircondition ac = new Aircondition("Samsung");
        //given i have an ac and the ac is on the ac temp is on at 30
        ac.turnOn();
        for (int mode = 0; mode < 14; mode++) {
            ac.increaseTemperature();
        }
        assertEquals(30, ac.getTemperature());
        //when i increase temperature
        ac.increaseTemperature();
        //check
        assertEquals(30,ac.getTemperature());
    }
    @Test
    public void acTemperatureCantGoBelowDefaultTemperatureTest(){
        Aircondition ac = new Aircondition("Samsung");
        //given i have an ac and the ac is on, the ac temp is on at 16
        ac.turnOn();
        assertTrue(ac.isOn);
        for(int i =0; i>16; i--){
            ac.decreaseTemperature();
        }
        assertEquals(16, ac.getTemperature());
        //when i decrease temperature
        ac.decreaseTemperature();
        //check
        assertEquals(16,ac.getTemperature());
    }
    @Test
    public void acTemperatureIsZeroWhenOffTest(){
        Aircondition ac = new Aircondition("Samsung");
        //given
        ac.turnOff();
        assertFalse(ac.isOn);
        //when i turn off my ac
        ac.turnOff();
        //check
        assertEquals(0,ac.getTemperature());
    }

    @Test
    public void acTemperatureCannotBeIncreasedWhenOffTest(){
        Aircondition ac = new Aircondition("Samsung");
        //given
        ac.turnOff();
        ac.increaseTemperature();
        assertEquals(0, ac.getTemperature());
        ac.turnOn();
        ac.increaseTemperature();
        assertEquals(17, ac.getTemperature());
    }

//    @Test
//    public void seeBeverageClassTest(){
//        Beverage bev = new Beverage(7,4,7);
//        assertEquals(0,0,0bev.getCocoaQty(), bev.getSugarQty(), bev.getMilkQty());
//    }
}




