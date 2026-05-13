import java.util.Scanner;

public class DienTichHinhTron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();

        double pi = 3.14;
        double area = pi * radius * radius;

        System.out.printf("Diện tích : %.2f", area);

        scanner.close();
    }
}