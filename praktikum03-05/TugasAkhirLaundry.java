import java.util.Scanner;

public class TugasAkhirLaundry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Nama pembeli: ");
        String namaPembeli = sc.nextLine();
        System.out.print("Masukkan Jumlah hari laundry: ");
        int jumlahHari = sc.nextInt();
        float totalLaundry = 0;

        for(int i = 1; i <= jumlahHari; i++){
            System.out.println("Masukkan hari= " + i);
            System.out.print("Masukkan berat laundry : ");
            float beratLaundry = sc.nextFloat();
            float biaya = 0;
            if (beratLaundry <= 3) {
                biaya = beratLaundry * 7000;
                System.out.println("Total biaya laundry hari ke-"+ i + " adalah "+ biaya);
            } else {
                biaya = beratLaundry * 6000;
                System.out.println("Total biaya laundry ke-"+ i + " adalah " + biaya);
            }
            totalLaundry = biaya + totalLaundry;
        }
        System.out.println("Total harga yang harus dibayar oleh " + namaPembeli + " adalah " + totalLaundry);
    }
}
