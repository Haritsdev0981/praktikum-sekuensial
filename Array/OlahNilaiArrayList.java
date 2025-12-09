package Array;
import java.util.Scanner;
import java.util.ArrayList;

public class OlahNilaiArrayList {
    public static ArrayList <Double> arrNilai = new ArrayList <Double>();
    public static Scanner sc = new Scanner(System.in);
    public static double[] komponenNilai = {0.15, 0.1, 0.05, 0.3, 0.4}; 
   
    
    public static void inputNilai() {
        for (int i=0; i<komponenNilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+i+": ");
            arrNilai.add(sc.nextDouble());
        }
    }
    
    public static double kalkulasiNilaiAkhir() {
        double nilaiAkhir = 0;

        for (int i=0; i<arrNilai.size(); i++) {
            nilaiAkhir += arrNilai.get(i)* komponenNilai [i];
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