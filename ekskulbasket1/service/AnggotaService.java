package com.mycompany.ekskulbasket1.service;

import com.mycompany.ekskulbasket1.model.Anggota;
import java.util.ArrayList;
import java.util.Scanner;

public class AnggotaService {
    private final ArrayList<Anggota> anggotaList = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    // Tambah data anggota
    public void tambah() {
        try {
            System.out.print("Masukkan ID: ");
            int id = Integer.parseInt(input.nextLine());

            // Cek apakah ID sudah ada
            if (cariById(id) != null) {
                System.out.println("ID sudah terdaftar!");
                return;
            }

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan Kelas: ");
            String kelas = input.nextLine();

            Anggota a = new Anggota(id, nama, kelas);
            anggotaList.add(a);
            System.out.println("Anggota berhasil ditambahkan.");
        } catch (NumberFormatException e) {
            System.out.println("Input ID harus berupa angka!");
        }
    }

    // Tampilkan semua anggota
    public void tampil() {
        if (anggotaList.isEmpty()) {
        System.out.println("Belum ada anggota.");
        return;
    }

    System.out.println("\n+--------------------------------------+");
    System.out.println("| ID  | Nama                | Kelas    |");
    System.out.println("+--------------------------------------+");
    for (Anggota a : anggotaList) {
        System.out.printf("| %-3d | %-18s | %-8s |\n", 
                          a.getId(), a.getNama(), a.getKelas());
    }
    System.out.println("+--------------------------------------+");
}

    // Update data anggota
    public void update() {
        try {
            System.out.print("Masukkan ID anggota yang ingin diubah: ");
            int id = Integer.parseInt(input.nextLine());
            Anggota a = cariById(id);

            if (a == null) {
                System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                return;
            }

            System.out.print("Nama baru (kosongkan jika tidak diubah): ");
            String nama = input.nextLine();
            if (!nama.isBlank()) a.setNama(nama);

            System.out.print("Kelas baru (kosongkan jika tidak diubah): ");
            String kelas = input.nextLine();
            if (!kelas.isBlank()) a.setKelas(kelas);

            System.out.println("Data anggota berhasil diubah.");
        } catch (NumberFormatException e) {
            System.out.println("Input ID harus berupa angka!");
        }
    }

    // Hapus anggota
    public void hapus() {
        try {
            System.out.print("Masukkan ID anggota yang ingin dihapus: ");
            int id = Integer.parseInt(input.nextLine());
            Anggota a = cariById(id);

            if (a == null) {
                System.out.println("Anggota dengan ID tersebut tidak ditemukan.");
                return;
            }
            anggotaList.remove(a);
            System.out.println("Anggota berhasil dihapus.");
        } catch (NumberFormatException e) {
            System.out.println("Input ID harus berupa angka!");
        }
    }

    // Cari anggota by ID
    public void cari() {
        try {
            System.out.print("Masukkan ID anggota yang ingin dicari: ");
            int id = Integer.parseInt(input.nextLine());
            Anggota a = cariById(id);

            if (a == null) {
                System.out.println("Anggota tidak ditemukan.");
            } else {
                System.out.println("Data ditemukan: " + a);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input ID harus berupa angka!");
        }
    }

    // Util: cari anggota by ID
    private Anggota cariById(int id) {
        for (Anggota a : anggotaList) {
            if (a.getId() == id) return a;
        }
        return null;
    }
}
