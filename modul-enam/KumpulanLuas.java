public class KumpulanLuas {
    public static String LuasSegitiga() {
        //perhitungan luas segitiga
        int alas, tinggi;
        double luasSegitiga;
        alas = 10;
        tinggi = 5;
        luasSegitiga = 0.5 * alas * tinggi;
        return "Luas segitiga= " + luasSegitiga;
    }

    public static void main(String[] args) {
        System.out.println(LuasSegitiga());
    }
}
