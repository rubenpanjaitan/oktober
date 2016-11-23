/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Generics;


import Generics.GenericType.Pair;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hita Do
 * @param <T>
 */
public class CobaGenerics<T> {
    
    private T t;
    public void setT(T t){
        this.t = t;
    }
    
    public T getT(){
        return t;
    }
    
    
    
    
    public static void main(String... args){
        List<String> list = new ArrayList<>();
        list.add("hello");
        String s =  list.get(0);        
        System.out.println(s);
        
        //parameterized type
        CobaGenerics<String> coba = new CobaGenerics<>();
        //raw type
        CobaGenerics test = new CobaGenerics();
        //generic type
        GenericType type = new GenericType();
        type.methodReferenced();
        type.typeInference();
        
        //bounded type parameters
        type.inspect(10, "laaaa");
        
    }
}
