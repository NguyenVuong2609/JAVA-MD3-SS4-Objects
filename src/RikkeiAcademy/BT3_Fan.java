package RikkeiAcademy;

public class BT3_Fan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("yellow");
        fan2.setSpeed(fan2.MEDIUM);
        System.out.println("Fan1 => " + fan1);
        System.out.println("Fan2 => " + fan2);
    }

    public static class Fan {
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public Fan() {
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            String status = on ? " on" : " off";
            return isOn() ? "{" +
                    " speed=" + speed +
                    ", fan is" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}' : "{" +
                    " fan is" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
