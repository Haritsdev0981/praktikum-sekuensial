package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class TaArrayList {

    public static void daftarAksi() {
        System.out.println("Pilih aksi:");
        System.out.println("1. Tambah pasien ke akhir antrian");
        System.out.println("2. Layani pasien terdepan (Hapus pasien terdepan)");
        System.out.println("3. Tampilkan jumlah dan daftar antrian");
        System.out.println("4. Keluar");
    }

    public static void antrianPasien(ArrayList<String> antrian) {
        System.out.println("==== Antrian Pasien ====");
        System.out.println("Jumlah pasien dalam antrian: " + antrian.size());
        System.out.println("Daftar antrian (Depan -> Belakang)):");
        for (int i = 0; i < antrian.size(); i++) {
            System.out.println((i + 1) + ". " + antrian.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> antrianPasien = new ArrayList<>();

        System.out.println("==== Selamat Datang di Sistem Pendaftaran Pasien ====");

        int jumlahPasienAwal = 0;
        System.out.print("Masukkan jumlah pasien yang akan didaftarkan: ");
        jumlahPasienAwal = sc.nextInt();

        for (int i = 0; i < jumlahPasienAwal; i++) {
            System.out.print("Masukkan jumlah pasien ke-" + (i + 1) + " : ");
            String namaPasien = sc.next();
            antrianPasien.add(namaPasien);
        }

        if (jumlahPasienAwal > 0) {
            antrianPasien(antrianPasien);
        }

        int pilihan = 0;
        boolean inputValid = false;
        do{
            daftarAksi();

            System.out.print("Pilih opsi (1-4): ");
                if (sc.hasNextInt()) {
                    pilihan = sc.nextInt();
                    sc.nextLine();
                    if (pilihan >= 1 && pilihan <= 4) {
                        inputValid = true;
                    } else {
                        System.out.println("Pilihan tidak valid. Harap masukkan angka antara 1 sampai 4.");
                    }
                } else {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    sc.nextLine();
                }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pasien baru: ");
                    String namaBaru = sc.nextLine();
                    antrianPasien.add(namaBaru);
                    System.out.println("Pasien " + namaBaru + " berhasil ditambahkan ke akhir antrian.");
                    antrianPasien(antrianPasien);
                    break;
                case 2:
                        String pasienDilayani = antrianPasien.remove(0);
                        System.out.println("Pasien " + pasienDilayani + " telah dilayani (dihapus dari antrian).");
                        antrianPasien(antrianPasien);
                    break;
                case 3:
                    antrianPasien(antrianPasien);
                    break;

                default:
                    System.out.println("Terima kasih telah menggunakan sistem pendaftaran pasien.");
            }
        }while(pilihan != 4);
        sc.close();
        
    }

}