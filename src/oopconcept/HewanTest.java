/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcept;

import Mamalia.Ikan;
import java.awt.Point;
import java.awt.Polygon;
import java.io.Serializable;
import java.util.Locale;

/**
 *
 * @author Hita Do
 */
public class HewanTest implements Serializable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan hewan1 = new Ikan(1);
        Hewan hewan2 = new Burung();

        //interface as a type
        System.out.println("interface burung");
        MoveAble move = new Burung();
        move.move();
        System.out.println(move.isMove(hewan2));
        System.out.println(MoveAble.isJump(hewan2));

        //Paus paus=new Paus();
        //paus.sirip();
        //paus.jumlah("1", "2");
        //behavior hewan1
        System.out.println("ikan lagi lah");
        hewan1.bernafas();
        hewan1.move();
        Ikan.total();

        //behavior hewan2
        hewan2.bernafas();
        hewan2.move();

        Burung burung = new Burung();
        burung.cetak();       

        Paus paus = new Paus(1,2, 3);
        Ikan ikan = paus;
        Ikan.ikanStatic();     
        
    }

}
