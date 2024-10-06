import java.util.Scanner;

public class HitungSuhuDanGeometri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menghitung suhu dalam Fahrenheit
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Suhu dalam Fahrenheit: %.2f%n", fahrenheit);

        // Menghitung keliling lingkaran
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();
        double kelilingLingkaran = 2 * Math.PI * jariJari;
        System.out.printf("Keliling lingkaran: %.2f%n", kelilingLingkaran);

        // Menghitung luas persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        double luasPersegiPanjang = panjang * lebar;
        System.out.printf("Luas persegi panjang: %.2f%n", luasPersegiPanjang);

        // Menghitung volume kubus
        System.out.print("Masukkan sisi kubus: ");
        double sisi = scanner.nextDouble();
        double volumeKubus = Math.pow(sisi, 3);
        System.out.printf("Volume kubus: %.2f%n", volumeKubus);

        // Tutup scanner
        scanner.close();
    }
}