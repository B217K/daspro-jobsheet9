
import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int total = 0;
        double rata2;
        int lulus = 0;
        int tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();

            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                System.out.println(" (LULUS)");
                lulus++;
            }else {
                System.out.println(" (TIDAK LULUS)");
                tdkLulus++;
            }
        }

        System.out.println("Mahasiswa yang lulus: " + lulus);
        System.out.println("Mahasiswa yang tidak lulus: " + tdkLulus);

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total nilai: " + total);
        System.out.print("Rata-rata: " + rata2);

        if (rata2 >= 85) {
            System.out.println(" (SANGAT BAIK!)");
        }else if (rata2 >= 70) {
            System.out.println(" (BAIK)");
        }else {
            System.out.println(" (PERLU PENDAMPINGAN)");
        }

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        sc.close();
    }
}
