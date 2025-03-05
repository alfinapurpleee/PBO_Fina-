import java.util.Scanner;

// menentukan kelas bentuk
abstract class Bentuk {
    abstract double hitungLuas();
    abstract double hitungKeliling();
}

// Kelas Untuk Persegi
class Persegi extends Bentuk {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    
    double hitungLuas() {
        return sisi * sisi;
    }

   
    double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas Untuk Segitiga
	class Segitiga extends Bentuk {
    	double alas, tinggi, sisi1, sisi2, sisi3;

    Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }


    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}

// Kelas Untuk Lingkaran
class Lingkaran extends Bentuk {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

   
    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas Untuk Kubus
class Kubus {
    double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    double hitungKeliling() {
        return 12 * sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih bentuk yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Kubus");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = input.nextDouble();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas: " + persegi.hitungLuas());
                System.out.println("Keliling: " + persegi.hitungKeliling());
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.print("Masukkan sisi pertama: ");
                double sisi1 = input.nextDouble();
                System.out.print("Masukkan sisi kedua: ");
                double sisi2 = input.nextDouble();
                System.out.print("Masukkan sisi ketiga: ");
                double sisi3 = input.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
                System.out.println("Luas: " + segitiga.hitungLuas());
                System.out.println("Keliling: " + segitiga.hitungKeliling());
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJari = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jariJari);
                System.out.println("Luas: " + lingkaran.hitungLuas());
                System.out.println("Keliling: " + lingkaran.hitungKeliling());
                break;
            case 4:
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = input.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
                System.out.println("Keliling: " + kubus.hitungKeliling());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        input.close();
    }
}
