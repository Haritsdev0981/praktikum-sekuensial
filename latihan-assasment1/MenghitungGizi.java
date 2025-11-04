import java.util.Scanner;

public class MenghitungGizi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usiaBalita;
        double beratBalita, tinggiBalita;
        double bbUnderMax = 0, bbOverMin = 0;
        double pbUnderMax = 0, pbOverMin = 0;
        String statusBbBalita, statusTbBalita, tingkatGizi;

        System.out.print("Masukkan usia balita (1-5 bulan): ");
        usiaBalita = sc.nextInt();

        if (usiaBalita < 1 || usiaBalita > 5) {
            System.out.println("Usia harus antara 1-5 bulan!");
            sc.close();
            return;
        }

        System.out.print("Masukkan berat badan balita (kg): ");
        beratBalita = sc.nextDouble();

        System.out.print("Masukkan panjang badan balita (cm): ");
        tinggiBalita = sc.nextDouble();

        switch (usiaBalita) {
            case 1:
                bbUnderMax = 2.9; bbOverMin = 6.6;
                pbUnderMax = 48.9; pbOverMin = 60.6;
                break;
            case 2:
                bbUnderMax = 3.8; bbOverMin = 8.0;
                pbUnderMax = 52.4; pbOverMin = 64.4;
                break;
            case 3:
                bbUnderMax = 4.4; bbOverMin = 9.0;
                pbUnderMax = 55.3; pbOverMin = 67.6;
                break;
            case 4:
                bbUnderMax = 4.9; bbOverMin = 9.7;
                pbUnderMax = 57.6; pbOverMin = 70.1;
                break;
            case 5:
                bbUnderMax = 5.3; bbOverMin = 10.4;
                pbUnderMax = 59.6; pbOverMin = 72.2;
                break;
        }

        if (beratBalita <= bbUnderMax) {
            statusBbBalita = "Under";
        } else if (beratBalita >= bbOverMin) {
            statusBbBalita = "Over";
        } else {
            statusBbBalita = "Normal";
        }

        if (tinggiBalita <= pbUnderMax) {
            statusTbBalita = "Under";
        } else if (tinggiBalita >= pbOverMin) {
            statusTbBalita = "Over";
        } else {
            statusTbBalita = "Normal";
        }

        if (statusBbBalita == "under" && statusTbBalita == "Under") {
            tingkatGizi = "Kurang";
        } else if (statusBbBalita.equals("Over") && statusTbBalita.equals("Over")) {
            tingkatGizi = "Berlebih";
        } else {
            tingkatGizi = "Normal";
        }

        System.out.println("\n--- Hasil Penilaian Gizi ---");
        System.out.println("Usia Balita        : " + usiaBalita + " bulan");
        System.out.println("Status Berat Badan : " + statusBbBalita);
        System.out.println("Status Panjang Badan : " + statusTbBalita);
        System.out.println("Tingkat Gizi Balita : " + tingkatGizi);

        sc.close();
    }
}
