package buoi2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();
        for (int i = 0; i <= 10; i++)
            System.out.printf("%dx%d= %d\n", n, i, n * i);
        sc.close();
    }
}
