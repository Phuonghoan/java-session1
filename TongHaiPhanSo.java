import java.util.Scanner;

public class TongHaiPhanSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tử số và mẫu số của phân số thứ nhất
        System.out.print("Nhập tử số 1 (a): ");
        int a = scanner.nextInt();
        System.out.print("Nhập mẫu số 1 (b): ");
        int b = scanner.nextInt();

        // Nhập tử số và mẫu số của phân số thứ hai
        System.out.print("Nhập tử số 2 (c): ");
        int c = scanner.nextInt();
        System.out.print("Nhập mẫu số 2 (d): ");
        int d = scanner.nextInt();

        // Tính tổng phân số: a/b + c/d = (a*d + b*c) / (b*d)
        int tu = a * d + b * c;   // tử số
        int mau = b * d;          // mẫu số

        // In kết quả ra màn hình
        System.out.println("Tổng phân số: " + tu + "/" + mau);

        scanner.close();
    }
}