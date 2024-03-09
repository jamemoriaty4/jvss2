package practice_br;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        while(true ){
            int x = Integer.parseInt(sc.nextLine());
            if(x==0){
                break;
            } else if (x%2==1) {
                sum+=x;
            }
        }
        System.out.println("tổng các số lẻ nhập vào là : "+ sum
        );
    }
}
