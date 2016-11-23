/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Hita Do
 */
public class StudentsRead {
    
    public static void main(String [] args) throws Exception{
        ObjectInputStream fin = new ObjectInputStream(new FileInputStream("F:\\Karejo\\November\\student.txt"));
        Students siswa = (Students)fin.readObject();
        //while(siswa! hasNext())
        
        System.out.println(siswa.getId() +" "+ siswa.getName());
    }
    
}
