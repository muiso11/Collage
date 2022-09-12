import java.util.Scanner;
public class Auto_Input_Array{
	public static void main(String[] args){
			int[] s;
		Scanner masuk = new Scanner(System.in);
		System.out.print("Masukkan banyak array : ");
		int x = masuk.nextInt();
			s = new int[x];
	
		for(int i=0;i<x;i++){
			System.out.print("Masukkan array ke-"+i+" : ");
			s[i] = masuk.nextInt();
		}
		for(int i=0;i<x;i++){
			System.out.print(" Array ke-"+i+" adalah : "+s[i]);
		System.out.println();
		}
	}
}