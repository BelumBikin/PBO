/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author MOKLET-2
 */
public class Mapel {
        private String jenismapel;
    private String bukupenunjang;
    private int jampelajaran;

    public Mapel(String jenismapel, String bukupenunjang, int jampelajaran) {
        this.jenismapel = jenismapel;
        this.bukupenunjang = bukupenunjang;
        this.jampelajaran = jampelajaran;
        
    }

    public void info() {
        System.out.println("Jenis Mata Pelajaran    : " + this.jenismapel);
        System.out.println("Mata Pelajaran          : " + this.bukupenunjang);
        System.out.println("Jam Pelajaran           : " + this.jampelajaran + " Jam");
    }
    
}
