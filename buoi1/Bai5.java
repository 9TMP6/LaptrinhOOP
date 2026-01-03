package laptrinhoop.buoi1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n, dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                dem++;
        }
        System.out.printf("So luong so nguyen to tu 1 -> %d: %d\n", n, dem);
        sc.close();
    }
}