package hocjava;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dai, rong;
        // int a = 5, b = 6;
        // float c = 12.345f;
        // long d = 36271919292l;
        // System.out.printf("Hello work! \n%fd\n", (float) b / a);
        // System.out.printf("C là: %f\n", c);
        // System.out.print(d + " là d\n");
        // System.out.print("Nhập vào cạnh a và b: ");
        // dai = sc.nextFloat();
        // rong = sc.nextFloat();
        // System.out.printf("Chu vi: %.2f\n", (dai + rong) * 2);
        // System.out.printf("Diện tích: %.2f\n", dai * rong);

        String ho, ten;
        int tuoi;
        String s;
        char kt;
        System.out.print("Nhap ho: ");
        ho = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap ten: ");
        sc.nextLine();
        ten = sc.nextLine();
        System.out.println(ho + " " + ten + " " + tuoi + " tuoi");
        System.out.print("Nhap cau: ");
        s = sc.next();
        System.out.print("Nhap ky tu:  ");
        kt = sc.next().charAt(0);
        System.out.println(s + " " + kt);
        System.out.print("Nhap cau: ");
        String ss = sc.next();
    }
}