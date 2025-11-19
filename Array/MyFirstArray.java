package Array;

public class MyFirstArray {
    public static void main(String[] args) {
        int[] MyArray = new int [5]; //deklarasi array of integer dg ukuran 5 (indeks 0-4)
        MyArray[0] = 18;//meng-asign indeks 0 dengan bilangan 18
        System.out.println(MyArray[0]);
        System.out.println(MyArray[4]);
        
        //menampilkan semua semua nilai yang ada di MyArray menggunakan For
        int x;
        // for (x=0;x<5;x++){
        for (x=0;x<MyArray.length;x++){
            System.out.println("Nilai indeks ke-"+x+"="+MyArray[x]);
        }

        //menampilkan semua semua nilai yang ada di MyArray menggunakan ForEach
        for(int value : MyArray){
            System.out.println(value);
        }
    }

}