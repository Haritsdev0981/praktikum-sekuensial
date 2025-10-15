import java.util.Scanner;

public class tugasAkhirTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jenis Kendaraan: ");
        String jenisKendaraan = sc.nextLine();
        System.out.print("Masukkan Waktu Parkir: ");
        int waktuParkir = sc.nextInt();

        // if-else
        // if(jenisKendaraan.equals("Mobil")){
        //     System.out.println("Total biaya Parkir untuk Mobil: " + waktuParkir * 5000);
        // } else if (jenisKendaraan.equals("Motor")) {
        //     System.out.println("Total biaya Parkir untuk Motor: " + waktuParkir * 2000);
        // } else if (jenisKendaraan.equals("Truk")) {
        //     System.out.println("Total biaya Parkir untuk Truk: " + waktuParkir * 10000);
        // } else {
        //     System.out.println("GADA KENDARAAN LU COY");
        // }
        
        // switch-case
        switch (jenisKendaraan) {
            case "Mobil", "mobil":
                System.out.println("Total biaya Parkir untuk Mobil: " + waktuParkir * 5000);
                break;
            case "Motor", "motor":
                System.out.println("Total biaya Parkir untuk Motor: " + waktuParkir * 2000);
                break;
            case "Truk", "truk":
                System.out.println("Total biaya Parkir untuk Truk: " + waktuParkir * 10000);
                break;
            default:
                System.out.println("GADA KENDARAAN LU COY");
                break;
        }
    }
}
