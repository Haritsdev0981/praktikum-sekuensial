public class KumpulanLuas {
    public static String LuasSegitiga(int alas, int tinggi) {
        //perhitungan luas segitiga
        // int alas, tinggi;
        double luasSegitiga;
        // alas = 10;
        // tinggi = 5;
        luasSegitiga = 0.5 * alas * tinggi;
        return "Luas segitiga= " + luasSegitiga;
    }

    public static double LuangLingkaran(int jari) {
        double luasLingkaran;
        luasLingkaran = jari * jari;
        return luasLingkaran;
    }

    public static void main(String[] args) {
        System.out.println(LuasSegitiga(10, 5));
        System.out.println(LuasSegitiga(6, 9));
        System.out.println(LuasSegitiga(8, 8));
    }
}
