import java.util.Scanner; 
public class Relasi_Himpunan {
	Scanner input = new Scanner(System.in); 
	int[] himA = new int[100]; 
	int[] himB = new int[100]; 
	int[] himHasil = new int[100]; 
	int jumAnggA, jumAnggB; 
	int jumRelasi, jumRelasiMax; 
public void inputAngg() { 
	System.out.print ("\nMasukan Jumlah Anggota Himpunan A : "); jumAnggA = input.nextInt(); 
		System.out.println ("Anggota Himpunan A"); 
		for (int a=1;a<=jumAnggA;a++) { 
			System.out.print ("Anggota "+a+" : "); 
			himA[a] = input.nextInt();
			} 
	System.out.print ("\nMasukan Jumlah Anggota Himpunan B : "); jumAnggB = input.nextInt(); 
	System.out.println ("Anggota Himpunan B"); 
		for (int a=1;a<=jumAnggB;a++) {
			System.out.print ("Anggota "+a+" : "); 
			himB[a] = input.nextInt(); 
			} 
		jumRelasiMax = jumAnggA * jumAnggB;
		System.out.println ("\nBanyak Relasi Max. yang terjadi adalah : "+jumRelasiMax); 
		do { 
			System.out.print ("\nMasukan jumlah Relasi terjadi : "); jumRelasi = input.nextInt();
			} 
			while (jumRelasi>jumRelasiMax);
		} 
public void inputRelasi() {
	System.out.println ("Relasi yang terjadi : "); 
	for (int a=1;a<=jumRelasi;a++) {
		int[] anggA = new int[100]; 
		int[] anggB = new int[100]; 
		boolean samaA = false; 
		boolean samaB = false; 
	System.out.println ("\nRelasi ke "+a); 
	do { 
		System.out.print ("Masukan Asal A : "); 
		anggA[a] = input.nextInt(); 
		System.out.print ("Masukan Asal B : "); 
		anggB[a] = input.nextInt(); 
		for (int b=1;b<=jumAnggA;b++) {
			if (anggA[b]==himA[b]) {
				samaA = true; 
			}
		}
		for (int c=1;c<=jumAnggB;c++) {
			if (anggB[c]==himB[c]) { 
				samaB = true;
			}
		} 
		if (samaA==false) {
		System.out.println ("Anggota Himpunan tidak terdapat di Himpunan A."); 
		} 
		if (samaB==false) {
		System.out.println ("Anggota Himpunan tidak terdapat di Himpunan B.");
		} 
		if (samaA=true || samaB==true) {
			himHasil[a]=anggB[a]; 
			} 
		}
		while (samaA==false || samaB==false); 
	}
}
public void cetakRelasi() {
	System.out.print ("\nDaerah Domain	= { "); 
	for (int a=1;a<=jumAnggA;a++) {
		System.out.print (himA[a]+" "); 
		}
	System.out.println("}");
	System.out.print("Daerah Kodomain = { ");
		for (int a=1;a<=jumAnggB;a++) {
			System.out.print (himB[a]+" ");
				System.out.println("}");
		}
	System.out.print("Daerah Range	= { ");
		for (int a=1;a<=jumRelasi;a++){
			System.out.print(himHasil[a]+" ");
		}
		System.out.println("}");
	}
// public static void main(String[] args) {
// 	relasi a = new relasi();
// 	a.inputAngg();
// 	a.inputRelasi();
// 	a.cetakRelasi();
// 	}
}
