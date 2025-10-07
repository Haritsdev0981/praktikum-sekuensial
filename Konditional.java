import java.util.Scanner;

public class Konditional {
    public static void main(String[] args) {
        Scanner warnaInput = new Scanner(System.in);
        String warna;
        
        System.out.print("Masukkan warna: ");
        warna = warnaInput.nextLine();
        warnaInput.close();

        if ( warna == "Hitam") {
            System.out.println("HITAMMMMM");
        } else{
            System.out.println("BUKAN WOI");
        }

    }
}
