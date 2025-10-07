import java.util.*;
import java.lang.Math;

public class MultiWaysSelection {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeKampus;

        System.out.print("Masukkan Kode Kampus: ");

        kodeKampus = input.nextLine();
        if (kodeKampus.equals("TUB")) {
            System.out.println("Kampus Utama");
        } else {
            if (kodeKampus.equals("TUJ")) {
                System.out.println("Kampus Jakarta");
            } else {
                if (kodeKampus.equals("TUP")) {
                    System.out.println("Kampus Purwokerto");
                } else {
                    System.out.println("Kampus Surabaya");
                }
            }
        }
    }
}
