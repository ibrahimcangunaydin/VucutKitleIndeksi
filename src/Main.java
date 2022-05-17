import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Boy,Kilo,kitleIndeksi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        Boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        Kilo =inp.nextDouble();

        kitleIndeksi = Kilo/(Boy*Boy);

        System.out.print("Vucut Kitle Indeksiniz: "+kitleIndeksi);

    }

}
