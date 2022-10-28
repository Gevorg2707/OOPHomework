package Task3;

public class Time {
    private int hr;
    private int min;
    private int seconds;

    public Time(int hr,int min,int seconds) {
        this.hr = hr;
        this.min=min;
        this.seconds=seconds;
    }

    public int getHr() {
        return hr;
    }

    public int getMin() {
        return min;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {

        if (hr<=24&hr>0&min>0&min<=60&seconds>0&seconds<=60) {
            return "Time is hr:min:seconds " + hr+":" +min+":" +seconds;
        } else {
            return "We have errors";
        }
    }
}
