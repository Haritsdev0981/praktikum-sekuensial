public class Loop {
    public static void main(String[] args) {
        int count;

        System.out.println("Perulangan menggunakan For");
        for(count = 1; count <= 5; count++){
            System.out.println(count);
        }
        System.out.println("Perulangan menggunakan While");
        // count = 1;
        while (count <= 5) {
                System.out.println(count);
                count++;
        }
        System.out.println("Perulangan menggunakan Do-While");
        // count = 1;
        do{
            System.out.println(count);
            count++;
        } while(count <= 5);
        System.out.println("End Loop: " + count);
    }
}
