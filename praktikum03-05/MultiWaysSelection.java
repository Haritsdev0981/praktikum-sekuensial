import java.util.*;
import java.lang.Math;

public class MultiWaysSelection {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeKampus;

        System.out.print("Masukkan Kode Kampus: ");

        kodeKampus = input.nextLine();
        // Menggunakan If-elseif

        if (kodeKampus.equals("TUB")) {
            System.out.println("Kampus Utama");
        } else {
            if (kodeKampus.equals("TUJ")) {
                System.out.println("Kampus Jakarta");
            } else {
                if (kodeKampus.equals("TUP")) {
                    System.out.println("Kampus Purwokerto");
                } else if(kodeKampus == "TUS") {
                    System.out.println("Kampus Surabaya");
                } else{
                    System.out.println("KODE YANG ANDA MASUKKAN SALAH WOI");
                }
            }

        // Menggunakan switch-case

        int hari = 3;
    switch (hari) { 
        case 1:
        System.out.println( "Senin" );
                  break;
            case 2:
        System.out.println( "Selasa" );
                  break;
            case 3:
        System.out.println( "Rabu" );
                  break;
            case 4:
        System.out.println( "Kamis" );
                  break;
            case 5:
        System.out.println( "Jumat" );
                  break;
            default:
        System.out.println( "Hari tidak valid ");
    }
    }
}
}