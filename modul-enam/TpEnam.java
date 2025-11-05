import java.util.Scanner;

public class TpEnam {

    public static String cekKelayakanKredit(double penghasilanBulanan, double cicilan){
        
        if (cicilan / penghasilanBulanan < 0.3) {
            return "Kredit disetujui";
        } else{
            return "Kredit ditolak";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan penghasil bulanan: ");
        double penghasilanBulanan = input.nextDouble();
        System.out.print("Masukkan jumlah cicilan: ");
        double cicilan = input.nextDouble();

        System.out.println(cekKelayakanKredit(penghasilanBulanan, cicilan));

        input.close();
    }
}
