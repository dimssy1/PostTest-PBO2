package com.mycompany.ekskulbasket1.main;

import com.mycompany.ekskulbasket1.service.AnggotaService;
import java.util.Scanner;

public class Main_fixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AnggotaService service = new AnggotaService();

        int pilihan = 0;
        
        System.out.println("=====================================");
        System.out.println("     SELAMAT DATANG DI SISTEM ");
        System.out.println("     EKSKUL BASKET SEKOLAH ");
        System.out.println("     SMA 11 SAMARINDA ");
        System.out.println("=====================================");
        
        

        do {
            try {
                // Menu dengan tabel ASCII
                System.out.println("\n+-----------------------------------+");
                System.out.println("|           MENU PILIHAN            |");
                System.out.println("+-----------------------------------+");
                System.out.println("| 1 | Tambah Anggota                |");
                System.out.println("| 2 | Lihat Daftar Anggota          |");
                System.out.println("| 3 | Ubah Data Anggota             |");
                System.out.println("| 4 | Hapus Anggota                 |");
                System.out.println("| 5 | Cari Anggota                  |");
                System.out.println("| 6 | Keluar                        |");
                System.out.println("+-----------------------------------+");
                System.out.print("Pilih menu (1-6): ");

                pilihan = Integer.parseInt(input.nextLine());

                switch (pilihan) {
                    case 1 -> service.tambah();
                    case 2 -> service.tampil();
                    case 3 -> service.update();
                    case 4 -> service.hapus();
                    case 5 -> service.cari();
                    case 6 -> {
                        System.out.println("\n=====================================");
                        System.out.println("   TERIMA KASIH TELAH MENGGUNAKAN ");
                        System.out.println("   SISTEM EKSKUL BASKET SEKOLAH");
                        System.out.println("=====================================");
                    }
                    default -> System.out.println("Pilihan tidak valid. Silakan pilih 1-6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        } while (pilihan != 6);
    }
}