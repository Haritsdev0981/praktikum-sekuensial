public class TernaryOperatorExample {
    public static void main(String[] args) {
        
        // Ternary Operator : menentukan nilai terbesar
        // kondisi ? nilaiJikaTrue : nilaiJikaFalse;

        int a = 10;
        int b = 20;
        // Menggunakan ternary operator untuk menentukan nilai terbesar 
        int nilaiTerbesar = (a > b) ? a : b;
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);


        // Ternary Operator : menentukan kelulusan
        
        int nilai = 78;

        // Menentukan kelulusan dengan ternary operator
        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
        System.out.println("Hasil: " + hasil);
    }
}
