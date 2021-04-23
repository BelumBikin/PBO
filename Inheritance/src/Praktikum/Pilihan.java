/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Pilihan {
        void info() {

        Scanner apik = new Scanner(System.in);
        System.out.println("=======DAFTAR MATPEL=======");
        System.out.println("1. Sejarah Indonesia ");
        System.out.println("2. Produktif RPL");
        System.out.println("3. Bahasa Indonesia");
        System.out.println("4. Kimia");
        System.out.print("Masukkan No Matpel   :");
        int x = apik.nextInt();

        if (x >= 1 && x <= 5) {
            if (x == 1) {
                MataPelajaran cetak1 = new MataPelajaran("Sejarah Indonesia", "Sosial", "Buku Paket", 2);
                cetak1.info();
            }
            if (x == 2) {
                MataPelajaran cetak2 = new MataPelajaran("Produktif RPL", "Informatika", "Modul Online", 12);
                cetak2.info();
            }
            if (x == 3) {
                MataPelajaran cetak3 = new MataPelajaran("Bahasa Inggris", "Bahasa", "Buku Paket", 2);
                cetak3.info();
            }
            if (x == 4) {
                MataPelajaran cetak4 = new MataPelajaran("Kimia", "Sains", "Modul Online", 2);
                cetak4.info();
            }

        } else {
            System.out.println("Maaf No Matpel hanya tersedia 1-4");

        }
    }
    
}
