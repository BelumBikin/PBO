/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author MOKLET-2
 */
public class TestLine {
        public static void main(String[] args) {
        Line x = new Line(15, 10, 35, 30);
        System.out.println(x.getLength());
        System.out.println(x.isGreater(x, x));
        System.out.println(x.isLess(x, x));
        System.out.println(x.isEqual(x, x));
    }
}
