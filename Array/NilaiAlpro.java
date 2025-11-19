import java.util.Scanner;

public class NilaiAlpro {
    public static double[] arrNilai = new double[5];
    public static double[] komponenNilai = {0.15, 0.1, 0.05, 0.3, 0.4}; 
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void inputNilai() {
        for (int i=0; i<arrNilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+i+": ");
            arrNilai[i] = sc.nextDouble();
        }
    }
    
    public static double kalkulasiNilaiAkhir() {
        double nilaiAkhir = 0;

        for (int i=0; i<arrNilai.length; i++) {
            nilaiAkhir += arrNilai[i] * komponenNilai[i];
        }

        return nilaiAkhir;
    } 

    public static String indeksNilai(double nilaiAkhir) {
        String indeks;
        //menghitung indeks (no 4)
        if (nilaiAkhir > 85) {
            indeks = "A";
        } else {
            if (nilaiAkhir > 70) {
                indeks = "AB";
            } else {
                if (nilaiAkhir > 60) {
                    indeks = "B";
                }  else {
                    if (nilaiAkhir > 55) {
                        indeks = "BC";
                    }  else {
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
        inputNilai();
        sc.close();
        System.out.println("Nilai akhir = "+kalkulasiNilaiAkhir());
        System.out.println("Indeks nilai = "+indeksNilai(kalkulasiNilaiAkhir()));
    }
}
