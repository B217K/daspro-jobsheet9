
import java.util.Scanner;

public class PemesananKafe07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        int[] HargaMenu = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jmlPesan = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jmlPesan];

        int totalBiaya = 0;
        for (int i = 0; i < pesanan.length; i++) {

            int posisi = -1;

            while (posisi == -1) {
                System.out.println("\nDaftar Menu: ");
                System.out.println("Nasi Goreng, Mie Goreng, Roti Bakar, Kentang Goreng, Teh Tarik, Cappucino, Chocolate Ice");
                System.out.print("Masukkan nama menu yang ingin dipesan: ");
                String cari = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(cari)) {
                        posisi = j;
                    }
                }
                if (posisi == -1) {
                    System.out.println("Menu tidak tersedia! Silakan pilih kembali.");
                } else {
                    pesanan[i] = menu[posisi];
                    totalBiaya += HargaMenu[posisi];

                    System.out.println("Menu ditemukan!");
                    System.out.println("Nama menu : " + menu[posisi]);
                    System.out.println("Harga     : Rp" + HargaMenu[posisi]);
                }
            }
        }
        System.out.println("\n========== STRUK PEMESANAN ==========");
        System.out.printf("%-5s %-22s %-12s%n", "No.", "Nama Menu", "Harga");
        System.out.println("-------------------------------------");

        for (int i = 0; i < pesanan.length; i++) {
            for (int j = 0; j < menu.length; j++) {
                if (pesanan[i].equals(menu[j])) {
                    System.out.printf("%-5d %-22s Rp%-10d%n",
                                      (i + 1), pesanan[i], HargaMenu[j]);
                }
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("Total biaya: Rp" + totalBiaya);
        System.out.println("=====================================");

        sc.close();
    }
}
