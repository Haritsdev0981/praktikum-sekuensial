package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<String>();

        //Menambahkan index di arrayLst
        cars.add("BMW"); // index 0
        cars.add("Toyota"); // index 1

        System.out.println("Ukuran array list = " + cars.size());

        //Menghapus index di arrayList
        cars.remove(0);
        System.out.println("Ukuran array list setelah 1 index dihapus = " + cars.size());
        for (int i = 1; i<6; i++){
            System.out.print("Isikan merk mobil ke-"+i+": ");
            cars.add(sc.nextLine());
        }
        sc.close();

        //Tampilkan semua index pada arrrayList
        for(int i = 0; i<cars.size(); i++){
            System.out.println("Isi index ke-"+i+": "+ cars.get(i));
        }

        //Mengganti nilai pada sebuah index
        cars.set(4, "Hyundai");
        //Tampilkan semua nilai pada arrayList menggunakan for-each
        for(String car : cars){
            System.out.println(car);
        }

    }
}
