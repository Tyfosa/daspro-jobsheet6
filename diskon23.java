import java.util.Scanner;

public class diskon23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

            String book;
            double discount;
            int quantity;
    
            System.out.println("---------------------------------------");
            System.out.println("======== Pilih Kategori buku ========");
            System.out.println("---------------------------------------");
            System.out.println("1.Novel \n2.Kamus \n3.Lainnya");
            System.out.println("---------------------------------------");
    
            System.out.print("Masukan Kategori Buku yang anda beli : ");
            book = input23.nextLine();
            System.out.print("Masukan Jumlah Buku yang anda beli : ");
            quantity = input23.nextInt();
    
            discount = 0;
            if (book.equalsIgnoreCase("kamus") || book.equalsIgnoreCase("novel")) {
                if (book.equalsIgnoreCase("kamus")) {
                    discount = 0.1;
                    if (quantity > 2) {
                        discount = discount + 0.02;
                    }
                } else if (book.equalsIgnoreCase("novel")) {
                    discount = 0.07;
                    if (quantity > 3) {
                        discount = discount + 0.02;
                    } else if (quantity <= 3) {
                        discount = discount + 0.01;
                    }
                }
    
            } else {
                discount = 0;
                if (quantity > 3) {
                    discount = discount + 0.05;
                }
            }
    
            System.out.println(book + " dengan jumlah " + quantity + " Mendapatkan diskon sebesar "
                    + Math.round(discount * 100) + " %");
    }
}
