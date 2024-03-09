package Practice;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int tiendien =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập so điẹn cũ : ");
        int oldE = Integer.parseInt(sc.nextLine());
        System.out.println("nhập so điẹn moi : ");
        int newE = Integer.parseInt(sc.nextLine());
        int tongE = newE-oldE;
        int rank = tongE/50;
        int mod = tongE%50;

        int tongNguyen = 50*(rank*(2*10000+(rank-1)*5000)/2);
        int tongDu = (10000+rank*5000)*mod;
        tiendien=tongDu+tongNguyen;
        System.out.printf("tổng so tien dien la %d ",tiendien);
    }
}
