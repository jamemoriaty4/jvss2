package Practice;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập va năm: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("nhập va tháng: ");
        int months = Integer.parseInt(sc.nextLine());
        System.out.println("nhập va ngày: ");
        int day = Integer.parseInt(sc.nextLine());

        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ!");
            return;
        }

        if (months < 1 || months > 12) {
            System.out.println("Tháng không hợp lệ!");
            return;
        }

        if (year < 0) {
            System.out.println("Năm không hợp lệ!");
            return;
        }

        int soNgayTrongThang = kiemtra(months, year);
        if (day > soNgayTrongThang) {
            System.out.println("Ngày không hợp lệ!");
            return;
        }



    }

    public static boolean kiemTraNam(int x){
        if(x%4==0&&x%100!=0||x%400==0){
            return true;
        }
        return false;
    }
    public static int kiemtra(int months, int year){
        switch (months){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(kiemTraNam(year)){
                    return 29;

                }else {return 28;}

            default: return 0;

        }
    }
}
