package quiz;

import java.util.Scanner;

public class Nomor2 {

    public static double hitungKomisi(double penjualan) {
        if (penjualan <= 500000) {
            return penjualan * 0.10;
        } else {
            double sisa = penjualan - 500000;
            return (500000 * 0.10) + (sisa * 0.15);
        }
    }


    public static void tambahData(double[] data, Scanner sc) {
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan total penjualan salesman ke-" + (i + 1) + ": Rp ");
            data[i] = sc.nextDouble();
        }
    }

    public static double hitungTotalKomisi(double[] data) {
        double total = 0;
        for (double penjualan : data) {
            total += hitungKomisi(penjualan);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah salesman: ");
        int jumlah = sc.nextInt();

        double[] penjualan = new double[jumlah];

        tambahData(penjualan, sc);

        double totalKomisi = hitungTotalKomisi(penjualan);

        System.out.println("Total komisi yang harus dibayarkan = Rp " + totalKomisi);

        sc.close();
    }
}
