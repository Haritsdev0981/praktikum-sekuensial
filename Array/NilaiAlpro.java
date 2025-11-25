package Array;

import java.util.Scanner;

public class NilaiAlpro {
    public static double[][] arrNilai = new double[3][5];
    public static String[] arrNama = { "Eza", "Raza", "Novi" };
    public static double[] komponenNilai = { 0.15, 0.1, 0.05, 0.3, 0.4 };

    public static Scanner sc = new Scanner(System.in);

    // public static String inputNilai(String namaMahasiswa) {
    // for (int i=0; i<arrNilai.length; i++) {
    // System.out.println("Isikan nilai untuk " + namaMahasiswa);
    // for(int j = 0; j < arrNilai[i].length; j++){
    // System.out.print("Masukkan nilai ke-"+i+": ");
    // arrNilai[i][j] = sc.nextDouble();
    // }
    // }
    // return namaMahasiswa;
    // }

    public static double kalkulasiNilaiAkhir(double[] arrNilai) {
        double nilaiAkhir = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            nilaiAkhir += arrNilai[i] * komponenNilai[i];
        }

        return nilaiAkhir;
    }

    public static String indeksNilai(double nilaiAkhir) {
        String indeks;
        // menghitung indeks (no 4)
        if (nilaiAkhir > 85) {
            indeks = "A";
        } else {
            if (nilaiAkhir > 70) {
                indeks = "AB";
            } else {
                if (nilaiAkhir > 60) {
                    indeks = "B";
                } else {
                    if (nilaiAkhir > 55) {
                        indeks = "BC";
                    } else {
                        if (nilaiAkhir > 50) {
                            indeks = "C";
                        } else {
                            if (nilaiAkhir > 40) {
                                indeks = "D";
                            } else {
                                indeks = "E";
                            }
                        }
                    }
                }
            }
        }
        return indeks;
    }

    public static void main(String[] args) {
        int i = 0;

        // for(i = 0; i<arrNama.length; i++){
        // inputNilai(namaMahasiswa);
        // System.out.println("Nilai akhir " + namaMahasiswa + "=" +
        // kalkulasiNilaiAkhir() + " dengan indeks nilai= " +
        // indeksNilai(kalkulasiNilaiAkhir()));
        // }
        // sc.close();
        // System.out.println("Nilai akhir = "+kalkulasiNilaiAkhir());
        // System.out.println("Indeks nilai = "+indeksNilai(kalkulasiNilaiAkhir()));
        // System.out.println("Nilai akhir " + namaMahasiswa + "=" +
        // kalkulasiNilaiAkhir() + " dengan indeks nilai= " +
        // indeksNilai(kalkulasiNilaiAkhir()));

        for(i = 0; i < arrNama.length; i++){
            double nilaiAkhir = kalkulasiNilaiAkhir(arrNilai[i]);
            System.out.print("Nilai Akhir untuk " + arrNama[i]+ " =");
            System.out.println(nilaiAkhir+" dan mendapatkan indeks nilai "+indeksNilai(nilaiAkhir));
        }

        for (i = 0; i < arrNama.length; i++) {
            System.out.println("Isikan nilai untuk " + arrNama[i]);
            for (int j = 0; j < arrNilai[i].length; j++) {
                int x = j + 1;
                System.out.print("Nilai ke-" + x + ": ");
                arrNilai[i][j] = sc.nextDouble();
            }
        }

        for (i = 0; i < arrNama.length; i++) {
            System.out.print(arrNama[i] + " memiliki nilai: ");
            for (double nilai : arrNilai[i]) {
                System.out.print(nilai + ", ");
            }
            System.out.println("");
        }

    }
}
