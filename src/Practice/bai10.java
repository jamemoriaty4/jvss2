package Practice;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập lương cơ bản");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("nhập so ngày công: ");
        int dayw = Integer.parseInt(sc.nextLine());

        int addDay = Math.max(dayw-26,0);

        double salaryOften= salary/26;
        double salaryAdd = salaryOften*1.5;

        double salaryReal = salaryAdd*26+salaryOften*addDay;
        System.out.printf("Lương của nhân viên là %f",salaryReal);
    }
}
