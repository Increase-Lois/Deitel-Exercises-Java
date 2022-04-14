package DeitelCodes_Java.ChapterEight_Methods_DeeperLook;

public class Time {
    private int hour;
    private int minute;
    private int second;

//    public Time(int hour, int minute, int second){
        public void validateTime (int hour, int minute, int second){

            boolean hourIsNotValid = hour < 0 || hour > 23;
            if (hourIsNotValid)
                throw new IllegalArgumentException ("Hour is not valid");

            boolean minuteIsNotValid = minute < 0 || minute > 59;
            if(minuteIsNotValid)
                throw new IllegalArgumentException("Minute is not valid");

            boolean secondIsNotValid = second < 0 || second > 59;
            if(secondIsNotValid)
                throw new IllegalArgumentException("Seconds is not valid");


        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        boolean isNotValid = hour < 0 || hour > 23;
        if (isNotValid)
            throw new IllegalArgumentException ("Hour is not valid");
    }

    public int getMinute(){
        return minute;
    }

    public void setMinute(int minute) {
        boolean minuteIsNotValid = minute < 0 || minute >59;
        if(minuteIsNotValid)
            throw new IllegalArgumentException("Minute is not valid");

    }
    public int getSecond(){
        return minute;
    }

    public void setSecond(int second) {
        boolean isNotValid = second < 0 || second > 59;
        if(isNotValid)
            throw  new IllegalArgumentException("Seconds is not valid");
    }


    public String toString(){
        return  hour+":"+minute+":"+second;
    }


}
