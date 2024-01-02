import java.util.Scanner;

public class volumebola {
    public static void main(String[] args) {
        // Membuat objek scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang jari-jari bola
        System.out.print("Masukkan panjang jari-jari bola (dalam satuan meter): ");
        double jariJari = scanner.nextDouble();

        // Memanggil fungsi untuk menghitung volume bola
        double volume = hitungVolumeBola(jariJari);

        // Menampilkan hasil
        System.out.println("Volume bola adalah: " + volume + " meter kubik.");
    }

    // Fungsi untuk menghitung volume bola
    public static double hitungVolumeBola(double jariJari) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
        return volume;
    }
}
