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
public class StringTest {
    
    public static void main(String [] args){
        final String PATH = "/home/user/index.html";
        Filename myHome = new Filename(PATH,'/','.');
        System.out.println("Extension :"+myHome.extension());
        System.out.println("Filename :"+myHome.filename());
        System.out.println("Path :"+ myHome.path());
        Integer a = new Integer(8);
        int x=a.intValue();
    }
}
