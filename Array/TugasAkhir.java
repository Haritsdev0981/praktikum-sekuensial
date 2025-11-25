package Array;

import java.util.Scanner;

public class TugasAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Rekap Kehadiran Siswa ===");

        System.out.print("Masukkan jumlah kelas : ");
        int jumlahKelas = sc.nextInt();

        String[] namakelas = new String[jumlahKelas];
        String[][] kodeKehadiran = new String[jumlahKelas][];

        for (int i = 0; i < jumlahKelas; i++) {
            System.out.print("Masukkan nama kelas ke-" + (i+1) + ": ");
            namakelas[i] = sc.next();
            System.out.print("Masukkan jumlah siswa di kelas " + namakelas[i] + ": ");
            int jumlahSiswa = sc.nextInt();

            kodeKehadiran[i] = new String[jumlahSiswa];
            System.out.println("Masukkan kode Kehadiran (H/S/I/A) untuk setiap siswa: ");
            for (int j = 0; j < jumlahSiswa; j++) {
                System.out.print("Siswa ke-" + (j + 1) + ": ");
                kodeKehadiran[i][j] = sc.next();
            }

        }

        System.out.println("\n=== Program Rekap Kehadiran Siswa ===");
        for(int i=0; i< jumlahKelas; i++){
            System.out.println("Kelas ke-" + (i+1) + "i");

            int jumlahTidakHadir = 0;
            for(int j = 0; j < kodeKehadiran[i].length; j++){
                String kode = kodeKehadiran[i][j];
                System.err.println("Siswa ke-" + (j+1) + ": " + kode);
                if (!kode.equalsIgnoreCase("H")) {
                    jumlahTidakHadir++;
                }
            }
            System.err.println("Jumlah siswa yang tidak hadir: " + jumlahTidakHadir);
        }
        sc.close();
    }
}
