package Practice;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số thứ nahat");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số thứ hai");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("nhập dấu cho biểu thức");
        String dau = sc.nextLine();
        switch (dau){
            case "+":
                System.out.printf("%d + %d = %d",a,b,a+b);
                break;
                case "-":
                System.out.printf("%d - %d = %d",a,b,a-b);
                break;
                case "*":
                System.out.printf("%d * %d = %d",a,b,a*b);
                break;
                case "/":
                System.out.printf("%d / %d = %d",a,b,a/b);
                break;
        }
    }
}
