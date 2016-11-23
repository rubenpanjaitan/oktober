/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generics;

import java.util.List;

/**
 *
 * @author Hita Do
 */
public class WildcarHelper {
    
    public void foo(List<?> list){
           fooHelper(list);
    }
    
    private <T> void fooHelper(List<T> list){
        list.set(0, list.get(0));
    }
    
}
