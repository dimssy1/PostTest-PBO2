package com.mycompany.ekskulbasket1.model;

public class Anggota {
    private int id;
    private String nama;
    private String kelas;

    // Constructor
    public Anggota(int id, String nama, String kelas) {
        this.id = id;
        this.nama = nama;
        this.kelas = kelas;
    }

    // Getter & Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getKelas() { return kelas; }
    public void setKelas(String kelas) { this.kelas = kelas; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Kelas: " + kelas;
    }
}
