import java.util.Scanner;

public class pemilihan2percobaan123 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun Kabisat : ");
        tahun = input23.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 != 0 || tahun % 400 == 0) {
                System.out.println(tahun + " Adalah Tahun kabisat");
            } else {
                System.out.println(tahun + " Bukan Tahun kabisat");
            } 
        } else {
            System.out.println(tahun + " Bukan Tahun kabisat");
         }
    }}