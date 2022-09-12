/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Muiso
 */
import java.util.Scanner;
public class rata2x_persegi {

    /**
     * @param args the command line arguments
     */


	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int pilihan, panjang,lebar,luas;
		double uts,uas,akhir;

		System.out.println("==========Muiso=========");
		System.out.println("1. Nilai Akhir");
		System.out.println("2. Luas Persegi Panjang");
		System.out.print("Masukkan Pilihan [1-2] :");
		pilihan = input.nextInt();
		switch (pilihan){
			case 1 : System.out.println("===Muiso===");
			System.out.print("Nilai UTS\t : ");
			uts = input.nextInt();
			System.out.print("Nilai UAS\t : ");
			uas = input.nextInt();
			System.out.println("Nilai UTS \t: "+uts);
			System.out.println("Nilai UAS \t: "+uas);
			akhir = ((uts + uas) / 2);
			System.out.println("Hasil akhir : "+akhir);
				break;
			case 2 :System.out.println("===LUAS PERSEGI PANJANG===");
			System.out.print("Panjang : ");
			panjang = input.nextInt();
			System.out.print("Lebar :");
			lebar = input.nextInt();
			System.out.println("Panjang \t: "+panjang);
			System.out.println("Lebar \t: "+lebar);
			luas = panjang * lebar;
			System.out.println("Luas Persegi Panjang : "+luas);
				break;
			default : System.out.println("Pilihannya cuma dua sayang");
		}
	}
}