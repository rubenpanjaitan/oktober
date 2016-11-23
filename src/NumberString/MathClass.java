/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumberString;

/**
 *
 * @author Hita Do
 */
import static java.lang.Math.*;

public class MathClass {
    
    public static void main(String [] args){
       
        System.out.println("basic\n-----------");
        //membuat bilangan positf
        System.out.println(abs(-0.234));
        //return nilai double yang paling mendekati ke atas
        System.out.println(ceil(1.23));
        //return nilai double yang paling mendekati kebawa
        System.out.println(floor(1.23));
        //mereturn nilai double bilangan bulat yang paling mendekati
        System.out.println(rint(1.23));
        //mereturn nilai int yang paling mendekati
        System.out.println(round(1.23));
        //mencari bilangan yang terkecil
        System.out.println(min(1.23, 2.0));
        //mencari bilangan yang paling besar
        System.out.println(max(1.23,2.0));
        
        System.out.println("log n exp\n------------");
        //menghitung nilai exp
        System.out.println(exp(1.23));
        //menghitung nilai log
        System.out.println(log(10));
        //menghitung nilai akar
        System.out.println(sqrt(1.23));
        //menghitung nilai pangkat
        System.out.println(pow(1.23,2));
    }
    
}
