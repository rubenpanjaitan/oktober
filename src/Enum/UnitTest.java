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
public class UnitTest {
   
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Satuan Internasional dan Satuan Non Internasional");    
        System.out.println("|  nama satuan |     SI       |       NSI       |");
        System.out.println("-------------------------------------------------");
        for(Unit satuan: Unit.values()){
            System.out.println(satuan.name()+"\t\t"+satuan.getSi()+"\t\t"+satuan.getNsi());
        }
        System.out.println("Input nama satuan");
        String satuan = input.next();
        System.out.println("SI\t|NSI ");
        System.out.println("-----------------");
        System.out.println(Unit.valueOf(satuan).getSi()+"\t|"+Unit.valueOf(satuan).getNsi());
        
    }
    
}
