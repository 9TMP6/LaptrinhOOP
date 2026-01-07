package buoi2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for (int i = 2; i <= n; i += 2)
            sum += i;
        System.out.printf("Tong so chan tu 0 -> %d la: %d\n", n, sum);
        sc.close();
    }
}
