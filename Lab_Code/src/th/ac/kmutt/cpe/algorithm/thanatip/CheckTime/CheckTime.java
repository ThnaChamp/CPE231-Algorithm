package th.ac.kmutt.cpe.algorithm.thanatip.CheckTime;

public class CheckTime {

    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getNanoDuration() {
        return endTime - startTime;
    }

    public double getMilliDuration() {
        return (endTime - startTime) / 1_000_000.0;
    }
}
