import java.util.Scanner;

public class Cetak_Relasi {
    int [] himA;
    int [] himB;
    int [] himRelasi;
    int [] himAsal;
    int jumHimA, jumHimB, jumRelasi;
    Scanner masuk = new Scanner (System.in);

    public static void main (String[]args) {
        Cetak_Relasi a = new Cetak_Relasi();
        a.inputAnggota();
        a.cetakHimpunan();
        a.inputRelasi();
        a.cekFungsi();
        a.cetakRelasi();
    }

    public void inputAnggota() {
        System.out.print("Masukkan Jumlah Himpunan A = ");
        jumHimA = masuk.nextInt();
        himA = new int [jumHimA];
        for (int a=0; a<=(jumHimA-1); a++) {
            System.out.print("Himpunan A yang ke "+(a+1)+" : ");
            himA[a] = masuk.nextInt();
        }

        System.out.print("Masukkan Jumlah Himpunan B = ");
        jumHimB = masuk.nextInt();
        himB = new int [jumHimB];
        for (int a=0; a<=(jumHimB-1); a++) {
            System.out.print("Himpunan B yang ke "+(a+1)+" : ");
            himB[a] = masuk.nextInt();
        }
    }

    public void cetakHimpunan() {
        System.out.print("Anggota Himpunan A = { ");
        for (int a=0; a<=(jumHimA-1); a++) {
            System.out.print(himA[a]+ " ");
        }
        System.out.println("} ");
        System.out.print("Anggota Himpunan B = { ");
        for (int a=0; a<=(jumHimB-1); a++) {
            System.out.print(himB[a]+ " ");
        }
        System.out.println("} ");
    }

    public void inputRelasi() {
        int jumRelasiMax = jumHimA*jumHimB;
        System.out.println("Relasi Maksimalnya adalah "+jumRelasiMax);
        do {
            System.out.print("Masukkan jumlah Relasi yang terjadi : ");
            jumRelasi = masuk.nextInt();
        }
        while(jumRelasi>jumRelasiMax);

        himRelasi = new int[jumRelasi];
        himAsal = new int[jumRelasi];
        System.out.println("Masukkan Relasi yang terjadi : ");
        for (int a=0; a<=(jumRelasi-1); a++) {
            int [] temp = new int [jumRelasi];
            int [] temp2 = new int [jumRelasi];
            boolean samaA = false;
            boolean samaB = false;

            System.out.println("Relasi ke "+(a+1)+" : ");
            do {
                System.out.print("Masukkan Asal A : ");
                temp[a] = masuk.nextInt();
                System.out.print("Masukkan Tujuan B : ");
                temp2[a] = masuk.nextInt();

                for (int b=0; b<=(jumHimA-1); b++) {
                    if (temp[a] == himA[b]) {
                        samaA = true;
                    }
                }
                for (int c=0; c<=(jumHimB-1); c++) {
                    if (temp2[a] == himB[c]) {
                        samaB = true;
                    }
                }
                if (samaA == false || samaB == false) {
                    System.out.print("Anggota Himpunan tidak terdapat pada HImpunan A atau B.");
                }
                if (samaA == true && samaB == true) {
                    himRelasi [a] = temp2[a];
                    himAsal[a] = temp[a];
                }
            }
            while (samaA == false || samaB == false);
        }
    }

    public void cekFungsi() {
        int jumAnggota = 0;
        boolean adaSama = false;

        for (int a=0; a<=(jumHimA-1); a++) {
            for (int b=0; b<=(jumRelasi-1); b++) {
                if (himAsal[a] == himAsal[b]) {
                    jumAnggota++;
                }
            }
        }
        for (int a=0; a<=(jumHimA-1); a++) {
            for(int b=a+1; b<=(jumRelasi-1); b++) {
                if (himAsal[a] == himAsal[b]) {
                    jumAnggota++;
                }
            }
        }
        if (jumAnggota == jumHimA && adaSama == false) {
            System.out.println("Relasi yang di input adalah fungsi.");
        }
        else {
            System.out.println("Re;asi yang di input bukan fungsi, tetapi hanya relasi biasa");
        }
    }

    public void cetakRelasi() {
        System.out.print("Daerah Domain = { ");
        for (int a=0; a<=(jumHimA-1); a++) {
            System.out.print(himA[a]+ " ");
        }
        System.out.println("}");

        System.out.print("Daerah Kodomain = { ");
        for (int a=0; a<=(jumHimB-1); a++) {
            System.out.print(himB[a]+ " ");
        }
        System.out.println("}");

        System.out.print("Daerah Range = { ");
        for (int a=0; a<=(jumRelasi-1); a++) {
            boolean adaSama = false;
            for (int b=a+1; b<=(jumRelasi-1); b++) {
                if (himRelasi[a] == himRelasi[b]) {
                    adaSama = true;
                }
            }
            if (adaSama == false) {
                System.out.print(himRelasi[a]+" ");
            }
        }
        System.out.println("}");
    }
}