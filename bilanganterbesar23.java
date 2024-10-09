import java.util.Scanner;

public class bilanganterbesar23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("Masukkan Bilanngan Pertama : ");
        bil1 = input23.nextInt();
        System.out.print("Masukkan Bilanngan Kedua : ");
        bil2 = input23.nextInt();
        System.out.print("Masukkan Bilanngan Ketiga : ");
        bil3 = input23.nextInt();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan  " + bil1 + " Adalah bilangan terbesar");
            } else {
                System.out.println("Bilangan  " + bil3 + " Adalah bilangan terbesar");
            }
        } else if (bil2 > bil3) {
            System.out.println("Bilangan  " + bil2 + " Adalah bilangan terbesar");
        } else {
            System.out.println("Bilangan  " + bil3 + " Adalah bilangan terbesar");
        }

    }
}