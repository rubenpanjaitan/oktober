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
public class InitialName {
    
    public static void main(String []arg ){
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        
        
        for(int i=0 ; i<nama.length();i++){
            if(Character.isUpperCase(nama.charAt(i))){
                sb.append(nama.charAt(i));
            }else if(Character.isWhitespace(nama.charAt(i))){
                sb.append(Character.toUpperCase(nama.charAt(i+1)));
                i+=2;
               // break;
            }else if(Character.isLowerCase(nama.charAt(0))&& i==0){
                sb.append(Character.toUpperCase(nama.charAt(0)));
                
            }
        }
        System.out.println(sb);
    }
    
}
