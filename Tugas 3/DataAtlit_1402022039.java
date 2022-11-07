public class DataAtlit_1402022039{
	public static void main(String[] args) {
		// Nama : Muhammad Arya Kusuma NPM : 1402022039
		// Tampung Hasil Input/argumen user ke dalam variabel menggunakan tipedata string
		String nama, umur, cabang, keterangan;
		nama = args[0];
		umur = args[3];
		cabang = args[2];
		keterangan = args[1];

		//Ambil setiap karakter dari nama dengan menggunaan fungsi bawaan Java dan saya menampungnya di Variabel bertipedata Char
		// Karakter yang diambil digunakan untuk membuat Inisial nama dan untuk mencari No punggung
		char awal, tengah, akhir ;
		awal = nama.charAt(0);
		tengah = nama.charAt(nama.length() / 2);
		akhir = nama.charAt(nama.length() - 1);

		//Membuat rumus untuk mencari No punggung menggunakan tipedata Integer
		int sebelum, sesudah;
		sebelum = ((int) awal + tengah + akhir) / Integer.parseInt(keterangan);
		sesudah = ((int) awal + tengah + akhir) % Integer.parseInt(keterangan);

		//Membuat Output sesuai yang diminta

		System.out.println("-----------------------------------------------------");
		System.out.println("\t\tProgram DATA ATLIT\nDibuat oleh Muhammad Arya Kusuma/1402022039");
		System.out.println("-----------------------------------------------------");
		System.out.println("Cabang Olahraga\t\t\t: " + cabang);
		System.out.println("Nama\t\t\t\t: " + nama);
		System.out.println("Umur\t\t\t\t: "+ umur);
		System.out.println("-----------------------------------------------------");
		System.out.println("Karakter depan dari nama\t: " + awal);
		System.out.println("Karakter tengah dari nama\t: " + tengah);
		System.out.println("Karakter belakang dari nama\t: " + akhir);
		System.out.println("-----------------------------------------------------");
		System.out.println("Inisial Nama\t\t\t: " + awal +""+ tengah+""+akhir);
		System.out.println("No punggung sebelum diganti\t: " + sebelum);
		System.out.println("No punggung sesudah diganti\t: " + sesudah);



	}
}