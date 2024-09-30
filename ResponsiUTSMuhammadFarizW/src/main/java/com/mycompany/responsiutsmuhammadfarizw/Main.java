/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiutsmuhammadfarizw;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
   
        Produk produk1 = new Elektronik("HP", 5000000, 2);
        Produk produk2 = new Makanan("Nasi Goreng", 17000, "2024-09-30");
        Pegawai pegawai1 = new PegawaiTetap("Muhammad Fariz", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Brilian Bintang", 3000000, 6);

        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}