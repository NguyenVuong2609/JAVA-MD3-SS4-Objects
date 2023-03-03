package RikkeiAcademy;

import java.util.Scanner;

public class BT1_QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Tính phương trình bậc 2 có dạng: ax2 + bx + c = 0");
        do {
            System.out.println("Vui lòng nhập a: ");
            a = sc.nextDouble();
            if (a == 0)
                System.out.println("Không đúng định dạng phương trình bậc 2. Vui lòng nhập lại.");
        } while ( a == 0);
        System.out.println("Vui lòng nhập b:");
        b = sc.nextDouble();
        System.out.println("Vui lòng nhập c:");
        c = sc.nextDouble();
        QuadraticEquation newQua = new QuadraticEquation(a,b,c);
        if (newQua.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm: " + newQua.getRoot1() + " và " + newQua.getRoot2());
        } else if (newQua.getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm: " + newQua.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
    public static class QuadraticEquation{
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double getDiscriminant() {
            double delta = (b * b) - (4 * a * c);
            return delta;
        }

        public double getRoot1(){
            double r1 = 0;
            if (getDiscriminant() >= 0){
                r1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
            }
            return r1;
        }
        public double getRoot2(){
            double r2 = 0;
            if (getDiscriminant() >= 0) {
                r2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / 2 * a;
            }
            return r2;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }
}
