import java.util.Scanner;
public class tugas{
	public static void main(String args[]){
		int nilai;
		String peringkat,nama,kelas,npm;
		Scanner scan = new Scanner(System.in);

		System.out.print("Masukkan Nama Anda: ");
		nama = scan.nextLine();
		System.out.print("Masukkan NPM Anda: ");
		npm = scan.nextLine();
		System.out.print("Masukkan Kelas Anda: ");
		kelas = scan.nextLine();
		System.out.print("Masukkan Nilai Anda: ");
		nilai = scan.nextInt();

		if (nilai>= 90){
			peringkat = "A";
		} else if (nilai >= 80){
			peringkat = "B";
		} else if (nilai >= 50){
			peringkat = "C";
		} else if (nilai < 40){
			peringkat = "D";
		} else {
			peringkat = "E";
		}

		System.out.println("Anda Mendapat Grade: " + peringkat);
	}
}