
import java.util.Scanner;

public class PengelolaanNIlaiMHS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMHS = sc.nextInt();

        int[] nilai = new int[jmlMHS];

        int total = 0;
        int tertinggi = 0; 
        int terendah = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+ (i+1) +": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];

            if (i == 0) {
                tertinggi = nilai[i];
                terendah = nilai[i];
            } else {
                if (nilai[i] > tertinggi) {
                    tertinggi = nilai[i];
                }

                if (nilai[i] < terendah) {
                    terendah = nilai[i];
                }
            }
        }
        double rata2 = (double) total/jmlMHS;

        System.out.println("\n===== HASIL NILAI MAHASISWA =====");
        System.out.println("Rata-rata nilai : " + rata2);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);
        System.out.println(" ");
        System.out.println("\n===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1));
            System.out.print(" | Nilai: " + nilai[i]);

            if (nilai[i] >= 70) {
                System.out.println(" | Status: LULUS");
            } else {
                System.out.println(" | Status: TIDAK LULUS");
            }
        }
        sc.close();
    }
}
