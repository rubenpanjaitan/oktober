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
public class PalindromTest {

    public static void main(String[] args) {

        String kalimat = "Dot saw I was Tod ";
        int length = kalimat.length();
        char[] arraySatu = new char[kalimat.length()];
        char[] arrayDua = new char[kalimat.length()];

        for (int i = 0; i < length; i++) {
            arraySatu[i] = kalimat.charAt(i);
        }

        for (int j = 0; j < length; j++) {
            arrayDua[j] = arraySatu[length - 1 - j];
            System.out.println(arrayDua[j]);
        }

        String reverse = new String(arrayDua);
        System.out.println(reverse.concat(kalimat));

        String fs;
        Integer integerValue=6;
        Float floatValue=10.0f;
        fs = String.format("The value of the float "
                + "variable is %f, while "
                + "the value of the "
                + "integer variable is %d, "
                + " and the string is %s",
                floatValue, integerValue, reverse);
        System.out.println(fs);
    }
}
