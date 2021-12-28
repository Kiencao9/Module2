package Bai4.bai2;

import java.util.Date;

public class StopWatch {
    long startTime;
    long endTime;

    public long start(){
        startTime = new Date().getTime();
        return startTime;
    }

    public  long stop(){
        endTime = new Date().getTime();
        return endTime;
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}
