/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author Hita Do
 */
public class Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("F:\\Karejo\\November\\date.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeInt(12345);
            oos.writeObject("Today");
            oos.writeObject(new Date());
            System.out.println("cetak");
            ObjectInputStream fis = new ObjectInputStream(new FileInputStream("F:\\Karejo\\November\\date.txt"));
            int angka = (int) fis.readInt();
            String date = (String) fis.readObject();
            Date tanggal = (Date) fis.readObject();
            System.out.println(angka);
            System.out.println(date);
            System.out.println(tanggal);
        }

    } 

}
