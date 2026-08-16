
package stopwatch;

public class StopWatch {
    int minutes;
    int hours;
    int days;

    public void record(int minutes) {
        if (minutes < 0) {
            return;
        }

        this.minutes = minutes % 60;

        int totalHours = minutes / 60;

        this.hours = totalHours % 24;

        this.days = totalHours / 24;
    }

    public int getMinutes() {
        return minutes;
    }


    public int getHours() {
        return hours;
    }

    public int getDays() {
        return days;
    }

}