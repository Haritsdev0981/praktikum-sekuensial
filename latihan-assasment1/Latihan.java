public class Latihan{
    public static void main(String[] args) {
    boolean periksa;
    int a, b, hasil;
    a = 15;
    b = 3;
    periksa = (!(a % 3 > a) || (a % b == 0) && true);
    if (periksa) {
        hasil = b + a / 5 * 2 + (b * 2);
    } else {
        hasil = a % b + 12 * a - (a / b);
    }
    System.out.println(hasil);
    }
}