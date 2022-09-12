import java.util.Scanner;

public class Try_SuperMethod{

    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        bio rn = new bio();
        seg bk = new seg();

        String nama;

        System.out.println("Program Overloading");
        System.out.println("1. Nama");
        System.out.println("2. Segitiga");
        System.out.print("Masukkan Pilihan Anda : ");
        int pil = pilih.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Program Nama");
                System.out.println("...............................");

                System.out.print("Silahkan Nama : ");
                nama = pilih.next();
                rn.nama = nama;

                rn.cetak();
            case 2:
                System.out.println("Program Membuat Segitiga");
                System.out.println("...............................");

                System.out.print("Silahkan Masukkan Bilangan 1 : ");
                int tinggi = pilih.nextInt();
                System.out.print("Silahkan Masukkan Bilangan 2 : ");
                int bilangan2 = pilih.nextInt();
                bk.a = tinggi;
                bk.b = bilangan2;
                bk.nama = "Ravita";

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
        for (int i = 1; i <= 5; i++){
            System.out.println("Java");
            System.out.println("Nama Anda Adalah : " + this.nama);
        }
    }
}

class seg extends bio {
    int a, b;
    

    void cetak() {
        super.cetak();
        System.out.println(this.a + this.b);
        System.out.println(this.a - this.b);
        System.out.println(this.a * this.b);
        System.out.println(this.a / this.b);
    }
}