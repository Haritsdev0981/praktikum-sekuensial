import java.util.Scanner;

public class nilaiSiswa {

    public static double hitungRata(double[] nilai) {
        double total = 0;
        for (double n : nilai) {
            total += n;
        }
        return total / nilai.length;
    }

    public static double hitungRataKelas(double[] rataSiswa) {
        double total = 0;
        for (double r : rataSiswa) {
            total += r;
        }
        return total / rataSiswa.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Siswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        double[] rataSiswa = new double[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData siswa ke-" + (i + 1));

            System.out.print("Nama Siswa : ");
            String siswa = input.nextLine();

            System.out.print("Jumlah nilai ujian : ");
            int jumlahNilai = input.nextInt();

            double[] totalNilai = new double[jumlahNilai];

            for (int j = 0; j < jumlahNilai; j++) {
                System.out.print("Nilai ke-" + (j + 1) + " : ");
                totalNilai[j] = input.nextDouble();
            }
            input.nextLine();

            double rata = hitungRata(totalNilai);
            rataSiswa[i] = rata;

            System.out.println("Rata-rata " + siswa + " : " + rata);
        }

        System.out.println("\nRata-rata kelas : " + hitungRataKelas(rataSiswa));
    }
}
