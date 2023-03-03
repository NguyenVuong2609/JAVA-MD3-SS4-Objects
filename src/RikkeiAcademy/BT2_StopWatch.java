package RikkeiAcademy;

import java.util.Date;
import java.util.Scanner;

public class BT2_StopWatch {
    public static void main(String[] args) {
        Date recent = new Date();
        Scanner sc = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Reset the time");
            System.out.println("2. Stop the time");
            System.out.println("3. Show the distance");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    watch.start();
                    System.out.println("Now: " + watch.startTime);
                    break;
                case 2:
                    watch.stop(recent.getTime());
                    System.out.println("End: " + watch.endTime);
                    break;
                case 3:
                    if (watch.endTime == 0){
                        System.out.println("Please stop the time.");
                    } else {
                        System.out.println("Distance: " + watch.getElapsedTime());
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice.");
            }
        }

    }

    public static class StopWatch {
        Date recentTime = new Date();
        private long startTime = recentTime.getTime();
        private long endTime = 0;

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

        public void start() {
            startTime = recentTime.getTime();
        }

        public void stop(long newTime) {
            endTime = newTime;
        }

        public long getElapsedTime() {
            long distance = endTime - startTime;
            return distance;
        }
    }
}
