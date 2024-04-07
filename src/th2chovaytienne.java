import java.util.Scanner;

public class th2chovaytienne {
    public static void main(String[] args){
        double tien = 1;
        int thang = 1;
        double lai = 10;
        Scanner nhap = new Scanner(System.in);
        System.out.println("so tien ban muon gui: ");
        tien = nhap.nextDouble();
        System.out.println("so thang ban muon gui: ");
        thang =nhap.nextInt();
        double sotienlai =0 ;
        for ( int i = 0; i < thang; i++);
        sotienlai += tien * (lai/100)/12 * thang;
        System.out.println("tien lai cua ban la: " + sotienlai);
    }

}
