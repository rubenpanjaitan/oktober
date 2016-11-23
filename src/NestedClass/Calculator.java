/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NestedClass;

/**
 *
 * @author Hita Do
 */
public class Calculator {

    interface IntegerMath{
        int operation(int a, int b);
    }
    
    public int operateBinary(int a, int b, IntegerMath op){
        return op.operation(a, b);
    } 
    
    public static void main(String [] args){
        Calculator calc = new Calculator();
        IntegerMath add= (a , b)-> a + b;
        IntegerMath sub= (a, b )-> a - b;
        System.out.println("sub = "+ calc.operateBinary(40, 2, sub));
        System.out.println("add = "+calc.operateBinary(40, 2, add));
    }
    
}
