import java.util.Scanner;
public class Tryy_Array{
	  public static void main(String[] args) {

Scanner masuk = new Scanner(System.in);
        int a;
		
        String bulan[];
        bulan = new String[12];
        bulan[0]="Januari";
        bulan[1]="Februari";
        bulan[2]="Maret";
        bulan[3]="April";
        bulan[4]="Mei";
        bulan[5]="Juni";
        bulan[6]="Juli";
        bulan[7]="Agustus";
        bulan[8]="September";
        bulan[9]="Oktober";
        bulan[10]="November";
        bulan[11]="Desember";

        System.out.print("Bulan Ke :");
        a = masuk.nextInt();
        System.out.println("Bulan ke "+a+" adalah bulan "+bulan[a-1]);
		
		}
	}