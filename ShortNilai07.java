
import java.util.Scanner;

public class ShortNilai07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen array: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai indeks ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int posisi = -1;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + posisi);
        } else {
            System.out.println("Nilai yang dicari (" + key + ") tidak ditemukan dalam array.");
            System.out.println("Pencarian dilakukan pada " + jumlah + " elemen array.");
            System.out.println("Silakan periksa kembali nilai yang Anda masukkan.");
        }

        sc.close();
    }
}
