package Practice;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập điểm Html");
        int Html = Integer.parseInt(sc.nextLine());
        System.out.println("nhập điểm css");
        int Css = Integer.parseInt(sc.nextLine());
        System.out.println("nhập điểm js");
        int js = Integer.parseInt(sc.nextLine());

        double avgMark= (Html+js+Css)/3;
        if(avgMark>=0&&avgMark<5){
            System.out.println("yếu");
        }else if(avgMark<7){
            System.out.println("trung bình");
        } else if (avgMark<8) {
            System.out.println("Khá");
        } else if (avgMark<9) {
            System.out.println("giỏi");
        }else System.out.println("xuất săc");
    }
}
