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
public class CurrencyTest {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Daftar Currency");
        for(Currency currency :Currency.values()){
            System.out.println(currency +" ===> "+currency.getCurrency());
        }     
        //if you input the symbol to get currency
        System.out.println("enter symbol :");
        String symbol = input.next();       
        System.out.println(Currency.valueOf(symbol).getCurrency());
        System.out.println("============================================");
        //if you input the currency to get symbol
        System.out.println("enter Currency :");
        input.nextLine();
        String namaCurrency=input.nextLine(); 
        System.out.println("Symbol");       
        for(Currency currency :Currency.values()){
            System.out.println(currency.getValue(namaCurrency));
            break;
        }
        
        input.close();
        
    }
    
}
