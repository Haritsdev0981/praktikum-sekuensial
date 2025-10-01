import java.util.Scanner;

public class TugasAkhirDua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jamKeMenit, menitKeDetik, sisaDetik;

        System.out.print("Masukkan jam yang akan dikonversikan: ");
        int jam = sc.nextInt();
        jamKeMenit = jam * 60;

        System.out.print("Masukkan menit yang akan dikonversikan: ");
        int menit = sc.nextInt();
        menitKeDetik = menit * 60;

        System.out.print("Masukkan detik yang akan ditampilkan: ");
        int detik = sc.nextInt();
        sisaDetik = detik;

        // Hasil konversi
        System.out.println("Hasil konversi jam ke menit : " + jamKeMenit + " menit");
        System.out.println("Hasil konversi menit ke detik : " + menitKeDetik + " detik");
        System.out.println("Detik yang dimasukkan : " + sisaDetik + " detik");

        sc.close();
    }
}