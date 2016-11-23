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
public class StringBuilderTest {
    
    public static void main(String []args){
        String word ="do i saw was i do";
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse());
        System.out.println(sb.insert(10, "yes i do"));
        System.out.println(sb.append("yes i do"));
        System.out.println(sb.deleteCharAt(10));
    }
    
}
