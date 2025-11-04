import java.util.Scanner;

public class KantongAjaib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kapasitasA = 0, kapasitasB = 0, kapasitasC = 0, maxA = 20, maxB = 35, maxC = 10;
        int berat, noKantong;
        String pilihan;

        while (true) {
        System.out.print("Masukkan barang ke kantong berapa? ");
        noKantong = sc.nextInt();
        System.out.print("Berapa berat barang? ");
        berat = sc.nextInt();
        sc.nextLine();
        switch (noKantong) {
        case 1:
            kapasitasA += berat;
            break;
        case 2:
            kapasitasB += berat;
            break;
        case 3:
            kapasitasC += berat;
            break;
        }
            System.out.print("Input lagi [Y/N]? ");
            pilihan = sc.nextLine();
            if (pilihan.equalsIgnoreCase("N")) {
                break;
            }
        }
        double aTerpakai = (maxA - kapasitasA) * 100 / maxA;
        double bTerpakai = (maxB - kapasitasB) * 100 / maxB;
        double cTerpakai = (maxC - kapasitasC) * 100 / maxC;

        System.out.println("Total kantong A terisi " + kapasitasA + " kg. Kapasitas terisi " + aTerpakai + "%");
        System.out.println("Total kantong B terisi " + kapasitasB + " kg. Kapasitas terisi " + bTerpakai + "%");
        System.out.println("Total kantong C terisi " + kapasitasC + " kg. Kapasitas terisi " + cTerpakai + "%");
        sc.close();
    }
}