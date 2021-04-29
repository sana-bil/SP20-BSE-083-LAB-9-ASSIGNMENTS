public class Clock {
    private int hours, minutes , seconds;
    public Clock(){

    }
    public Clock(int hours, int minutes, int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }
    public void display(){
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
