import java.util.Scanner;
public class KumpulanLuas {
    public static Scanner scanner = new Scanner(System.in);

    public static void HitungLuasSegitiga(){
        int alas, tinggi;

        System.out.print("Masukkan Panjang alas: ");
        alas = scanner.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = scanner.nextInt();
        System.out.println("Luas Segitiga = " + LuasSegitiga(alas, tinggi));
    }

    public static void HitungLuasLingkaran(){
        int jari;

        System.out.print("Masukkan jari-jari: ");
        jari = scanner.nextInt();
        System.out.println("Luas Lingkkaran: "+LuasLingkaran(jari));
        scanner.close();
    }

    public static double LuasSegitiga(int alas, int tinggi) {
        //int alas, tinggi;
        double luasSegitiga;
        //alas = 10;
        //tinggi = 5;
        luasSegitiga = 0.5 * alas * tinggi;
        return luasSegitiga;
    }

    public static double LuasLingkaran(int jari) {
        double luasLingkaran;
        luasLingkaran = 3.14 * jari * jari;
        return luasLingkaran;
    }
    public static void main(String[] args) {

        int pilihan;
        System.out.print("Pilih menu [1:Luas Segitiga, 2:Luas Lingkaran]");
        pilihan = scanner.nextInt();
        switch (pilihan) {
            case 1:
                HitungLuasSegitiga();
                break;
            
            case 2:
                HitungLuasLingkaran();
                break;
        
            default:
                System.out.println("Pilihan Salah!!");
                break;
        }
    }
        
}