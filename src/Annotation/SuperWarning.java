/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Annotation;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hita Do
 */
public class SuperWarning {
    @SuppressWarnings(value={"deprecation"})
    public static void main(String [] args){
        Date date = new Date();
        System.out.println(date);
        
        SuperWarning sup = new SuperWarning();
        SuperWarningTest sp = sup.new SuperWarningTest();
        sp.openFile();
    }
    
    @SuppressWarnings (value={"unchecked", "serial"})
    public class SuperWarningTest implements Serializable{
        public void openFile(){
            ArrayList array = new ArrayList();
            File file = new File("F:/Karejo/Oktober/Rangkuman");
            array.add(file);
            
            System.out.println(array);
        }
    }
}
