package ClassExercises;

public class Aircondition {
    public boolean isOn;
    private String name;
    private int defaultTemperature = 16;

    public Aircondition(String acName) {
        name = acName;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        if(isOn){
            return defaultTemperature;
        }
        return 0;


    }

    public void increaseTemperature() {
        if(isOn)
            if (defaultTemperature <30)
                defaultTemperature++;
    }

    public void decreaseTemperature() {
        if (isOn)
            if (defaultTemperature >16)
                defaultTemperature--;
    }
}




