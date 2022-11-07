import java.util.Scanner;
import java.util.Arrays;
// import kelas Scanner dan kelas Array

public class CekTiket_1402022039 {
    public static void main(String[] args) {
        // Nama :  Muhammad Arya Kusuma NPM : 1402022039

        Scanner scan = new Scanner(System.in);
        // Construct kelas Scanner menjadi objek dengan nama scan

        String[] tempatBooking = new String[10];
        //Deklarasi array of string tempat booking dengan panjang 10 
        
        // Cetak print out sesuai kriteria
        System.out.println("================================================");
        System.out.println("---------Program Cek Tiket Steam Motor----------");
        System.out.println("-----[Muhammad Arya Kusuma] / [1402022039]------");
        System.out.println("================================================");
        // Scan tempat 1 sampai tempat 8
        System.out.print("Tempat 1 : "); tempatBooking[0] = scan.nextLine();
        System.out.print("Tempat 2 : "); tempatBooking[1] = scan.nextLine();
        System.out.print("Tempat 3 : "); tempatBooking[2] = scan.nextLine();
        System.out.print("Tempat 4 : "); tempatBooking[3] = scan.nextLine();
        System.out.print("Tempat 5 : "); tempatBooking[4] = scan.nextLine();
        System.out.print("Tempat 6 : "); tempatBooking[5] = scan.nextLine();
        System.out.print("Tempat 7 : "); tempatBooking[6] = scan.nextLine();
        System.out.print("Tempat 8 : "); tempatBooking[7] = scan.nextLine();
        System.out.println("================================================");
        System.out.println("==================Masukkan Data=================");
        // Scan nama, plat, tanggal, waktu yang bertipedata String dan scan Int tempat
        System.out.print("Nama\t\t\t: "); String nama = scan.nextLine();
        System.out.print("Plat nomor\t\t: " ); String plat = scan.nextLine();
        System.out.print("Tanggal(dd/mm/yyyy)\t: "); String tanggal = scan.nextLine();
        System.out.print("Jam pelaksanaan\t\t: "); String waktu = scan.nextLine();
        System.out.print("Pilih tempat steam anda\t: " ); int tempat = scan.nextInt();
        // inisialisasi array sesuai tempat yang dipilih oleh user dengan value nama yang diinput user
        tempatBooking[tempat - 1 ]= nama;
        System.out.println("================================================");
        String tiket = "" + nama.charAt(0) + nama.charAt(1) + plat.substring(0, plat.indexOf(' ')) + (int) Double.parseDouble(waktu) + Integer.parseInt(tanggal.substring(0,2));
        // deklarasi tiket dengan isi 2 huruf pertama dari nama, huruf plat, jam, tanggal pelaksanaan
        System.out.println("Tiket anda\t: " + tiket.toUpperCase()); //cetak tiket agar semua huruf kapital gunakan method toUpperCase
        System.out.println("================================================"); 
        String[][] daftarBooking = new String[2][5];
        // Deklarasi array multidimensi daftarBooking dengan panjang 2 x 5
        daftarBooking[0] = Arrays.copyOfRange(tempatBooking, 0, 5);
        // Copy isi array kolom pertama dengan value tempatBooking dari index 0 sampai 5
        daftarBooking[1] = Arrays.copyOfRange(tempatBooking, 5, 10);
        // Copy isi array kolom kedua dengan value tempatBooking dari index 5 sampai 10
        System.out.println("Daftar booking tempat steam motor:");
        System.out.println(Arrays.deepToString(daftarBooking));
        //Cetak array multimensi daftarBooking dengan method deepToString
        System.out.println("================================================");
        int hari = Integer.parseInt(tanggal.substring(0,2)); // isi value hari dengan substring dari tanggal
        int bulan = Integer.parseInt(tanggal.substring(3,5)); // isi value bulan dengan substring dari tanggal
        int tahun = Integer.parseInt(tanggal.substring(6)); // isi value tahun dengan substring dari tanggal
        String jam = "" + waktu.substring(0, 2); // isi value jam dari substring waktu
        String menit = "" + waktu.substring(3); // isi value menit dari substring waktu
        boolean status[] = new boolean[3];
        // deklarasi array boolean dengan nama status panjangnya 3
        status[0] = (hari >= 5 && hari <= 20) && (bulan >= 1 && bulan <= 10) && (tahun >= 2022) ;
        // isi status[0] dengan tanggal 5-10, bulan 1-10, dan tahun >= 2022
        status[1] = Integer.parseInt(jam) >= 9 && Integer.parseInt(jam) <= 20 && Integer.parseInt(menit) < 60;
        // isi status[1] dengan jam 9-20, menit harus sesuai
        status[2] = tempat == 9 || tempat == 10;
        // isi status[2] dengan tempat harus 9/10
        System.out.println("Status pengecekan:");
        System.out.println("Tanggal\t: " + status[0]);
        System.out.println("Jam\t: " + status[1]);
        System.out.println("Tempat\t: " + status[2]);
        System.out.println("Berikut hasil pengecekan Anda : " + Arrays.toString(status));
        // cetak array status dengan method toString
        System.out.println("Jika salah satu dari hasil pengecekan adalah false, maka tiket tidak dapat digunakan!");
        System.out.println("================================================");
        System.out.println("Terima kasih telah menggunakan program ini");
        System.out.println("================================================");
    }
}
