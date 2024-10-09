import java.util.Scanner;

public class sepatu23 {
  
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        int size, price;
        String shoes_category, brand;

        System.out.println("---------------------------------------");
        System.out.println("======== Pilih brand Sepatu ========");
        System.out.println("---------------------------------------");
        System.out.println("1.Converse \n2.Sketcher \n3.Nike");
        System.out.println("---------------------------------------");

        System.out.print("Masukan Brand sepatu yang anda beli : ");
        brand = input23.nextLine();
        shoes_category = "";
        switch (brand.toLowerCase()) {
            case "converse":
                System.out.print("Masukkan kategori sepatu (Slip On/High Top): ");
                break;
            case "skecher":
                System.out.print("Masukkan kategori sepatu (Woman/Man): ");
                break;
            case "nike":
                System.out.print("Masukkan kategori sepatu (Kids/Adult): ");
                break;
            default:
                System.out.println("Merk tidak valid.");
                input23.close();
                return;
        }
        shoes_category = input23.nextLine();
        System.out.print("Masukan ukuran sepatu yang anda beli : ");
        size = input23.nextInt();

        price = 0;
        if (brand.equalsIgnoreCase("Converse")) {
            if (shoes_category.equalsIgnoreCase("Slip On") && size >= 36 && size <= 40) {
                price = 800000;
            } else if (shoes_category.equalsIgnoreCase("High Top") && size >= 40 && size <= 44) {
                price = 1200000;
            }
        } else if (brand.equalsIgnoreCase("Skecher")) {
            if (shoes_category.equalsIgnoreCase("Woman") && size >= 36 && size <= 41) {
                price = 1000000;
            } else if (shoes_category.equalsIgnoreCase("Man") && size >= 41 && size <= 44) {
                price = 1800000;
            }
        } else if (brand.equalsIgnoreCase("Nike")) {
            if (shoes_category.equalsIgnoreCase("Kids") && size >= 36 && size <= 40) {
                price = 750000;
            } else if (shoes_category.equalsIgnoreCase("Adult") && size >= 40 && size <= 44) {
                price = 1500000;
            }
        }

        System.out.println(String.format("Sepatu Merk %s  kategori %s Dengan Ukurang %s memiliki harga %s", brand,shoes_category, size, price));
}
}


