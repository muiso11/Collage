import java.util.Scanner;

public class App_Store_Sederhana {
    /* Kelompok 1
    Aditya Rizky Fajriansyah 	50421050
    Afif Muhammad Ramadhan		50421059
    Ahmad Toti Maulana			50421082
    Andika Kurniawan 			50421153
    Ariiq Maulana Guawijaya		50421203
    */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        // Tempat Variabel
        String ulang = "y";
        int harga_item[] = {70000, 32000, 26000, 25000, 23000, 21000, 17000, 14000, 12000, 8000 };
        String menu[] = {"Beras 5kg", "Minyak Goreng 2L", "Telur 1kg", "Indomie 10 Bungkus", "Gula Pasir 1kg", "Sarden", "Saus Sambal", "Kecap", "Kopi", "Teh"};
        int total, pembayaran;
        int harga = 0;
        int umur = 0;
        double diskon, bayar;
        int z = 1;
        int j = 1;

        // Perulangan Kembali Ke Menu
        while(ulang == "y" || ulang == "Y"){
            
        //Menu    
            System.out.println("");
            System.out.println("__________________________________________");
            System.out.println("|                   MENU                 |");
            System.out.println("|________________________________________|");
            System.out.println("|          Nama          |     Harga     |");
            System.out.println("|________________________________________|");
            for (int i = 0; i < menu.length ; i++){
                long panjang_string = menu[i].chars().count();
                if(panjang_string > 10){
                    System.out.println("| "+ j + ". " + menu[i] +"\t |  Rp. " + harga_item[i] +"\t |");
                }else{
                    System.out.println("| "+ j + ". " + menu[i] +"\t\t |  Rp. " + harga_item[i] +"\t |");
                }
                j++;
            }
            System.out.println("|________________________|_______________|");
            System.out.println("");
            System.out.println(j);
            // System.out.println("| 1.  Beras  5kg              |   Rp 70000      |");
            // System.out.println("| 2.  Minyak Goreng  2l       |   Rp 32000      |");
            // System.out.println("| 3.  Telur 1kg               |   Rp 26000      |");
            // System.out.println("| 4.  Indomie 10 bungkus      |   Rp 25000      |");
            // System.out.println("| 5.  Gula Pasir 1kg          |   Rp 23000      |");
            // System.out.println("| 6.  Sarden                  |   Rp 21000      |");
            // System.out.println("| 7.  Saus Sambal             |   Rp 17000      |");
            // System.out.println("| 8.  Kecap                   |   Rp 14000      |");
            // System.out.println("| 9.  Kopi                    |   Rp 12000      |");
            // System.out.println("| 10. Teh                     |   Rp 8000       |");

            //Input Biodata
            System.out.print("Masukkan Nama Kamu : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Umur Kamu : ");
            umur = input.nextInt();
            System.out.println("------------------------------------------------");

            //Input Pesanan di Menu
            System.out.print("Masukkan Nomor Pesanan : ");
            int pesen_apa = input.nextInt();
            System.out.print("Masukkan Banyak Pesanan : ");
            int jumlah = input.nextInt();
            System.out.println("------------------------------------------------");

            if (pesen_apa < j){
                pesen_apa = pesen_apa - 1;
                harga = harga_item[0] * jumlah;
                total= harga_item[0] * jumlah;
                System.out.println("Nama Customer : " + nama + ", " + umur + " Thn");
                System.out.println("Menu Pesanan Anda : " + menu[pesen_apa] +"  \nSebanyak "+ jumlah+" \nHarga =  Rp. "+ total);
            }else{
                System.out.println("Maaf Menu Yang Anda Pilih Tidak Tersedia.");
                System.out.print("Apakah anda mau memesan lagi? [Y/N]");
                ulang = input.next();
            }
            
            System.out.println("Apakah ada barang lain yang ingin dibeli?");
            System.out.println("1. Ya");
            System.out.println("2. No");
            System.out.print("Masukkan Pilihan Anda : ");
            pembayaran=input.nextInt();
            if(pembayaran==1){
            System.out.println("Silahkan Scan barang yang ingin dimasukkan kembali");
            }
            else if(pembayaran == 2){
            System.out.println("Terimakasih atas kunjungan anda, semoga harimu menyenangkan");
            }
            break;
        }
                    
        
        if(umur <50){
            diskon = harga * 0.25;
        }else if(umur >50) {
            diskon = harga * 0.30;
        }else {
            diskon = 0;
        }
        bayar = harga - diskon;
        System.out.println("------------------------------------------------");
        System.out.println("Pembayaran sebesar           :  Rp." +harga);
        System.out.println("Anda mendapat diskon sebesar :  Rp." +diskon);
        System.out.println("Total yang harus anda bayar  :  Rp." +bayar);
        System.out.println("-------------------------------------------------");
        System.out.print  ("Jumlah uang yang diberikan   :  RP.");
        pembayaran = input.nextInt();
        double kembalian = pembayaran-bayar;
        System.out.println("Kembalian Anda Sebesar       :  Rp." +kembalian);
        System.out.println("------------------------------------------------");
        System.out.println("                       THANKS                   ");
        System.out.println("------------------------------------------------");
        input.close();   

    }
}