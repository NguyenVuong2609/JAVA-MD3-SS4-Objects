package RikkeiAcademy;

public class TH1_Rectangle {
    private int width, height;

    public TH1_Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        int area = width * height;
        return area;
    }

    public int getPerimeter(){
        int perimeter = (width + height) * 2;
        return perimeter;
    }

    public void display(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    @Override
    public String toString() {
        return "TH1_Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
