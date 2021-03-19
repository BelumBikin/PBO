/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus4 {
    public static void main(String[] args) {
        Bus4 Bus = new Bus4(87);
        Bus.getpenumpang(52);
        Bus.cetakpenumpang();
        Bus.getpenumpang(22);
        Bus.addpenumpang(22);
        Bus.cetakpenumpang();
        Bus.getpenumpang(66);
        Bus.addpenumpang(78);
        Bus.cetakpenumpang();
        Bus.getpenumpang(33);
        Bus.addpenumpang(23);
        Bus.cetakpenumpang();
        Bus.getpenumpang(20);
        Bus.addpenumpang(10);
        Bus.cetakpenumpang();
        Bus.getpenumpang(90);
        Bus.addpenumpang(25);
        Bus.cetakpenumpang();
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
}
