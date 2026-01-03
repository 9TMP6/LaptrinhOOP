package laptrinhoop.buoi1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 2 so a va b: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
        System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
        System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
        if (b != 0)
            System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
        else
            System.out.println("Khong the chi cho 0 !");
        sc.close();
    }
}