package laptrinhoop.buoi1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        float a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao canh a: ");
        a = sc.nextFloat();
        System.out.print("Nhap vao canh b: ");
        b = sc.nextFloat();
        if (a == 0 || b == 0)
            System.out.println("Canh phai lon hon hoac bang 0 !");
        else {
            System.out.printf("Chu vi la: %.2f\n", (a + b) * 2);
            System.out.printf("Dien tich la: %.2f\n", a * b);
        }
        sc.close();
    }
}