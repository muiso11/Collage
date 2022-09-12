import java.util.Scanner;
public class SegSamaSisi{
	public static void main(String[]args){
		Scanner masuk = new Scanner(System.in);
		int x, a, b, c, d, x1;
	
		System.out.print("Masukkan jumlah perulangan: ");
		x = masuk.nextInt();
		x1 = x;
		for (a=1;a<=x;a++){
			for (b=x1;b>a;b--){
				System.out.print(" ");
			}
			for (c=1;c<=a;c++){
				System.out.print("*");
			}
			for (d=1;d<=a-1;d++){
				System.out.print("*");
			}
		System.out.println();	
		}
	}
}
