import java.util.Scanner; //1

public class Relasi_Ujian {
       int[] HimpunanA;
       int[] HimpunanB;
       int[] HimpunanRelasi;
       int[] HimpunanAsal;
       int jmlHimpunanA, jmlHimpunanB, jmlRelasi;
	   	  Scanner input=new Scanner(System.in); //2

       public static void main(String args[]){
             Relasi_Ujian a= new Relasi_Ujian();  //3
             a.inputAnggota();      //3
             a.cetakHimpunan();     //3
             a.inputRelasi();       //3
             a.cekFungsi();         //3
             a.cetakHimpunan();     //3
       }
       public void inputAnggota(){
              System.out.print("Masukkan Jumlah Himpunan A = ");
              jmlHimpunanA =input.nextInt();
              HimpunanA=new int[jmlHimpunanA];
              for(int i=0; i<=(jmlHimpunanA-1); i++){ //4
                      System.out.print("Himpunan A yang ke "+ (i+1)+" : ");
                      HimpunanA[i]=input.nextInt();
              }

              System.out.print("Masukkan Jumlah Himpunan B = ");
              jmlHimpunanB = input.nextInt();
              HimpunanB = new int[jmlHimpunanB];
              for(int i = 0;i<= (jmlHimpunanB-1);i++){
                      System.out.print("Himpunan B yang ke "+ (i+1) +" : ");
                     HimpunanB[i] = input.nextInt(); //5
              }

       }
       public void cetakHimpunan(){
              System.out.print("Anggota Himpunan A = { ");
              for (int i = 0;i<=(jmlHimpunanA-1);i++){
                  System.out.print(HimpunanA[i]+ " ");
              }
              System.out.println("} ");
              System.out.print("Anggota Himpunan B = { ");
              for (int i = 0;i<=(jmlHimpunanB-1);i++){
                  System.out.print(HimpunanB[i]+ " ");
              }
              System.out.println("} ");
       }
       public void inputRelasi(){
              int jmlRelasiMaks = jmlHimpunanA * jmlHimpunanB;
              System.out.println("Relasi Maksimal Adalah "+jmlRelasiMaks);
              System.out.print(" ");

              do{
                  System.out.print("Masukan Jumlah Relasi yang Terjadi : ");
                  jmlRelasi = input.nextInt();
              }while(jmlRelasi>jmlRelasiMaks);
              HimpunanRelasi = new int[jmlRelasi];
              HimpunanAsal = new int[jmlRelasi];
              System.out.println("Masukkan Relasi yang Terjadi :");
              for(int i=0; i<=(jmlRelasi-1);i++){

                 int[] temp=new int[jmlRelasi];
                 int[] temp2 = new int[jmlRelasi];
                 boolean SamaA = false;
                 boolean SamaB = false;

                 System.out.println("Relasi ke "+(i+1)+" : ");
                 do{
                    System.out.print("Masukkan Asal A : ");
                    temp[i]=input.nextInt();
                    System.out.print("Masukkan Tujuan B: ");
                    temp2[i]=input.nextInt();

                    for (int j= 0; j<=(jmlHimpunanA-1);j++){
                        if(temp[i]==HimpunanA[j]){
                           SamaA=true;
                        }
                    }

                    for (int k= 0; k<=jmlHimpunanB-1;k++){
                        if(temp2[i]==HimpunanB[k]){ //6
                           SamaB=true;
                        }
                    }
                    if(SamaA==false || SamaB==false){
                        System.out.println("Anggota Himpunan Tidak terdapat dihimpunan A atau B");
                    }

                   if(SamaA==true && SamaB==true){
                        HimpunanRelasi[i]=temp2[i];
                        HimpunanAsal[i] = temp[i]; //7
                    }

                 }while(SamaA==false || SamaB==false);
                 }
        }
        public void cekFungsi(){
               int jumlahAnggota = 0;
               boolean adaSama = false;

               for(int i =0;i<=(jmlHimpunanA-1);i++){
                       for(int j=0; j<=(jmlRelasi-1); j++){ //8

                            if(HimpunanA[i]==HimpunanAsal[j]){
                                jumlahAnggota++;
                            }
                       }
               }

               for(int i = 0;i<=(jmlRelasi-1);i++){
                       for(int j=i+1; j<=(jmlRelasi-1); j++){ //9
                        if(HimpunanAsal[i]==HimpunanAsal[j]){
                           adaSama=true;
                           }
                       }
               }
               if(jumlahAnggota==jmlHimpunanA && adaSama == false){
                System.out.println("Relasi yang diInput adalah Fungsi");
               }else {
                System.out.println("Relasi yang di input Bukan Fungsi hanya relasi biasa");
               }
        }

        public void cetakRelasi(){
         System.out.print("Daerah Domain = { ");
              for(int i=0;i<=jmlHimpunanA-1;i++){
                System.out.print(HimpunanA[i]+" ");
              }
              System.out.println("}");

              System.out.print("Daerah Kodomain { ");
              for(int i=0;i<=jmlHimpunanB-1;i++){
                System.out.print(HimpunanB[i]+ " ");
              }
              System.out.println("}");
              System.out.print("Daerah range adalah : { ");
              for(int i= 0;i<= jmlRelasi-1;i++){
                      boolean adaSama=false;
                      for (int j = i+1;j<=jmlRelasi-1;j++){
                           if(HimpunanRelasi[i]==HimpunanRelasi[j]) //10
                           adaSama=true;
                      }
                   if(adaSama==false)System.out.print(HimpunanRelasi[i]+" ");
              }
              System.out.println("}");
        }
}