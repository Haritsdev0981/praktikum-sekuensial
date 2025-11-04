import java.util.Scanner;
public class DurasiKerja {
    public static void main(String[] args) {
        int durasi, jamMulai, jamAkhir;
        Scanner sc = new Scanner(System.in);
        jamMulai = sc.nextInt();
        jamAkhir = sc.nextInt();
        durasi = jamAkhir -= jamMulai; 
        if (durasi > 8) {
            System.out.println("Overtime");
        } else if (durasi == 8) {
            System.out.println("Normal");
        } else {
            System.out.println("Kurang");;
        }
        sc.close();
    }
}