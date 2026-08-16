
package stopwatch;

public class StopWatch {
    int minutes;
    int hours;
    int days;
    int dailyWorkingHours;

    public StopWatch() {
        this.dailyWorkingHours = 24;
    }
    public StopWatch(int dailyWorkingHours) {
        this.dailyWorkingHours = dailyWorkingHours;
    }

    public void record(int minutes) {
        if (minutes < 0) {
            return;
        }

        this.minutes = minutes % 60;

        int totalHours = minutes / 60;

        this.days = totalHours / dailyWorkingHours;
        this.hours = totalHours % dailyWorkingHours;
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