// package com.tugas;
import java.util.Scanner;

public class Fungsi_Invers{
    Scanner masuk = new Scanner(System.in);
    int[] himA;
    int[] himB;
    int[] himRelasi;
    int[] himAsal;
    int jumhimA,jumhimB,jumrelasi;
    boolean adaSama = false, satu1;

    public static void main(String[]args){
        Fungsi_Invers a = new Fungsi_Invers ();
        a.menu();
    }

    public void menu(){
        System.out.println("============================");
        System.out.println("     FUNGSI INVERS        ");
        System.out.println("============================");
        System.out.println("1.Masukan himpunan");
        System.out.println("2.Input relasi");
        System.out.println("3.Cetak fungsi");
        System.out.println("4.keluar");
        System.out.println("============================");
        System.out.print("Masukan Pilihan [1-4] : ");
        int pil = masuk.nextInt();

        switch(pil){
            case 1 :
                inputAnggota();
                tanya();
                break;
            case 2 :
                cetakHimpunan();
                inputRelasi();
                cekFungsi();
                tanya();
                break;
            case 3 :
                cekRelasi();
                tanya();
                break;
            case 4 :
                exit();
                break;
        }
    }

    public void tanya() {
        System.out.print("Simpan dan kembali ke menu utama? [y/n] : ");
        String ax = masuk.next();
        if(ax.equals("y") || ax.equals("Y")){
            menu();
            System.out.println(" ");
            System.out.println(" ");
        }
        else if (ax.equals("n") || ax.equals("N")){
            exit();
        }
    }

    public void inputAnggota(){
        System.out.print("Masukan jumlah himpunan A = ");
        jumhimA = masuk.nextInt();
        himA = new int[jumhimA];
        for (int a=0;a<=(jumhimA-1);a++) {
            System.out.print("Himpunan A yang ke"+(a+1)+" : ");
            himA[a] = masuk.nextInt();
        }
        System.out.print("Masukan jumlah himpunan B = ");
        jumhimB = masuk.nextInt();
        himB = new int [jumhimB];
        for (int a=0;a<=(jumhimB-1);a++) {
            System.out.print("Masukan B yang ke "+(a+1)+" : ");
            himB[a] = masuk.nextInt();
        }
    }

    public void cetakHimpunan(){
        System.out.print("Anggota himpunan A = {");
        for (int a=0;a<=(jumhimA-1);a++) {
            System.out.print(himA[a]+" ");
        }
        System.out.println("} ");
        System.out.print("Anggota himpunan B = {");
        for (int a=0;a<=(jumhimB-1);a++) {
            System.out.print(himB[a]+" ");
        }
        System.out.println("}");
    }

    public void inputRelasi(){
        int jumRelasiMax = jumhimA*jumhimB;
        System.out.println("Relasi maksimalnya adalah "+jumRelasiMax);
        do {
            System.out.print("Masukan jumlah relasi yang terjadi : ");
            jumrelasi = masuk.nextInt();
        }
        while (jumrelasi>jumRelasiMax);

        himRelasi = new int[jumrelasi];
        himAsal = new int [jumrelasi];
        System.out.println("Masukan relasi yang terjadi : ");
        for (int a=0;a<=(jumrelasi-1);a++) {
            int[] temp = new int[jumrelasi];
            int[] temp2 = new int[jumrelasi];
            boolean samaA = false;
            boolean samaB = false;

            System.out.println("Relasi ke "+(a+1)+" : ");
            do {
                System.out.print("Masukan asal A : ");
                temp[a] = masuk.nextInt();
                System.out.print("Masukan tujuan B : ");
                temp2[a] = masuk.nextInt();

                for (int b=0;b<=(jumhimA-1);b++) {
                    if (temp[a] == himA[b]){
                        samaA = true;
                    }
                }
                for (int c=0;c<=(jumhimB-1);c++) {
                    if (temp2[a] == himB[c]){
                        samaB = true;
                    }
                }
                if (samaA == false  || samaB == false){
                    System.out.println("Anggota himpunan tidak terdapat pada himpunan A atau B ");
                }
                if (samaA == true && samaB == true){
                    himRelasi[a] = temp2[a];
                    himAsal[a] = temp[a];
                }
            }
            while (samaA == false || samaB == false);
        }
    }

    public void cekFungsi() {
        int jumAnggota = 0;
        for(int a=0;a<=(jumhimA-1);a++){
            for(int b=0;b<=(jumrelasi-1);b++){
                if(himA[a] == himAsal[b]){
                    jumAnggota++;
                }
            }
        }
        for(int a=0;a<=(jumrelasi-1);a++){
            for(int b=a+1;b<=(jumrelasi-1);b++){
                if(himA[a] == himAsal[b]){
                    adaSama = true;
                }
            }
        }
        if(jumAnggota == jumhimA && adaSama == false){
            System.out.println("Relasi yang di input adalah Fungsi. ");
            jumAnggota = 0;
            for(int a=0;a<=(jumhimB-1);a++){
                for(int b=0;b<=(jumrelasi-1);b++){
                    if(himB[a] == himRelasi[b]){
                        jumAnggota++;
                    }
                }
            }
            for(int a=0;a<=(jumrelasi-1);a++){
                for(int b=a+1;b<=(jumrelasi-1);b++){
                    if(himRelasi[a] == himRelasi[b]){
                        adaSama = true;
                    }
                }
            }

            if(jumAnggota == jumhimB && adaSama == false){
                System.out.println("Fungsi yang di input adalah fungsi satu-satunya.");
                satu1 = true;
            }
        }
        else {
            System.out.println("Relasi yang di input bukan fungsi,tetapi hanya relasi biasa."+jumAnggota);
        }
    }

    public void cekRelasi(){
        System.out.print("Daerah Domain = { ");
        for(int a=0;a<=(jumhimA-1);a++){
            System.out.print(himA[a]+" ");
        }
        System.out.println("}");
        System.out.print("Daerah kodomain = {");
        for (int a=0;a<=(jumhimB-1);a++){
            System.out.print(himB[a]+" ");
        }
        System.out.println("}");

        System.out.print("Daerah range = { ");
        for (int a=0;a<=(jumrelasi-1);a++){
            boolean adaSama = false;
            for (int b=a+1;b<=(jumrelasi-1);b++){
                if (himRelasi[a] == himRelasi[b]){
                    adaSama = true;
                }
            }
            if(adaSama == false){
                System.out.print(himRelasi[a]+" ");
            }
        }
        System.out.print("}");

        if(satu1){
            System.out.println("\nFungsi invers-nya adalah: ");
            System.out.print("Daerah domain = {");
            for (int a=0;a<=(jumhimA-1);a++){
                System.out.print(himB[a]+" ");
            }
            System.out.println("}");
            System.out.print("Daerah kodomain = { ");
            for (int a=0;a<=(jumhimB-1);a++){
                System.out.print(himA[a]+" ");
            }
            System.out.println("}");
            System.out.print("Daerah range = { ");
            for (int a=0;a<=(jumrelasi-1);a++){
                for(int b=a+1;b<=(jumrelasi-1);b++){
                    if(himAsal[a] == himAsal[b]){
                        adaSama = true;
                    }
                }
                if (adaSama==false){
                    System.out.print(himAsal[a]+" ");
                }
            }
            System.out.println("}");
        }
    }
    public void exit(){
        System.exit(0);
    }
}
