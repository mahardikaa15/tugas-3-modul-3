import java.util.Scanner;

/**
 * class HitungLingkaranRefactored adalah kelas utama yang mengatur alur program untuk menghitung luas dan keliling lingkaran
 * class ini menggunakan class Lingkaran untuk perhitungan
 */
public class HitungLingkaranRefactored {
    private static final double PI = Math.PI; // Konstanta untuk Pi

    /**
     * Metode utama (main) untuk menjalankan program
     * Mengatur alur perhitungan lingkaran dan memungkinkan pengguna
     * untuk melakukan perhitungan ulang
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            double jariJari = mintaInputJariJari(scanner);

            Lingkaran lingkaran = new Lingkaran(jariJari);

            System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
            System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());

            System.out.print("Apakah Anda ingin menghitung lingkaran lain? (y/n): ");
            pilihan = scanner.next();
        } while (pilihan.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program.");
        scanner.close();
    }

    /**
     * Meminta input jari-jari dari pengguna dan memastikan nilainya positif
     *
     * @param scanner Scanner yang digunakan untuk membaca input
     * @return Nilai jari-jari yang valid (lebih besar dari 0)
     */
    public static double mintaInputJariJari(Scanner scanner) {
        double jariJari;
        do {
            System.out.print("Masukkan jari-jari lingkaran (harus positif): ");
            jariJari = scanner.nextDouble();
            if (jariJari <= 0) {
                System.out.println("Jari-jari harus lebih besar dari 0. Silakan coba lagi.");
            }
        } while (jariJari <= 0);
        return jariJari;
    }
}

/**
 * Class Lingkaran merepresentasikan sebuah lingkaran dengan jari-jari tertentu dan menyediakan metode untuk menghitung luas dan kelilingnya
 */

class Lingkaran {
    private double jariJari;

    /**
     * Konstruktor untuk membuat objek Lingkaran dengan jari-jari tertentu
     *
     * @param jariJari Nilai jari-jari lingkaran
     */

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    /**
     * Menghitung luas lingkaran
     *
     * @return Luas lingkaran berdasarkan rumus π * r^2
     */

    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    /**
     * Menghitung keliling lingkaran
     *
     * @return Keliling lingkaran berdasarkan rumus 2 * π * r
     */

    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}