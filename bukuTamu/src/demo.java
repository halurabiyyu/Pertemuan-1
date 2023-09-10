package bukuTamu.src;

import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        
            BukuPengunjung bukuPengunjung = new BukuPengunjung();
            Scanner scanner = new Scanner(System.in);
    
            while (true){
                System.out.println("Menu:");
                System.out.println("1. Tambah Pengunjung");
                System.out.println("2. Lihat Buku Pengunjung");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1-3): ");
    
                int choice = scanner.nextInt();
                scanner.nextLine();
    
                switch (choice) {
                    case 1:
                        addBukuTamu(scanner, bukuPengunjung);
                        break;
                    case 2:
                        lihatBukuTamu(bukuPengunjung);
                        break;
                    case 3:
                        System.out.println("Terima kasih! Semoga jumpa dilain waktu");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak tersedia. Silakan pilih 1-3.");
                }
            }
        }
    
        private static void lihatBukuTamu(BukuPengunjung bukuPengunjung) {
            bukuPengunjung.printPengunjung();
        }
    
        private static void addBukuTamu(Scanner scanner, BukuPengunjung bukuPengunjung) {
            System.out.print("Masukkan Nama : ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat : ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Nomor hp: ");
            String nomor_hp = scanner.nextLine();
            Pengunjung pengunjungBaru = new Pengunjung(nama,alamat,nomor_hp);
            bukuPengunjung.addPengunjung(pengunjungBaru);
        }
    }
