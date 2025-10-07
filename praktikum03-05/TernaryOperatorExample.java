public class TernaryOperatorExample {
    public static void main(String[] args) {
        
        // Ternary Operator : menentukan nilai terbesar
        // kondisi ? nilaiJikaTrue : nilaiJikaFalse;

        int a = 10;
        int b = 20;
        // Menggunakan ternary operator untuk menentukan nilai terbesar 
        int nilaiTerbesar = (a > b) ? a : b;
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
    }
}
