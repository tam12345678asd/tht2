import java.util.Scanner;

public class th2timuocsochung {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner so = new Scanner(System.in);
        System.out.println("nhap so a:");
        a = so.nextInt();
        System.out.println("nhap so b:");
        b = so.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if( a==0 || b==0 );
        System.out.println("khong co uoc chung lon nhat");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        System.out.println("la uoc chung lon nhat" +a);
    }
}
