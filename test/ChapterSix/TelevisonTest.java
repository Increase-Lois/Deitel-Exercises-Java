package ChapterSix;

import ClassExercises.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisonTest {

    @Test
    public void iHaveNewTelevisionAndItIsOn(){
    Television tvMode = new Television("Panasonic");
    assertFalse(tvMode.isOn);
    //when i turn it on
        tvMode.turnOn();
        //check
        assertTrue(tvMode.isOn);
}
    @Test
    public void iHaveAnewTelevisionAndItCanBeTurnedOffTest(){
        Television tvMode = new Television("Panasonic");
        tvMode.turnOn();
        assertTrue(tvMode.isOn);
        //when i turn it off
        tvMode.turnOff();
        //check
        assertFalse(tvMode.isOn);
    }

    @Test
    public void iHaveAnewTelevisionAndItCanIncreaseChannelNumberTest(){
        Television tvMode = new Television("Panasonic");
        tvMode.turnOn();
        assertTrue(tvMode.isOn);
        int defaultChannelNumber = tvMode.getChannelNumber();
        assertEquals(0,defaultChannelNumber);
        //when i increase the channel number
        tvMode.increaseChannelNumber();
        //check
        defaultChannelNumber = tvMode.getChannelNumber();
        assertEquals(1,defaultChannelNumber);
    }
    @Test
    public void iHaveAnewTelevisionAndItCanDecreaseChannelNumberTest() {
        Television tvMode = new Television("Panasonic");
        tvMode.turnOn();
        assertTrue(tvMode.isOn);
        //given
        int defaultChannelNumber = tvMode.getChannelNumber();
        assertEquals(0, defaultChannelNumber);
        //when i decrease the channel number
        tvMode.decreaseChannelNumber();
        //check
        assertEquals(0, defaultChannelNumber);
    }
    @Test
    public void iHaveAnewTelevisionAndICanIncreaseTheVolumeTest() {
        Television tvMode = new Television("Panasonic");
        tvMode.turnOn();
        assertTrue(tvMode.isOn);
      //  for (int mode =0; mode > 1; mode++)
        //given
        int defaultVolumeNumber = tvMode.getVolumeNumber();
        assertEquals(0,defaultVolumeNumber);
        //when i increase the volume
        tvMode.increaseVolumeNumber();
        tvMode.increaseVolumeNumber();
        //check
        defaultVolumeNumber = tvMode.getVolumeNumber();
        assertEquals(2,defaultVolumeNumber);


    }
    @Test
    public void iHaveAnewTelevisionAndICanDecreaseTheVolumeTest() {
        Television tvMode = new Television("Panasonic");
        tvMode.turnOn();
        assertTrue(tvMode.isOn);
        //given
        int defaultVolumeNumber = tvMode.getVolumeNumber();
        assertEquals(0, defaultVolumeNumber);
        //when i decrease the volume
        tvMode.decreaseVolumeNumber();
        //check
        defaultVolumeNumber = tvMode.getVolumeNumber();
        assertEquals(0, defaultVolumeNumber);
    }
    @Test
    public void tvVolumeCantGoAbove99Test() {
        Television tvmode = new Television("Panasonic");
        //given i have a tv and the tv volume is on at 99
        tvmode.turnOn();
        assertTrue(tvmode.isOn);
        for(int mode =0; mode > 99; mode++) {
            tvmode.increaseVolumeNumber();
        }
        assertEquals(99,tvmode.getVolumeNumber());
        //when i increase the volume
//        tvmode.increaseVolumeNumber();
//        //check
//        assertEquals(99,tvmode.getVolumeNumber);
    }
    }









