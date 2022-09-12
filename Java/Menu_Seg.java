import java.util.*;
public class Menu_Seg {
    public static void main(String[] args) {
        double a1,t,segitiga;
        int pil,x,a,b,c,d;
        Scanner input= new Scanner(System.in);
        
        System.out.println("===============================");
        System.out.println("========MENU SEGITIGA==========");
        System.out.println("===============================");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Segitiga");
        System.out.print("Masukkan Pilihan Menu [1-2] : ");
        pil = input.nextInt();
        switch (pil){
            case 1:
                System.out.println("=======LUAS SEGITGA=======");
                System.out.print("Masukkan Alas Segitiga : ");
                a1 = input.nextDouble();
                System.out.print("Masukkan Tinggi Segitiga : ");
                t = input.nextDouble();
                segitiga = (a1*t)/2;
                System.out.println("Luas Segitiga = "+segitiga);
                break;
            case 2:
                System.out.println("===========SEGITIGA==========");
                System.out.print("Masukkan tinggi segitiga: ");
                x = input.nextInt();
                for(a=1;a<=x;a++){
                    for(b=x;b>=a;b--){
                        System.out.print(" ");
                    }
                    for(c=1;c<=a;c++){
                        System.out.print("*");
                    }
                    for(d=1;d<=a-1;d++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Maaf Pilihan Tidak Tersedia");
        }
    }
}