import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Masukkan Bilangan X s.d Y");
        System.out.print("Masukkan Bilangan X: ");
        x = sc.nextInt();
        System.out.print("Masukkan Bilangan Y: ");
        y = sc.nextInt();

        // while
        // while (x <= y) {
        //     System.out.println("Angka: " + x); 
        //     x++;
        // }

        if (x>y) {
            System.out.println("X harus lebih kecil dari Y");
        } else{
             while (x <= y) {
            System.out.println("Angka: " + x); 
            x++;
        }
        }
    }
}