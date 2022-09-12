import java.util.Scanner;
public class Clear_FundamentalCode{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			int npm, nilai, k, pilihan;
        	//int a=10;
        	String nama, kelas;
      	System.out.println("==========Belajar Java Dari Awal=========");
		System.out.println("1. Belajar inputan awal");
		System.out.println("2. Belajar penjumlahan pada java");
		System.out.println("3. Belajar percabangan pada java");
		System.out.print("Masukkan Pilihan [1-3] :");
		pilihan = input.nextInt();
			switch (pilihan){
			case 1 : 
				System.out.println("==== Cara Menampilkan dan Memasukkan text ke Program");
                System.out.print("Masukkan Nama Anda : ");
		 		nama = input.nextLine();
				System.out.print("Masukkan NPM Anda : ");
				npm = input.nextInt();
				System.out.print("Masukkan NPM Anda : ");
				k = input.nextInt();
				System.out.print("Masukkan Nilai Anda : ");
				nilai = input.nextInt();
				System.out.println("Nama saya "+nama);
				System.out.println("================================");
			break;

			case 2 : 
				System.out.println("====== Penjumlahan Dalam Java =======");
		        int a,b,c,d,e,f;
		        System.out.println("===OPERASI MATEMATIKA===");
		        System.out.print("Masukkkan angka pertama :");
		        a = input.nextInt();
		        System.out.print("Masukkan angka kedua :");
		        b = input.nextInt();
        
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
				switch (pol){
	            	case 1 :
	            System.out.println("ini merupakan contoh percabangan pertama");
	            	break;
	            	case 2 :
	            System.out.println("ini merupakan contoh percabangan kedua");
					break;
							}
	        break;
            default : System.out.println("Baca Pake Mata Pilihannya Sampe Berapa");
        }
	}
}
