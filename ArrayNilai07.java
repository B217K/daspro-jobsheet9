
import java.util.Scanner;

public class ArrayNilai07 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int nomor = 1;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                System.out.println("Mahasiswa ke-" + nomor + ": " + nilai + " (LULUS)");
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
            nomor++;
        }
        System.out.println("\nJumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);

        input.close();
    }
}
