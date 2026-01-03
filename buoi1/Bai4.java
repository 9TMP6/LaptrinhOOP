package laptrinhoop.buoi1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int n;
        boolean check = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so n: ");
        n = sc.nextInt();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (n > 1 && check)
            System.out.printf("So %d la so nguyen to!\n", n);
        else
            System.out.printf("So %d khong la so nguyen to!\n", n);
        sc.close();
    }
}