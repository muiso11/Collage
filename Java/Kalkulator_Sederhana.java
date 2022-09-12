import java.util.Scanner;
public class Kalkulator_Sederhana {

    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        bio bi = new bio();
        seg bk = new seg();

        String nama;

        System.out.println("Program Ujian 90");
        System.out.println("1. Nama");
        System.out.println("2. Kalkulator");
        System.out.print("Masukkan Pilihan Anda : ");
        int pil = pilih.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Program Nama");
                System.out.println("...............................");

                System.out.print("Silahkan Nama : ");
                nama = pilih.next();
                bi.nama = nama;
                for(int i = 1; i<=3;i++){

                    bi.cetak();
                }
                break;
            case 2:
                System.out.println("Program Kalkulator");
                System.out.println("...............................");

                System.out.print("Silahkan Masukkan Bilangan 1 : ");
                float bilangan1 = pilih.nextInt();
                System.out.print("Silahkan Masukkan Bilangan 2 : ");
                float bilangan2 = pilih.nextInt();
                bk.a = bilangan1;
                bk.b = bilangan2;
                bk.nama = "Muhammad Imam Prasojo";

                bk.cetak();

                break;

            default:
                System.out.println("Pilihan Anda Tidak Ada Di Menu");
                break;
        }
    }
}

class bio {
    String nama;

    void cetak() {
        System.out.println("Nama Anda Adalah : " + this.nama);
    }
}

class seg extends bio {
    float a,b;

    void cetak() {
        super.cetak();
        System.out.println(this.a + this.b);
        System.out.println(this.a - this.b);
        System.out.println(this.a * this.b);
        System.out.println(this.a / this.b);
    }
}