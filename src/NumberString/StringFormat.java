/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberString;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Hita Do
 */
public class StringFormat {

    public static void main(String[] args) {
        long n = 12345;
        double d = Math.PI;
        Date date = new Date();

        System.out.format("%d%n", n);
        System.out.format("%08d%n", n);
        System.out.format("%+08d\n", n);
        System.out.format("%,8d%n", n);
        System.out.format("%+,08d%n", n);

        System.out.format("format decimal\n", d);
        System.out.format("%f%n", d);
        System.out.format("%.3f%n", d);
        System.out.format("%10.3f%n", d);
        System.out.format(Locale.ITALIAN, "%+4f%n", d);

        System.out.format("%tB %td, %tY%n", date, date, date); 
        System.out.format("%tl:%tM %tp%n", date, date, date);  
        System.out.format("%tD%n", date, date, date);
        
        //format pecahan
        customFormat("###.##",12345.6789);
        customFormat("$###,###.###",12345678.9);
        
    }
    
    static void customFormat(String pattern, double nilai){
        DecimalFormat pecahan = new DecimalFormat();
        String output = pecahan.format(nilai);
        System.out.println(output);
    }

}
