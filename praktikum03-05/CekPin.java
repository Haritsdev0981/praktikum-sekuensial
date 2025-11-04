import java.util.Scanner;

public class CekPin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // final int PIN_BENAR = 1234;
        // int percobaan = 0;
        // boolean akses = false;

        // while (percobaan < 3) {
        //     System.out.print("Masukkan PIN: ");
        //     int pin = input.nextInt();
        //     percobaan++;

        //     switch (pin) {
        //         case PIN_BENAR:
        //             System.out.println("PIN benar! Akses diterima.");
        //             akses = true;
        //             break;
        //         default:
        //             System.out.println("PIN salah! Coba lagi.");
        //             break;
        //     }

        //     if (akses) {
        //         break; 
        //     }

        //     if (percobaan == 3) {
        //         System.out.println("PIN terblokir. Hubungi admin.");
        //     }
        // }

        int pin;

        do{
            System.out.print("Masukkan Pin: ");
            pin = input.nextInt();
            if (pin == 12345) {
                System.out.println("PIN benar! Akses diterima");
                break;
            } else{
                System.out.println("PIN salah! Coba lagi");
            }
        }while(pin == 12345);
        System.out.println("PIN terblokir. Hubungi admin");

        input.close();
    }
}