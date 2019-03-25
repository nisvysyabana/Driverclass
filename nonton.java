//Tiket Bioskop
//Nama Bioskop : string
//Tanggal : string
//Jam : string
//Film: string
//Genre: string
//Seat : string
//Teather : int
//Banyak tiket : int
//Harga tiket : int
//Bayar : int
//Kembalian : int

public class nonton{
	public static void main (String [] args){
		/*int jam, int teather, int hargaTiket, int banyakTiket, int bayar, int kembalian, String namaBioskop, String tanggal, String film, String genre, String seat*/
	tiketBioskop as = new tiketBioskop("14:20", 1 , 25000 , 2 , 100000 , 50000 , "Cirebon XXI" , "29 Maret 2017" , "CAPTAIN MARVEL" , "ACTION" , "B2, B3");
	System.out.println("--------Tiket Bioskop--------");
	System.out.println("Nama Bioskop	: "+as.NamaBioskop());
	System.out.println("Tanggal			: "+as.Tanggal());
	System.out.println("Jam			: "+as.Jam());
	System.out.println("Film			: "+as.Film());
	System.out.println("Genre			: "+as.Genre());
	System.out.println("Seat			: "+as.Seat());
	System.out.println("Teather			: "+as.Teather());
	System.out.println("Banyak Tiket		: "+as.BanyakTiket());
	System.out.println("Harga Tiket		: "+as.HargaTiket());
	System.out.println("Bayar			: "+as.Bayar());
	System.out.println("Kembalian		: "+as.Kembalian());
	}

}