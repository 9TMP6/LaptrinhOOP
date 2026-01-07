package buoi2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Tong tu 1 den %d la: %d", n, sum);
    }
}
