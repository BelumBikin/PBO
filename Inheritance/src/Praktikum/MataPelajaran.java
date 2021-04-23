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
class MataPelajaran extends Mapel {
        private String MataPelajaran;

    public MataPelajaran(String matapelajaran, String jenismapel, String bukupenunjang, int jampelajaran) {
        super(jenismapel, bukupenunjang, jampelajaran);
        this.MataPelajaran = MataPelajaran;
    }

    public void info() {
        System.out.println();
        System.out.println("Mata Pelajaran          : " + this.MataPelajaran);
        super.info();
    }
}
