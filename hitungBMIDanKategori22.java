import java.util.Scanner; //IMPORT SCANNER UNTUK MEMBACA INPUT DARI USER

public class hitungBMIDanKategori22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //SCANNER UNTUK MEMBACA INPUT DARI USER

        // INPUT
        System.out.println("======= Program hitung BMI (Body Mass Index) =======");
        System.out.print("Masukkan berat badan dalam kg: ");
        double berat = sc.nextDouble(); //INPUT BERAT BADAN

        System.out.print("Masukkan tinggi badan dalam meter: ");
        double tinggi = sc.nextDouble(); //INPUT TINGGI BADAN

        // HITUNG BMI
        double bmi = berat / (tinggi * tinggi); //RUMUS BMI

        // MENENTUKAN KATEGORI BMI
        String kategori; 
        String risiko;

        if (bmi < 18.5) { //JIKA KURANG DARI 18.5 MAKA PRINIT KATEGORI UNDERWEIGHT
            kategori = "Kurang berat badan (Underweight)";
            risiko = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi < 25) { //JIKA KURANG DARI 25 MAKA PRINT  KATEGORI NORMAL WEIGHT
            kategori = "Berat badan normal (Normal weight)";
            risiko = "Risiko kesehatan relatif rendah.";
        } else if (bmi < 30) { //JIKA KURANG DARI 30 MAKA PRINT KATEGORI OVERWEIGHT
            kategori = "Kelebihan berat badan (Overweight)";
            risiko = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.";
        } else { //JIKA LEBIH DARI 30 MAKA PRINT KATEGORI OBESE
            kategori = "Obesitas (Obese)";
            risiko = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.";
        }

        // Tampilkan hasil
        System.out.println("\n====== Hasil Perhitungan BMI =======");
        System.out.printf("\nNilai BMI Anda      : %.2f%n", bmi); //PRINT NILAI BMI DENGAN FORMAT 2 ANGKA DI BELAKANG KOMA
        System.out.println("Kategori BMI        : " + kategori); //PRINT KATEGORI BMI
        System.out.println("Risiko Kesehatan    : " + risiko); //PRINT RISIKO KESEHATAN BERDASARKAN KATEGORI BMI
        System.out.println("\n====================================");
        //https://github.com/rakaiwikrama/UTSPRAKTIKDASPRO2K25SEM1/blob/main/hitungBMIDanKategori.java
    }
}
