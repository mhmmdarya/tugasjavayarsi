import java.util.Scanner;
//Import Kelas Scanner

public class ProgramBeasiswaFTI_1402022039 {
    public static void main(String[] args) {
        //Membuat objek scan dari Scanner
        Scanner scan = new Scanner(System.in);
        //Deklarasi dan inisialisasi namadepan dan belakang menggunakan tipedata String yang mengambil nilai dari argumen/input user
        String namaDepan = args[0];
        String namaBelakang = args[1];
        //Deklarasi Array dan inisilasi array, saya menggunakan tipedata Integer sebagai ID karena ID merupakan bilangan bulat
        int[] id = new int[3];
        id[0] = (int) namaDepan.charAt(0) + namaBelakang.charAt(0); //id index[0] ambil dari nilai char huruf pertama dari nama depan dan belakang
        id[1] = (int) namaDepan.charAt(namaDepan.length() / 2) + namaBelakang.charAt(namaBelakang.length() / 2); //id index[1] ambil dari nilai char huruf tengah nama depan dan belakang
        id[2] = (int) namaDepan.charAt(namaDepan.length() - 1) + namaBelakang.charAt(namaBelakang.length() - 1); //id index[2] ambil dari nilai char huruf terakhir nama depan dan belakang

        //Print out sesuai kriteria
        System.out.println("-----------------------------------------------");
        System.out.println("Program Beasiswa FTI tahun 2022\nDibuat Oleh Muhammad Arya Kusuma/1402022039");
        System.out.println("-----------------------------------------------");
        System.out.println(
                "Halo " + namaDepan + " " + namaBelakang + ", Selamat datang di Program Beasiswa FTI tahun 2022");
        System.out.print("Masukkan IPK anda: ");
        Double ipk = scan.nextDouble(); //Scan ipk yang diinput oleh user dan tampung diVariabel yang bertipedata Double karena IPK adalah bilangan riil
        Boolean ipkHarus = (ipk >= 3.0 && ipk <= 4.0); //IPK sesuai kriteria
        System.out.println("-----------------------------------------------");
        System.out.println("Jawab Pertanyaan berikut dengan true/false!");
        System.out.println("1. Apakah anda memiliki IPK diatas 3.0? " + ipkHarus);
        System.out.print("2. Apakah anda sedang mengikuti beasiswa lain? ");
        Boolean ikutBeasiswa = scan.nextBoolean(); //scan inputan dari user, apakah mengikuti beasiswa lain atau tidak
        System.out.print("3. Apakah anda bagian dari mahasiswa FTI? ");
        Boolean bagianFTI = scan.nextBoolean(); //scan inputan dari user, apakah merupakah bagian dari FTI
        System.out.println("-----------------------------------------------");
        System.out.println("-------Selamat Program Beasiswa Berjalan-------");
        System.out.println("Nama\t: " + namaDepan + " " + namaBelakang); //Tampilkan nama lengkap
        System.out.println("ID\t: " + id[0] + id[1] + id[2]); //Print id sesuai kriteria dengan memanggil array id dari masing-masing index
        Boolean dapatBeasiswa = (ipkHarus && bagianFTI && !ikutBeasiswa); //Cek apakah mendapatkan beasiswa
        System.out.println("Apakah saya mendapatkan beasiswa? " + dapatBeasiswa);
        System.out.println("Apakah boleh mengikuti beasiswa lain? " + !dapatBeasiswa); //menggunakan operator not karena jika mendapatkan beasiswa tidak boleh mengikuti beasiswa lain
    }
}
