import java.util.Scanner;
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        // Meminta input angka dari pengguna System.out.print("Masukkan angka pertama: "); double angka1 = input.nextDouble(); System.out.print("Masukkan angka kedua: "); double angka2 = input.nextDouble();
        // Melakukan operasi matematika 

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble(); 

        System.out.print("Masukkan angka kedua: "); 
        double angka2 = input.nextDouble();

        double hasilPenjumlahan = angka1 + angka2;
        double hasilPengurangan = angka1 - angka2;
        double hasilPerkalian = angka1 * angka2;
        double hasilPembagian = angka1 / angka2;

        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);
    }
}