import java.util.Scanner;

public class TugasAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int detik, jam, menit, sisaDetik;

        System.out.print("Masukkan total waktu dalam detik: ");
        detik = input.nextInt();
        jam = detik / 3600;
        sisaDetik = detik % 3600;
        menit = sisaDetik / 60;
        sisaDetik = detik % 60;

        System.out.println("Jumlah Jam: "+ jam);
        System.out.println("Jumlah Menit: "+ menit);
        System.out.println("Jumlah Sisa detik: "+ sisaDetik);

        input.close();
    }
}
