public class FaktorialLoop {
    public static void main(String[] args) {
        System.out.println("Faktorial n= " + hasilFaktorial(3));
    }

    public static int hasilFaktorial(int n){
        int faktorial = 1;
        while (n >= 1) {
            faktorial *= n;
             n--;
        }
        return faktorial;
    }
}
