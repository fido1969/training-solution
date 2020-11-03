package statements;

public class Time {
    private int hour;

    private int minute;

    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinute() {
        int hourInMinutes = 60;
        return hour * hourInMinutes + minute;
    }

    public int getInSecond() {
        int minutesInSecond = 60;
        return getInMinute() * minutesInSecond + second;
    }

    public boolean earlierThan(Time timeNew) {
        return this.getInSecond() < timeNew.getInSecond();
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
