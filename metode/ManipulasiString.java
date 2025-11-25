package metode;

public class ManipulasiString {
    public static void main(String[] args) {
        String namaLengkap = "Wahyudi";
        String textPanjang = "lorem ipsum dolor sit amet consectetur adipiscing elit sed do eiusmod tempor incididunt";

        //Ubah setiap karakter menjadi huruf kapital
        System.out.println(namaLengkap.toUpperCase());
        //Ubah setiap karakter menjadi huruf kecil
        System.out.println(namaLengkap.toLowerCase());
        //menggganti substring yudi menjadi yidi
        String namaBaru = namaLengkap.replace("yudi", "yidi");
        System.out.println(namaBaru);
        //Substring
        String subNama = namaLengkap.substring(5);
        System.out.println(subNama);
        String subNama2 = namaLengkap.substring(2,  6);
        System.out.println(subNama2);
        // split
        String[] nama = namaLengkap.split("");
        for(String potonganNama : nama){
            System.out.println(potonganNama);
        }
        String[] nama2 = textPanjang.split(" ", 1);
        for(String potonganNama : nama2){
            System.out.println(potonganNama);
        }
    }
    
}
