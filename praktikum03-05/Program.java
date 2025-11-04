import java.util.*;

public class Program {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int large, medium, small, entry, weight;

        large = 0;
        medium = 0;
        small = 0;
        entry = 0;
        String answer;

        do {
            System.out.print("Masukkan berat Buah : ");
            weight = input.nextInt();
            if (weight >= 150) {
                System.out.println("Buah masuk ke-kelompok BESAR");
                large = large + 1;
            } else {
                if (weight >= 100 && weight <= 150) {
                    System.out.println("Buah masuk ke-kelompok SEDANG");
                    medium = medium + 1;
                } else {
                    System.out.println("Buah masuk ke-kelompok KECIL");
                    small = small + 1;
                }
            }
            System.out.println("Mau tambahkan lebih banyak buah? (Y/N)");
            answer = input.next();
            entry = entry + 1;
        } while (answer.equals("Y") || answer.equals("y"));
        System.out.println("Jumlah buah BESAR : " + large);
        System.out.println("Jumlah buah SEDANG : " + medium);
        System.out.println("Jumlah buah KECIL : " + small);
        System.out.println("Jumlah buah yang di entry : " + entry);
        if (small > medium && small > large) {
            System.out.println("Buah terbanyak berukuran KECIL sejumlah " + small);
        } else {
            if (medium > small && medium > large) {
                System.out.println("Buah terbanyak berukuran SEDANG sejumlah" + medium);
            } else {
                System.out.println("Buah terbanyak burukuran BESAR sejumlah " + large);
            }
        }
    }
}
