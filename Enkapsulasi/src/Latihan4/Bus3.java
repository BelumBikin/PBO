/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author MOKLET-2
 */
public class Bus3 {
    public int penumpang;
    public int maxpenumpang;
    
    public Bus3 (int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang (int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp> maxpenumpang){
            System.out.println("penumpang melebihi kapasitas");
        } else {
            this.penumpang=temp;
        }
    }
    
    public void getpenumpang(int password){
        if (password ==52){
            System.out.println("Password benar");
        } else{
            System.out.println("Password salah");
        }
    }
    
    public void cetakpenumpang(){
        System.out.println("Penumpang sekarang = "+ penumpang);
        System.out.println("Maksimum penumpang seharusnya adalah = "+ maxpenumpang);
    }
    
}
