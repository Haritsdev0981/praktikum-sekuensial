public class LatihanSoal {
    public static void main(String[] args) {
        HasilKali(3, 4);
    }

    public static void HasilKali(int a, int b){
        System.out.print(a + " * " + b + " = ");
        for (int n = 0; n < b; n++) {
            System.out.print(a + (n < b - 1 ? "+" : ""));
            // System.out.print(a);
            // if (n < b - 1) {
            //     System.out.print("+");
            // }
        }
    }

    public static void BilanganGenap() {
        int rangeAwal = 4;
        int rangeAkhir = 9;

        System.out.print("Bilangan genap antara " + rangeAwal + " dan " + rangeAkhir + " = ");
        for (int i = rangeAwal; i <= rangeAkhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
}
}
