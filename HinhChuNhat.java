import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều rộng và chiều cao
        System.out.print("Nhập chiều rộng (width): ");
        float width = scanner.nextFloat();

        System.out.print("Nhập chiều cao (height): ");
        float height = scanner.nextFloat();

        // Tính diện tích và chu vi
        float area = width * height;
        float perimeter = 2 * (width + height);

        // In kết quả ra màn hình, làm tròn 2 chữ số thập phân
        System.out.printf("Diện tích : %.2f\n", area);
        System.out.printf("Chu vi : %.2f\n", perimeter);

        scanner.close();
    }
}