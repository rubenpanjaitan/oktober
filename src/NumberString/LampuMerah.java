/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumberString;

import java.util.Scanner;

/**
 *
 * @author Hita Do
 */
public class LampuMerah {
    
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan warna");
        String warna = input.next();
        
        if(warna.equals("merah")){
            System.out.println("berhenti");
        }else if(warna.equals("kuning")){
            System.out.println("bersiap");
        }else if (warna.equals("hijau")){
            System.out.println("jalanlah");
        }else{
            System.out.println("wrong");
        }
    }
    
}
