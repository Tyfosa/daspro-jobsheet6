import java.util.Scanner;

public class pemilihan2percobaan323 {

public static void main(String[] args) {
    Scanner input23 = new Scanner(System.in);

    String kategori;
    int penghasilan, gajiBersih;
    double pajak;

    System.out.println("Masukkan Katagori Penghasilan : ");
    kategori = input23.nextLine();
    System.out.println("Masukkan Penghasilan : ");
    penghasilan = input23.nextInt();

    System.out.println("==========Penghasilan Pajak Penghasilan==========");

    if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <=2000000) {
            pajak = 0.1;
        }else if (penghasilan <=3000000){
            pajak = 0.15;
        }else{
            pajak = 0.2;
        }
        gajiBersih = (int)(penghasilan-(pajak*penghasilan));
        System.out.println("Gaji Bersih Pekerja " + gajiBersih);

    }else if(kategori.equals("pebisnis")){
        if (penghasilan <= 2500000) {
            pajak = 0.15;
        }else if(penghasilan <=3500000){
            pajak = 0.2;
        }else{
            pajak=0.25;
        }
        gajiBersih = (int)(penghasilan-(pajak*penghasilan));
        System.out.println("Gaji Bersih Pembisnis " + gajiBersih);
    }else{
        System.out.println("Masukkan Kategori Salah");
}
}
}