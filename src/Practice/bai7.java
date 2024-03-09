package Practice;

import java.util.Scanner;

public class bai7 {
    public static boolean kiemTraNam(int x){
        if(x%4==0&&x%100!=0||x%400==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số năm");
        int year= Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào tháng thứ: ");
        int months= Integer.parseInt(sc.nextLine());
        switch (months) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("tháng %d trong năm %d co 31 ngày",months,year);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("tháng %d trong nam %d có 30 ngày",months,year);
                break;
            case 2:
                if(kiemTraNam(year)){
                    System.out.printf("tháng %d trong năm %d có 29 ngày",months,year);

                }else System.out.printf("tháng %d trong năm %d có 28 ngày",months,year);
                break;
            default:
                System.out.println("error!");
        }

    }
}
