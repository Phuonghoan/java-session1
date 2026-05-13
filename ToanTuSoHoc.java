import java.util.Scanner;

public class ToanTuSoHoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo 2 biến số nguyên
        int firstNumber;
        int secondNumber;

        // Nhập giá trị cho 2 biến
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        firstNumber = scanner.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        secondNumber = scanner.nextInt();

        // Thực hiện các phép toán
        int tong = firstNumber + secondNumber;
        int hieu = firstNumber - secondNumber;
        int tich = firstNumber * secondNumber;
        int thuong = firstNumber / secondNumber;
        int phanDu = firstNumber % secondNumber;

        // In kết quả ra màn hình
        System.out.println();
        System.out.println("--- Kết quả ---");
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);
        System.out.println("Phần dư = " + phanDu);

        scanner.close();
    }
}