import java.util.Scanner;

public class TukarNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nilai A: ");
        int a = input.nextInt(); 
        System.out.print("Masukkan nilai B: ");
        int b = input.nextInt();

        // Menampilkan nilai awal
        System.out.println("Nilai sebelum ditukar: A = " + a + ", B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        // Menampilkan nilai setelah ditukar
        System.out.println("Nilai setelah ditukar: A = " + a + ", B = " + b);

    }
}
