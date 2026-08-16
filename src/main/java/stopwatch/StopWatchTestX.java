package stopwatch;

public class StopWatchTestX {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();

        stopWatch.record(14);

        int minutes = stopWatch.getMinutes();

        if (minutes != 14) {
            System.out.println("RED");
        } else {
            System.out.println("GREEN");
        }
    }
}