import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width ,height;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập chiều rộng hình  chữ nhật ");
        width =sc.nextFloat();
        System.out.println("Nhập chiều dài của hình chữ  nhật");
        height =sc.nextFloat();
        float area =width * height;
        System.out.println("Diện  tích area ="+area);
    }
}
