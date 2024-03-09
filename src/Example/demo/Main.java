package Example.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ticketPrice = 7000;
        System.out.println("nhập vào số tuổi của người đi xe bus: ");
        Scanner sc = new Scanner(System.in);
//        int x = Integer.parseInt(sc.nextLine());
//        if(x <6 || x>=60){
//            System.out.println("Miễn phí vé đi xe BUS HN");
//        } else if (x<=18) {
//            System.out.printf("Giá vé của bạn là %.0f VND", ticketPrice/2);
//        }else
//        {
//            System.out.printf("Giá vé của bạn là %.0f VND", ticketPrice);
//        }
//    Switch
//        System.out.println("hãy nhập vào 1 tuwf tiếng anh");
//        String word = sc.nextLine();
//        switch (word){
//            case "cat":
//                System.out.println("Đó là con mèo!");
//                break;
//            case "dog":
//                System.out.println("Đó là con chó!");
//                break;
//            case "tiger":
//                System.out.println("đây là con hổ");
//                break;
//            default:
//                System.err.println("không tìm thấy kết quả phù hợp!");
//        }
//        Vòng lặp for
//        int n = Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < n; i++) {
//            System.out.println("i = "+ i);
//        }
//        for (int i = 0; i < 10; i++) { // vòng lặp in các hàng
//            for (int j = 0; j < 20; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println(); // in cac cột
//        }

//        Vòng lặp while và do-while

//        int sum=0;
//        while(true){
//            int x = Integer.parseInt(sc.nextLine());
//            if(x==0){
//                break;
//            }
//            sum+=x;
//        }
//        System.out.println("tổng các số vừa nhập là : "+sum);
//        do-while
//        int x,sum;
//        do{
//            System.out.println("nhập giá trị cho số: ");
//             x = Integer.parseInt(sc.nextLine());
//             sum=0;
//            sum+=x;
//        }while(x!=0);
//        System.out.println("sum= "+sum);

//        continue

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;//bỏ qua vòng lặp hiện tại sang vòng lặp mới
            }
            System.out.println(i);
        }
//return

        while (true) {
            System.out.println("hãy nhập vào 1 chuỗi");
            String str = sc.nextLine();
            if (str.isBlank()) {
                System.err.println("bạn vừa nhập chui rỗng!");
                return;//dứng hàm tại vị trí đó ngay lập tức và trả về
            }
            System.out.println("chuỗi bạn vừa nhập là " + str);
            break;
        }

    }
}
