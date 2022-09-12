public class Try_ThisFunc {

    public static void main(String[] args) {
        
        int a1=2,a2=3;
        Penjumlahan jum = new Penjumlahan(a1,a2);
        System.out.println("Hasil : "+jum.hitung());
        System.out.println("Kali : "+jum.kelKali());
	}
}
class Penjumlahan{
    int x;
    int y;
    public Penjumlahan(int a, int b){
        this.x = a;
        this.y = b;
    }
    public int hitung ()  {
        return x + y;
    }
    private int kali () {
        return x * y;
    }
    public int kelKali() {
        return kali (); 
    }
}
        
        
       