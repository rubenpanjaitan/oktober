/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Scanner;

/**
 *
 * @author Hita Do
 */
public class ReligiTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Code Agama");
        System.out.println("Code    |Agama     ");
        System.out.println("---------------------");
        for (Religi religi : Religi.values()) {
            System.out.println(religi.getCode() + "\t|" + religi);
        }
        
        //jika masukan nama agama untuk mendapatkan code
        System.out.println("Masukkan Agama :");
        String agama = input.next();
        System.out.println("Code :\n" +Religi.valueOf(agama).getCode());
        System.out.println("---------------------");
        
        //jika masukan code untuk mendapatkan agama
        System.out.println("Masukkan code :");
        int code = input.nextInt();
        System.out.println("Agama");
        for(Religi religi : Religi.values()){
            System.out.println(religi.getReligi(code));
            break;
        }
        
    }
}
