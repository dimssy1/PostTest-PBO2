# PostTest-PBO2

*Nama : Dimas Aji Mukti
Nim : 2409116107*

# 🏀SISTEM BASIS DATA EKSKUL BASKET🏀 #

## |DESKRIPSI PROGRAM| ##
Program ini dibuat sebagai simulasi dari Sistem Basis Data Ekskul Basket,
Dan program ini memilik beberapa fitur yang digunakan yaitu:
- CRUD (Create, Read, Update, Delete) Anggota Ekskul Basket
- Search Feature🧐 Cari Anggota berdasarkan ID, Dapat dipakai untuk update, hapus, atau fitur khusus pencarian.
- Access Modifier private (menyembunyikan data, contoh: field di Anggota).
  public (membuka akses method tertentu, contoh: getter, setter, service method).
- ArrayList (untuk menyimpan daftar Anggota)
- Model View Controller (struktur MVC)
  model → class Anggota.
  service → class AnggotaService (CRUD logic).
  main → class MainApp (menu & interaksi user).
- Percabangan dan Perulangan (switch-case untuk menu. do-while untuk mengulang menu sampai user keluar.)
- Exception Handling (Agar tidak crash ketika salah input)
- Validasi Input ✅ (baru kita tambahkan)
  Cek input ID valid.
  Cek apakah anggota ada di daftar sebelum update/hapus.
  Cek input kosong saat update.
- Object-Oriented Programming (OOP)
  Class Anggota sebagai model data.
  Ada properties (id, nama, kelas).
  Ada constructor untuk inisialisasi object.
  Getter & Setter (encapsulation dengan private + public).
  toString() untuk representasi object jadi teks.
________________________________________________________________________________________________________________________

# Penerapan MVC #
- Model (M) Menyimpan struktur anggota
- View (V) untuk menampilkan menu dan output
- Controller (C) Logika CRUD

________________________________________________________________________________________________________________________

# 📌 Alur Program #
- package model
  Berisi class Anggota, yaitu struktur data anggota basket.
    - Properti: id, nama, kelas
    - Constructor: untuk inisialisasi data anggota
    - Getter & Setter: mengatur akses ke properti (encapsulation)
    - toString(): menampilkan data anggota dalam format teks
- package service
  Berisi class AnggotaService, yaitu logika CRUD dan fitur tambahan.
    - tambah() → menambahkan anggota baru
    - tampil() → menampilkan daftar anggota
    - update() → mengubah data anggota
    - hapus() → menghapus anggota
    - cariById() → mencari anggota berdasarkan ID
- package main
  Berisi class MainApp, yaitu menu utama dan interaksi dengan user.
  - Menampilkan banner ASCII “SMA 11 Basket”
  - Menyediakan menu pilihan (Tambah, Lihat, Ubah, Hapus, Cari, Keluar)
  - Menghubungkan input user dengan method di AnggotaService.
















