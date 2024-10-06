import java.util.Scanner;

public class HitungKembalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga tetap per kg telur
        final int HARGA_PER_KG = 28000;

        // Input jumlah telur
        System.out.print("Jumlah Telur (kg): ");
        double jumlahTelurKg = scanner.nextDouble();

        // Input total bayar
        System.out.print("Total Bayar: ");
        double totalBayar = scanner.nextDouble();

        // Input uang yang diberikan
        System.out.print("Uang yang diberikan: ");
        double uangDiberikan = scanner.nextDouble();

        // Hitung total harga
        double totalHarga = jumlahTelurKg * HARGA_PER_KG;

        // Hitung uang kembalian
        double uangKembalian = uangDiberikan - totalBayar;

        // Tampilkan hasil
        System.out.printf("Total Harga: %.2f%n", totalHarga);
        System.out.printf("Uang Kembalian: %.2f%n", uangKembalian);

        // Tutup scanner
        scanner.close();
    }
}