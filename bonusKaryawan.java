import java.util.Scanner;

public class bonusKaryawan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //SCANNER UNTUK MEMBACA INPUT DARI USER
        // INPUT DATA KARYAWAN
        System.out.println("====== PROGRAM HITUNG BONUS KARYAWAN ======");
        System.out.print("MASUKKAN NILAI KINERJA DALAM SKALA 0 - 100: ");
        double kinerja = sc.nextDouble(); //INPUT NILAI KINERJA

        System.out.print("MASUKKAN LAMA BEKERJA (TAHUN): ");
        double lamaBekerja = sc.nextDouble(); //INPUT LAMA BEKERJA

        System.out.print("MASUKKAN GAJI POKOK (Rp): ");
        double gajiPokok = sc.nextDouble(); //INPUT GAJI POKOK

        System.out.print("APAKAH MEMILIKI SERTIFIAT (ya/tidak): ");
        String sertifikasi = sc.next(); //INPUT SERTIFIKASI

        double bonus = 0; 

        // HITUNG BONUS BERDASARKAN KRITERIA
        if (kinerja < 70) { // JIKA KINERJA KURANG DARI 70
            bonus = 0; // TIDAK DAPAT BONUS
        } else {
            if (kinerja < 90) { // JIKA KINERJA KURANG DARI 90
                if (lamaBekerja < 2) { //   JIKA LAMA BEKERJA KURANG DARI 2 TAHUN
                    bonus = 0.01 * gajiPokok; // BONUS 1% DARI GAJI POKOK
                } else if (lamaBekerja < 5) {
                    bonus = 0.03 * gajiPokok; // BONUS 3% DARI GAJI POKOK
                } else {
                    bonus = 0.05 * gajiPokok; // BONUS 5% DARI GAJI POKOK
                }
            } else { // kinerja >= 90
                if (lamaBekerja < 2) { //   JIKA LAMA BEKERJA KURANG DARI 2 TAHUN
                    bonus = 0.02 * gajiPokok; //BONUS 2% DARI GAJI POKOK
                } else if (lamaBekerja < 5) { //JIKA LAMA BEKERJA KURANG DARI 5 TAHUN
                    bonus = 0.04 * gajiPokok; //BONUS 4% DARI GAJI POKOK
                } else { //JIKA LAMA BEKERJA LEBIH DARI 5 TAHUN
                    bonus = 0.07 * gajiPokok; //BONUS 7% DARI GAJI POKOK
                }
            }

            // BONUS JIKA MEMILIKI SERTIFIKASI
            if (sertifikasi.equalsIgnoreCase("ya")) { //CEK JIKA INPUT SERTIFIKASI "ya" (TIDAK MENGHITUNG KAPITAL ATAU TIDAK)
                bonus += 500000; //TAMBAH BONUS 500.000
            }
        }

        // TAMPILKAN HASIL
        System.out.println("\n======== HASIL HITUNG =======");
        System.out.printf("\nNILAI KINERJA: %.0f%n", kinerja); //FORMAT TANPA ANGKA DI BELAKANG KOMA
        System.out.printf("LAMA BEKERJA: %.1f TAHUN%n", lamaBekerja); //FORMAT 1 ANGKA DI BELAKANG KOMA
        System.out.printf("GAJI POKOK: Rp %, .0f%n", gajiPokok); //FORMAT DENGAN PEMISAH RIBUAN DAN TANPA ANGKA DI BELAKANG KOMA
        System.out.printf("BONUS: Rp %, .0f%n", bonus); //FORMAT DENGAN PEMISAH RIBUAN DAN TANPA ANGKA DI BELAKANG KOMA
        System.out.printf("TOTAL: Rp %, .0f%n", bonus + gajiPokok); //FORMAT DENGAN PEMISAH RIBUAN DAN TANPA ANGKA DI BELAKANG KOMA
        System.out.printf("\n=====================================");

        
    }
}
