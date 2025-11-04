import java.util.*;

public class MenghitungIP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSks = 0;
        double totalBobot = 0;
        String tambahLagi = "Y";

        do {
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String namaMatkul = sc.nextLine();

            System.out.print("Masukkan Besar SKS: ");
            int sks = Integer.parseInt(sc.nextLine());

            System.out.print("Masukkan Indeks Nilai (A, AB, B, BC, C, D, E): ");
            String indeksNilai = sc.nextLine().toUpperCase();

            double angkaMutu = 0;
            switch (indeksNilai) {
                case "A":
                    angkaMutu = 4.0;
                    break;
                case "AB":
                    angkaMutu = 3.5;
                    break;
                case "B":
                    angkaMutu = 3.0;
                    break;
                case "BC":
                    angkaMutu = 2.5;
                    break;
                case "C":
                    angkaMutu = 2.0;
                    break;
                case "D":
                    angkaMutu = 1.0;
                    break;
                case "E":
                    angkaMutu = 0.0;
                    break;
                default:
                    System.out.println("Indeks nilai tidak valid!");
                    continue; // Lanjut ke iterasi berikutnya
            }

            totalSks += sks;
            totalBobot += (sks * angkaMutu);

            System.out.print("Input matakuliah lagi [Y/N]? ");
            tambahLagi = sc.nextLine();

        } while (tambahLagi.equalsIgnoreCase("Y"));

        if (totalSks > 0) {
            double ip = totalBobot / totalSks;
            System.out.printf("Indeks Prestasi (IP) Anda adalah: %.2f\n", ip);
        } else {
            System.out.println("Tidak ada data untuk dihitung.");
        }

        sc.close();
    }
}