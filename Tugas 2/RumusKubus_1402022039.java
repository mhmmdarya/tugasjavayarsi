public class RumusKubus_1402022039 {
	public static void main(String[] args) {
		// Program Menghitung Rumus Kubus dibuat oleh
		// Nama : Muhammad Arya Kusuma NPM : 1402022039

		// Deklarasi variabel menggunakan tipedata Double karena program akan menghitung Bilangan Riil
		Double panjang, lebar, tinggi, massa, kecepatan, waktu ;
		//Simpan Nilai dari argumen ke dalam masing variabel agar tidak bingung saat penghitungan
		//Karena kita mengambil nilai dari argumen yang bertipedata String maka harus dikonversi terlebih dahulu
		panjang = Double.parseDouble(args[0]);
		lebar = Double.parseDouble(args[1]);
		tinggi = Double.parseDouble(args[2]);
		massa = Double.parseDouble(args[3]);
		kecepatan = Double.parseDouble(args[4]);
		waktu = Double.parseDouble(args[5]);

		// Saya membuat variabel rumus menggunakan tipedata Double supaya nanti saat mencetak output lebih mudah penulisannya
		Double volumeBenda, massaJenis, percepatanBenda, gayaBenda;
		// lalu isi variabel sesuai rumus
		volumeBenda = panjang * lebar * tinggi;
		massaJenis = massa / volumeBenda ;
		percepatanBenda = kecepatan / waktu;
		gayaBenda = massa / percepatanBenda;

		// buat keluaran sesuai ketentuan
		System.out.println("====================================================");
		System.out.println("Program Rumus Kubus\nDibuat oleh Muhammad Arya Kusuma/1402022039");
		System.out.println("====================================================");
		System.out.println("Panjang benda\t\t: "+ panjang + " m" ); 	//output Panjang benda
		System.out.println("Lebar benda\t\t: " + lebar + " m"); 		// lebar benda
		System.out.println("Tinggi benda\t\t: " + tinggi + " m"); 		// tinggi benda
		System.out.println("Massa benda\t\t: " + massa + " kg"); 		// massa benda
		System.out.println("Kecepatan benda\t\t: "+ kecepatan + " m/s"); // kecepatan benda
		System.out.println("Waktu benda\t\t: " + waktu + " s"); 			// waktu benda
		System.out.println("----------------------------------------------------");
		// output dari hasil perhitungan yang sudah saya tampung divariabel 
		// seperti volume benda, massa jenis benda, percepatan benda, gaya benda
		System.out.println("Volume benda\t\t: " + panjang + " x " + lebar + " x " + tinggi + " = " + volumeBenda + " m^3");
		System.out.println("Massa Jenis benda\t: "+ massa +" / " +volumeBenda + " = "+ massaJenis + " kg(m^-3)");
		System.out.println("Percepatan benda\t: " + kecepatan+" / "+ waktu + " = "+ percepatanBenda + " m(s^-2)");
		System.out.println("Gaya benda\t\t: " + massa + " / " + percepatanBenda + " = "+ gayaBenda + " m");
		System.out.println("----------------------------------------------------");

	}
}