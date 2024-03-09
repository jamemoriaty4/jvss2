package practice_br;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int sum =0;
        for (int i = 0; i < 11; i++) {
            if(i%2!=0){
                continue;
            }
            sum+=i;
        }
        System.out.println("tổng các số chẵn tư 1 đến 10 là :"+sum);
    }
}
