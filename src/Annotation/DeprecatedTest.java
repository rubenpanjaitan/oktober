/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Annotation;

/**
 *
 * @author Hita Do
 */
public class DeprecatedTest {
    
    public static void main(String []args){
        @java.lang.Deprecated
        Deprecated dep = new Deprecated();
        dep.serve();
    }
    
    static class Deprecated{
    /*
    *@deprecated this method will be remove later
    */
        @java.lang.Deprecated
        public void serve(){
            System.exit(2);
        }
    }
    
}
