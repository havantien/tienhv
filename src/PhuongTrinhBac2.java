import java.util.Scanner;

public class PhuongTrinhBac2 {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        a = sc.nextInt();
        System.out.println("nhap b");
        b = sc.nextInt();
        if ( a == 0){
            if ( b == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            float x = (float) -b/a;
            System.out.println("phuong trinh co 1 nghiem");
        }



    }

}
