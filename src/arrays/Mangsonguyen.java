package arrays;

import java.util.Scanner;

public class Mangsonguyen {

    public static void main(String[] args) {
        //nhập phần tử
        Scanner sn = new Scanner(System.in);
        System.out.println("nhap so phan tu: ");
        int Pt = sn.nextInt();
        // nhập mảng
        int[] sn1 = new int[Pt];
        System.out.println("nhap phan tu cho mang: ");
        for (int i = 0; i < Pt; i++) {
            System.out.println("phan tu thu " + (i + 1) + ":");
            sn1[i] = sn.nextInt();
        }
        //tính trung bình cộng
        double sum = 0;
        for (int i = 0; i < Pt; i++) {
            sum += sn1[i];
        }
        double average = sum / Pt;
        System.out.print("trung binh cong cua mang la: " + average);
        System.out.println("");
    }
}
