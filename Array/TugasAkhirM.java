package Array;

import java.util.Scanner;

public class TugasAkhirM {
    static Scanner sc = new Scanner(System.in);

    public static String[] inputHadir(Scanner input, String namaKelas) {
        System.out.print("Masukkan jumlah siswa di kelas " + namaKelas + " : ");
        int jumlahSiswa = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan kode kehadiran (H/S/I/A) untuk setiap siswa : ");
        String[] arrKehadiran = new String[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Siswa ke - " + (i + 1) + " : ");
            arrKehadiran[i] = input.nextLine().toUpperCase();
        }

        return arrKehadiran;

    }

    public static void tampilKehadiran(String[] kehadiran){
         for (int i = 0; i < kehadiran.length; i++) {
            System.out.print("Siswa ke -" +kehadiran[i]);

            System.out.println("");

        }

        int tidakHadir = jumlahRekap(kehadiran);
        System.out.print("Jumlah siswa tidak hadir :" +tidakHadir);
    }

    public static int jumlahRekap (String[] kehadiran){
        int count = 0;
        for (String kode :kehadiran) {
            if (!kode.equals("H")) {
            count++;
        
        }
    }
        return count;
        
    }

    public static void main(String[] args) {

        System.out.println("=== Program Rekap Kehadiran Siswa ===");

        System.out.print("Masukkan Jumlah Kelas : ");
        int jumlahKelas = sc.nextInt();
        sc.nextLine();

        String[] namaKelas = new String[jumlahKelas];
        String[][] kehadiran = new String[jumlahKelas][];

        for (int i = 0; i < jumlahKelas; i++) {
            System.out.print("Masukkan Nama Kelas ke-" + (i + 1) + " : ");
            namaKelas[i] = sc.nextLine();

            kehadiran[i] = inputHadir(sc, namaKelas[i]);

        }

        for (int j = 0; j < jumlahKelas; j++) {
            tampilKehadiran(kehadiran[j]);
        }


    }
}