import java.util.Scanner;

public class TpTujuh {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void Komunitas(String a, int b, int c){
        
        int i = 1;
        int totalDonasi= 0;
        System.out.print("Masukkan nama Komunitas: ");
        a = scanner.next();
        System.out.print("Masukkan jumlah anggota komunitas: ");
        b = scanner.nextInt();

        while (i <= b) {
            System.out.print("masukkan donasi anggota ke- " + i + " = ");
            c = scanner.nextInt();
            i++;
            totalDonasi += c;
        }
        System.out.print("Total donasi " + a + " adalah: " + totalDonasi);
    }

    public static int KomunitasTest(String a, int b, int c){
        int i = 1;
        int totalDonasi= 0;
        System.out.print("Masukkan nama Komunitas: ");
        a = scanner.next();
        System.out.print("Masukkan jumlah anggota komunitas: ");
        b = scanner.nextInt();

        while (i <= b) {
            System.out.print("masukkan donasi anggota ke- " + i + " = ");
            c = scanner.nextInt();
            i++;
            totalDonasi += c;
        }
        return totalDonasi;

    }

    public static void main(String[] args) {
        String namaKomunitas = null; 
        int jumlahAnggota = 0;
        int jumlahDonasi = 0;
        Komunitas(namaKomunitas, jumlahAnggota, jumlahDonasi);
    }
}
