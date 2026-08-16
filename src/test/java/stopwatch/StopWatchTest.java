package stopwatch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StopWatchTest {

    @Test
    void test1() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.record(14);
        int minutes = stopWatch.getMinutes();
        Assertions.assertEquals(14, minutes);
    }

    @Test
    void test2() {
        StopWatch stopWatch = new StopWatch();

        stopWatch.record(-5);

        Assertions.assertEquals(0, stopWatch.getMinutes());
    }


    @Test
    void test3() {
        StopWatch stopWatch = new StopWatch();

        stopWatch.record(60);

        Assertions.assertEquals(0, stopWatch.getMinutes());
        Assertions.assertEquals(1, stopWatch.getHours());
    }

    @Test
    void test4() {
        StopWatch stopWatch = new StopWatch();

        stopWatch.record(120);

        Assertions.assertEquals(0, stopWatch.getMinutes());
        Assertions.assertEquals(2, stopWatch.getHours());
    }
    @Test
    void test5() {
        StopWatch stopWatch = new StopWatch();

        stopWatch.record(24 * 60);

        Assertions.assertEquals(0, stopWatch.getMinutes());
        Assertions.assertEquals(0, stopWatch.getHours());
        Assertions.assertEquals(1, stopWatch.getDays());
    }
}
