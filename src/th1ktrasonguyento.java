import java.util.Scanner;

public class th1ktrasonguyento {
    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
        System.out.println("nhap so cua ban:");
        int so = number.nextInt();
        if ( so < 2 ){
            System.out.println(so + " " + "không phai la so nguyen to");
        }
        else{
            int i = 2;
            boolean ktra = true;
            while ( i < so ){
                if (so % i ==0 ) {
                    ktra = false;
                    break;
                }
                i++;
                }
            if (ktra)
                System.out.println(so +" " + "la so nguyen to");
            else
                System.out.println(so +" " +"khong phai so nguyen to");
            }
        }
    }
