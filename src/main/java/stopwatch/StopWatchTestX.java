package stopwatch;

public class StopWatchTestX {

    public static void main(String[] args) {
//test1
        StopWatch stopWatch = new StopWatch();

        stopWatch.record(14);

        int minutes = stopWatch.getMinutes();

        if (minutes != 14) {
            System.out.println("RED");
        } else {
            System.out.println("GREEN");
        }



//test2
        stopWatch.record(-5);

        minutes = stopWatch.getMinutes();

        if (minutes != 0) {
            System.out.println("RED");
        } else {
            System.out.println("GREEN");
        }

    //test3
        stopWatch = new StopWatch();

        stopWatch.record(60);

        minutes = stopWatch.getMinutes();
        int hours = stopWatch.getHours();

        if (minutes != 0 || hours != 1) {
            System.out.println("RED");
        } else {
            System.out.println("GREEN");
        }

    }
}