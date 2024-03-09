package Practice;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào đầu dãy");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào cuối dãy");
        int b = Integer.parseInt(sc.nextLine());
        int sum =0;
        for(int i=a;i<b;i++){
            sum+=i;
        }
        System.out.println("tổng của dãy là : "+ sum);
    }
}
