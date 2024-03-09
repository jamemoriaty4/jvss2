package Practice;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("nhap canh b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("nhap canh c: ");
        double c = Double.parseDouble(sc.nextLine());
        if(a<b+c){
            if(b==c&&a==c){
                System.out.println("tam giác ddeu ");
            }else if((b==c)){
                System.out.println("tam giác cân");
            }else if(a*a == b*b+c*c){
                System.out.println("tam giác vuông");
            } else if ((a*a == b*b+c*c)&&(b==c)) {
                System.out.println("tam giác vuông cân");
            }else System.out.println("tam giác thường");
        }else System.out.printf("%d %d %d không tạo thành 1 tam giác");
    }
}
