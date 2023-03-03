package RikkeiAcademy;

import java.util.Date;

public class BT2_StopWatch {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
    }

    public static class StopWatch{
        Date recentTime = new Date();
        private long startTime = recentTime.getTime();
        private long endTime;

        public StopWatch() {
        }

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getEndTime() {
            return endTime;
        }

        public void setEndTime(long endTime) {
            this.endTime = endTime;
        }

        public void start(){
            startTime = recentTime.getTime();
        }
        public void end(){
            endTime = recentTime.getTime();
        }
        public long getElapsedTime(){
            long distance = endTime - startTime;
            return distance;
        }
    }
}
