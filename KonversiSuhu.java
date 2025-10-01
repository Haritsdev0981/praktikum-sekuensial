import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suhuCelcius;
        double suhuFahrenheit;

        System.out.println("Masukkan suhu yang akan dikonversi: ");
        suhuCelcius = sc.nextInt();
        suhuFahrenheit = suhuCelcius * 9 / 5 + 32;
        System.out.println("Hasil konversi ke Fahrenheit adalah: " + suhuFahrenheit);
         sc.close();
    }
}
