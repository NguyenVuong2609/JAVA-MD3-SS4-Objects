package RikkeiAcademy;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width;
        int height;
        do {
            System.out.println("Xin mời nhập chiều dài: ");
            width = sc.nextInt();
            if (width>15 || width <0) {
                System.out.println("Quá khả năng, mời nhập lại.");
            }
        } while (width>15 || width <0);
        do {
            System.out.println("Xin mời nhập chiều cao: ");
            height = sc.nextInt();
            if (height>10 || height <0) {
                System.out.println("Quá khả năng, mời nhập lại.");
            }
        } while (height>10 || height <0);

        TH1_Rectangle rectangle = new TH1_Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn: ");
        rectangle.display();
        System.out.println("Diện tích hình chữ nhật của bạn là: " + rectangle.getArea());
        System.out.println("Chu vi hình chữ nhật của bạn là: " + rectangle.getPerimeter());
    }
}
