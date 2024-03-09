package Practice;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào so: ");
        int x = Integer.parseInt(sc.nextLine());
        if(x%3==0&&x%5==0){
            System.out.printf("%d chia hết cho 3 và 5",x);
        }else System.out.printf("%d không chia hết cho 3 và 5",x);
    }
}
