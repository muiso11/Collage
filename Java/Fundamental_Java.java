// Script belajar java dari awal
// import java.util.Scanner; 
// perintah awal agar user dapat memasukkan inputan di program kita
// Harus berada diatas class
import java.util.Scanner;
// public class ..{..}
// untuk mengidentifikasi class pada program kita
// nama classnya harus sama dengan nama file
public class Fundamental_Java{
// public static void main(String[] args) {}
// Sebagai method program kita dan wajib ada di file java, gunanya adalah agar system dapat mengetahui methode yang dipakai pada program kita
// Method yang biasa dipakai adalah ini
	public static void main(String[] args) {
//Scanner input = new Scanner(System.in);
//Berfungsi sebagai lanjutan dari perintah import java.util.Scanner;
//Untuk memberikan perintah ke system bahwa unputan user akan ditandai dengan kalimat setelah Scanner ... =
		Scanner input = new Scanner(System.in);
//int dan String
//Berfungsi sebagai symbol atau peringkas apabila kodingan anda memakai kalimat panjang yang berulang ulang
             int npm, nilai, k, pilihan;
             //int a=10;
             String nama, kelas;

      	System.out.println("==========Belajar Java Dari Awal=========");
		System.out.println("1. Belajar inputan awal");
		System.out.println("2. Belajar penjumlahan pada java");
		System.out.println("3. Belajar percabangan pada java");
		System.out.print("Masukkan Pilihan [1-9] :");
		pilihan = input.nextInt();
		switch (pilihan){
			case 1 : System.out.println("==== Cara Menampilkan dan Memasukkan text ke Program ====");
                                 
//System.out.print("Contoh"+a+"keren");
//Berfungsi untuk menampilkan teks ("..."+..+"...") ke layar,dan +...+ berfungsi untuk menambahkan integer atau string yang sudah dibuat di atas
     	 System.out.print("Masukkan Nama Anda : ");
		 nama = input.nextLine();
//nama = input.nextLine();
//Digunakan sebagai penanda bahwa user dapat memasukkan inputan berupa text setelah System.out.print("Masukkan Nama Anda : ");
		System.out.print("Masukkan NPM Anda : ");
		npm = input.nextInt();
//npm = input.nextInt();
//Digunakan sebagai penanda bahwa user dapat memasukkan inputan berupa angka setelah System.out.print("Masukkan NPM Anda : ");
		System.out.print("Masukkan NPM Anda : ");
		k = input.nextInt();
		System.out.print("Masukkan Nilai Anda : ");
		nilai = input.nextInt();
		System.out.println("================================");
		System.out.println("Nama saya "+nama);
			break;
			case 2 : System.out.println("====== Penjumlahan Dalam Java =======");

		// ===== Penjumlahan Dalam Java =========
        int a,b,c,d,e,f;
        System.out.println("===OPERASI MATEMATIKA===");
        System.out.print("Masukkkan angka pertama :");
        a = input.nextInt();
        System.out.print("Masukkan angka kedua :");
        b = input.nextInt();
        	// ngertilah ya ini, materi dasar banget
            c = a + b;
            d = a - b;
            e = a * b;
            f = a / b;
            System.out.println("Hasil "+a+" + "+b+" = "+c);
            System.out.println("Hasil "+a+" - "+b+" = "+d);
            System.out.println("Hasil "+a+" x "+b+" = "+e);
            System.out.println("Hasil "+a+" : "+b+" = "+f);
            break;
            case 3 :
            int pol; 
            System.out.println("=== Percabangan Pada Java ===");
            System.out.println("1. Contoh Percabangan 1");
            System.out.println("2. Contoh Percabangan 2");
            System.out.print("Masukkan Pilihan [1-2] :");
			pol = input.nextInt();
			// switch (...){...}
			// switch merupakan sebuah percabangan pada java setelah perintah switch diikuti dengan symbol (...) yang berarti program memasukkan nomor switch yang di inginkan, karena berisi angka maka menggunakan perintah int untuk mempermudah
			switch (pol){
				// `	
            	case 1 :
            System.out.println("ini merupakan contoh percabangan pertama");
            	break;
            	case 2 :
            System.out.println("ini merupakan contoh percabangan kedua");
				break;
			}
            break;
            case 4 :
            System.out.println("====== Perulangan Pada Java ======");
            
            break;

            default : System.out.println("Baca Pake Mata Pilihannya Sampe Berapa");
        }
	}
}