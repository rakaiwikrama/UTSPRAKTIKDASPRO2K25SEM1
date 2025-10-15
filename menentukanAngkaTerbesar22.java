import java.util.Scanner;

public class menentukanAngkaTerbesar22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, c = 0; //DEKLARASI VARIABEL DENGAN TIPE DATA DOUBLE DENGAN DEFAULT 0

        // INPUT ANGKA PERTAMA
        while (true) { //MENJALAKAN PERULANGAN SELAMA INPUT SALAH (SELAMA TRUE)
            System.out.print("MASUKKAN ANGKA PEPTAMA: ");
            if (sc.hasNextDouble()) { //CEK INPUT JIKA BERNILAI DOUBLE TRUE JIKA SELAIN DOUBLE FALSE
                a = sc.nextDouble(); // JIKA INPUT BENAR, TAMPUNG DI VARIABEL
                break; // KELUAR DARI PERULANGAN
            } else {
                System.out.println("MASUKKAN angka SAJA BROO.");
                sc.next(); // MEMBUANG INPUT YANG SALAH (BUKAN DOUBLE)
            }
        }

        // INPUT ANGKA KEDUA
        while (true) { //MENJALAKAN PERULANGAN SELAMA INPUT SALAH (SELAMA TRUE)
            System.out.print("MASUKKAN ANGKA KEDUA: ");  //PRINT OUT INPUT
            if (sc.hasNextDouble()) { //CEK INPUT JIKA BERNILAI DOUBLE TRUE JIKA SELAIN DOUBLE FALSE
                b = sc.nextDouble(); // JIKA INPUT BENAR, TAMPUNG DI VARIABEL
                break; // KELUAR DARI PERULANGAN
            } else {
                System.out.println("MASUKKAN angka SAJA BROO.");
                sc.next(); // MEMBUANG INPUT YANG SALAH (BUKAN DOUBLE)
            }
        }

        // INPUT ANGKA KETIGA
        while (true) { //MENJALAKAN PERULANGAN SELAMA INPUT SALAH (SELAMA TRUE)
            System.out.print("MASUKKAN ANGKA KETIGA: "); //PRINT OUT INPUT
            if (sc.hasNextDouble()) { //CEK INPUT JIKA BERNILAI DOUBLE TRUE JIKA SELAIN DOUBLE FALSE
                c = sc.nextDouble(); // JIKA INPUT BENAR, TAMPUNG DI VARIABEL
                break; // KELUAR DARI PERULANGAN
            } else {
                System.out.println("MASUKKAN angka SAJA BROO.");
                sc.next(); // MEMBUANG INPUT YANG SALAH (BUKAN DOUBLE)
            }
        }

        // ALGORIMA MENENTUKAN ANGKA TERBESAR
        double terbesar = Math.max(a, Math.max(b, c)); //MENGGUNAKAN METHOD MATH.MAX UNTUK MENENTUKAN NILAI TERBESAR DARI 3 VARIABEL
        System.out.println("\n====================================");
        if (a == terbesar && b == terbesar && c == terbesar) { // CEK APA ADA ANGKA SAMA   
            // System.out.println("\n====================================");
            System.out.println("Ketiga angka memiliki nilai yang sama, yaitu " + terbesar); // JIKA SAMA PRINT PESAN
            // System.out.println("====================================");

        } else if ((a == terbesar && b == terbesar) || // CEK APA ADA 2 ANGKA YANG SAMA
        (a == terbesar && c == terbesar) || // CEK APA ADA 2 ANGKA YANG SAMA
        (b == terbesar && c == terbesar)) { // CEK APA ADA 2 ANGKA YANG SAMA
            // System.out.println("\n====================================");
            System.out.print("Ada dua angka terbesar yang sama, yaitu: "); // JIKA ADA 2 ANGKA YANG SAMA PRINT PESAN
            if (a == terbesar) System.out.print(a); // CEK VARIABEL YANG SAMA DENGAN TERBESAR, JIKA SAMA PRINT NILAINYA
            if (b == terbesar && b != a) System.out.print(b); // CEK VARIABEL YANG SAMA DENGAN TERBESAR, JIKA SAMA PRINT NILAINYA
            if (c == terbesar && c != a && c != b) System.out.print(c); // CEK VARIABEL YANG SAMA DENGAN TERBESAR, JIKA SAMA PRINT NILAINYA
            System.out.println("\nNilai terbesar adalah " + terbesar); // PRINT NILAI TERBESAR
            // System.out.println("\n====================================");
        } else {
            // System.out.println("\n====================================");
            System.out.println("Angka terbesar adalah " + terbesar); // JIKA TIDAK ADA YANG SAMA, PRINT NILAI TERBESAR
        }
        
        System.out.println("\n====================================");
    }
}
