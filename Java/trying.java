import java.util.Scanner;
import java.io.IOException;

public class trying {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String pilih; boolean gas = true;

    while(gas) {
        cls();
        System.out.println("\nDatabase Perpustakaan\n");
        System.out.println("1.\tLihat Seluruh Buku");
        System.out.println("2.\tCari Data Buku");
        System.out.println("3.\tTambah Data Buku");
        System.out.println("4.\tUbah Data Buku");
        System.out.println("5.\tHapus Data Buku");

        System.out.print("\n\nPilihan Anda : ");
        pilih = in.next();

        switch (pilih) {
            case "1" -> System.out.println("LIST SELURUH BUKU");
            case "2" -> System.out.println("CARI BUKU");
            case "3" -> System.out.println("TAMBAH DATA BUKU");
            case "4" -> System.out.println("UBAH DATA BUKU");
            case "5" -> System.out.println("HAPUS DATA BUKU");
            default -> System.err.println("\nInput anda tidak ditemukan\nSilahkan Pilih Lagi");
        }
        gas = lanjut("Apakah Anda Ingin Melanjurkan");
        }
    }
    private static void tampilin() throws IOException{}

    private static boolean lanjut(String message){
        Scanner in = new Scanner(System.in);
        String pilih;
        System.out.print("\n"+message+"[y/n]");
        pilih = in.next();

        while(!pilih.equalsIgnoreCase("y")  &&!pilih.equalsIgnoreCase("n")) {
            System.err.println("Pilihan Anda Bukan y atau n");
            System.out.print("\n" + message + "[y/n]");
            pilih = in.next();
        }
        return pilih.equalsIgnoreCase("y");
    }
    private static void cls(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else {
                    System.out.print("\033\143");
                    }
            }catch (Exception ex){
            System.err.println("Tidak Dapat ClearScreen");
        }
    }
}














