package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class bai9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];

        System.out.print("Nhập số thứ 1: ");
        a[0] = sc.nextInt();

        System.out.print("Nhập số thứ 2: ");
        a[1] = sc.nextInt();

        System.out.print("Nhập số thứ 3: ");
        a[2] = sc.nextInt();

        System.out.print("Nhập số thứ 4: ");
        a[3] = sc.nextInt();


        Arrays.sort(a);


        System.out.println("Dãy số giảm dần: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

