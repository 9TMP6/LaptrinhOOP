package buoi2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        System.out.printf("Cac so nguyen to tu 1-> %d: ", n);
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.print(i + " ");
        }
        sc.close();
    }
}
