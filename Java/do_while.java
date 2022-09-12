// Harap Perhatikan Nama Kelas!!!

import java.util.Scanner;
public class do_while{
	public static void main(String[]args){
		Scanner masuk = new Scanner(System.in);
		int b;
		b = 0;
		System.out.print("Masukkan jumlah perulangan: ");
		b = masuk.nextInt();
		do {
			System.out.println("Hi. Nama saya Muhammad Imam Prasojo Ini perulangan ke "+b);
			b++;
		}while (b <= 20);
	}
}