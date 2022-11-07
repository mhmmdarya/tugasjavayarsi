import java.util.Scanner;

public class Bioskop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int uang = Integer.parseInt(args[0]);

        if(uang < 30000){
            System.out.println("Maaf Uang Anda Belum Cukup.");
            System.exit(0);
        }

        System.out.println("Selamat Datang Di Bioskop [Muhammad Arya Kusuma] / [1402022039]");
        System.out.println("Kelas yang tersedia:");
        System.out.println("1. Regular");
        System.out.println("2. VIP");
        System.out.print("Pilih Menu (1/2) : ");
        int kelas = input.nextInt();
        System.out.println("===============================================================================");
        if (kelas == 1) {
            System.out.println("Blok tempat duduk Reguler tersedia");
            System.out.println("1. Regular A");
            System.out.println("2. Regular B");
            System.out.println("3. Regular C");
        } else if (kelas == 2) {
            System.out.println("Blok tempat duduk VIP tersedia");
            System.out.println("1. VIP A");
            System.out.println("2. VIP B");
            System.out.println("3. VIP C");
        } else {
            System.out.println("Maaf Kelas Yang Anda Pilih Belum Tersedia");
            System.exit(0);
        }
        System.out.print("Silahkan pilih tempat yang diinginkan : "); int tempatDuduk = input.nextInt();
        System.out.println("===============================================================================");
        int totalHarga = 0;
        if (tempatDuduk == 1) {
            if (kelas == 1) {
                System.out.println("Anda memesan tiket Reguler A");
                totalHarga += 40000;
            } else if(kelas == 2){
                System.out.println("Anda memesan tiket VIP A");
                totalHarga += 85000;
                System.out.println("Keterangan : Tiket Ini Terdapat Popcorn dan Cocacola");
                System.out.print("Apakah anda ingin menambahkan? "); String tambah = input.next();
                totalHarga += (tambah.equalsIgnoreCase("Y")|| tambah.equalsIgnoreCase("y")) ? 5000 : 0; 
            }
        } else if(tempatDuduk == 2){
            if (kelas == 1) {
                System.out.println("Anda memesan tiket Reguler B");
                totalHarga += 35000;
            } else if(kelas == 2){
                System.out.println("Anda memesan tiket VIP B");
                totalHarga += 70000;
                System.out.println("Keterangan : Tiket Ini Terdapat Snack dan Thai tea");
                System.out.print("Apakah anda ingin menambahkan? "); String tambah = input.next();
                totalHarga += (tambah.equalsIgnoreCase("Y")|| tambah.equalsIgnoreCase("y")) ? 15000 : 0; 
            }
        } else if(tempatDuduk == 3){
            if (kelas == 1) {
                System.out.println("Anda memesan tiket Reguler C");
                totalHarga += 30000;
            } else if(kelas == 2){
                System.out.println("Anda memesan tiket VIP C");
                totalHarga += 65000;
                System.out.println("Keterangan : Tiket Ini Terdapat Gorengan dan Es teh manis");
                System.out.print("Apakah anda ingin menambahkan? "); String tambah = input.next();
                totalHarga += (tambah.equalsIgnoreCase("Y")|| tambah.equalsIgnoreCase("y")) ? 5000 : 0; 
            }
        } else {
            System.out.println("Maaf Tempat Duduk Yang Anda Pilih Belum Tersedia");
            System.exit(0);
        }

        System.out.print("Berapa jumlah yang ingin anda pesan? "); int jumlahPesanan = input.nextInt();
        System.out.println("Jumlah uang anda\t: Rp. " + uang);
        totalHarga = totalHarga * jumlahPesanan;
        System.out.println("Total harga yaitu\t: Rp. " + totalHarga);
        if(uang < totalHarga){
            System.out.println("Maaf Uang Anda Tidak Cukup Untuk Melakukan Pembayaran");
        }else{
            System.out.println("Sisa Uang Anda\t\t: Rp. " + (uang - totalHarga));
        }

    }
}