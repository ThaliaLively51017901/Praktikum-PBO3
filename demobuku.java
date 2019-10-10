public class demobuku {
	public static void main(String args[]) {
		buku a, b;
		a = new buku();
		b = new buku();
		
		a.pengarang = "Felix Siaw";
		a.judul = "Beyound The Inspiration";
		b.pengarang = "Budi Raharjo";
		b.judul = "Mudah Belajar Java";
		
		System.out.println("Judul: "+a.judul+" Pengarang: "+a.pengarang);
		System.out.println("Judul: "+b.judul+" Pengarang: "+b.pengarang);
	}
}