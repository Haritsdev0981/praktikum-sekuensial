import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pendapatanMenu = 0;
        String namaCafe, namaMenu;
        int jumlahHari, harga, porsi;
        int totalPendapatanKeseluruhan = 0;

        System.out.print("Masukkan nama Cafe: ");
        namaCafe = sc.nextLine();

        System.out.print("Masukkan jumlah hari jualan: ");
        jumlahHari = sc.nextInt();

        for(int hari = 1; hari <= jumlahHari; hari++){
             System.out.print("Masukkan jumlah menu yang terjual hari ke-" + hari + ": ");
            int jumlahMenu = sc.nextInt();
            sc.nextLine();

            for (int jumlah = 1; jumlah <= jumlahMenu; jumlah++) {
                System.out.println("Menu ke-" + jumlah);
                System.out.println("Masukkan nama menu ke-" + jumlah + ": ");
                namaMenu = sc.nextLine();

                System.out.print("Masukkan harga menu ke-" + jumlah + ": ");
                harga = sc.nextInt();

                System.out.print("Masukkan jumlah porsi menu ke-" + jumlah + ": ");
                porsi = sc.nextInt();

                pendapatanMenu = harga * porsi;
                totalPendapatanKeseluruhan += pendapatanMenu;
            }
            System.out.println("Total Pendapatan hari ke-" + hari + " adalah: Rp " + pendapatanMenu);
        }
        System.out.println("Total Pendapatan " + namaCafe + " selama " + jumlahHari + " adalah " + totalPendapatanKeseluruhan);
    }
}
