/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NumberString;

import java.util.Date;

/**
 *
 * @author Hita Do
 */
public class IntegerTest {
    
    public static void main(String[] args){
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        Date date = new Date();
        //mengubah ke dalam bentuk primitive
        System.out.println(a.byteValue());
        //membandingkan bilangan yang jika sama akan return 0, -1 jika posisipertama < posisikedua; 1 jika posisipertama > posisikedua
        System.out.println(a.compareTo(b));
        System.out.println(a.doubleValue());
        //membandingkan object yang mereturn boolean
        System.out.println(a.equals(a));
        System.out.println(a.floatValue());
        System.out.println(a.getClass());
        System.out.println(a.hashCode());  
        
        //method static
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        //membandingkan bilangan yang jika sama akan return 0, -1 jika posisipertama < posisikedua; 1 jika posisipertama > posisikedua
        System.out.println(Integer.compare(b, a));
        System.out.println(Integer.decode(a.toString()));
        //menghitung jumlah bit 1 setiap bilangan biner
        System.out.println(Integer.bitCount(7));
        //mengubah string ke dalam integer
        System.out.println(Integer.parseInt("23"));
        System.out.println(Integer.parseInt("23",16));
        System.out.println(Integer.valueOf("333", 10));
        //printstream
        System.out.format("%d\n", a);
        System.out.format("%tD", date);
        
    }
    
}
