package RikkeiAcademy;

import java.util.Date;

public class BT2_StopWatch {
    public static void main(String[] args) {
        Date now = new Date();

    }

    public static class StopWatch{
        private long startTime;
        private long endTime;

        public StopWatch(long startTime, long endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
