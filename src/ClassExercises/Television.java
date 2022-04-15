package ClassExercises;

public class Television {
    public boolean isOn;
    private String name;
    private int defaultChannelNumber = 0;
    private int defaultVolumeNumber = 1;

    public Television (String tvName){
        name = tvName;
    }
    public boolean isOn(){
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn =false;
    }

    public int getChannelNumber() {
       return defaultChannelNumber;
    }
    public void increaseChannelNumber() {
        defaultChannelNumber ++;
    }

    public int decreaseChannelNumber() {
        if (defaultChannelNumber > 1 ) {
            return defaultChannelNumber--;
        } return 0;
    }

    public int getVolumeNumber() {
            return defaultVolumeNumber;
        }

    public int increaseVolumeNumber() {
        return defaultVolumeNumber++;
    }

    public int decreaseVolumeNumber() {
       if(defaultVolumeNumber > 1 ){
            return defaultVolumeNumber--;
        } return 0;
    }

}




