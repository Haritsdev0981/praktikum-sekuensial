package quiz;
import java.util.Scanner;

public class Nomor1 {

    public static int hitungHonor(int jam) {
        if (jam <= 16) {
            return jam * 10000;
        } else {
            int sisa = jam - 16;
            return (16 * 10000) + (sisa * 15000);
        }
    }

    public static void tambahData(int[] jamLembur, Scanner sc) {
        for (int i = 0; i < jamLembur.length; i++) {
            System.out.print("Masukkan jam lembur pegawai ke-" + (i + 1) + ": ");
            jamLembur[i] = sc.nextInt();
        }
    }

    public static int hitungTotalHonor(int[] jamLembur) {
        int total = 0;
        for (int jam : jamLembur) {
            total += hitungHonor(jam);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pegawai: ");
        int jumlah = sc.nextInt();

        int[] jamLembur = new int[jumlah];

        tambahData(jamLembur, sc);

        int totalHonor = hitungTotalHonor(jamLembur);

        System.out.println("Total honor lembur yang harus dibayar = Rp " + totalHonor);

        sc.close();
    }
}
