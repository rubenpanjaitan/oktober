/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Hita Do
 */
public class StudentsTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Students siswa1 = new Students(1, "Ruben");
        Students siswa2 = new Students(2, "Ikki");
        Students siswa3 = new Students(3, "Dimas");

        FileOutputStream fout = new FileOutputStream("F:\\Karejo\\November\\student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        
        System.out.println(out.toString());
        out.writeObject(siswa1);
        out.writeObject(siswa2);
        out.writeObject(siswa2);
        out.flush();
        System.out.println("succes");

    }
}
