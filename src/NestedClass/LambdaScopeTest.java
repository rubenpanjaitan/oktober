/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NestedClass;

import java.util.function.Consumer;

/**
 *
 * @author Hita Do
 */
public class LambdaScopeTest {
    
    public int x = 0;
    
    class FirstLevel{
        public int x = 1;
        
        void methodInFirstLevel(int x){
            
            Consumer<Integer> myConsumer =(y)->
            {
                System.out.println("x = "+ x);
                System.out.println("y = "+ y);
                System.out.println("this.x = "+ this.x);
                System.out.println("lambda x = "+ LambdaScopeTest.this.x);
            };
            myConsumer.accept(x);
        }
        
    }
    
    public static void main(String[] args){
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel f1 =st.new FirstLevel();
        f1.methodInFirstLevel(20);
    }
    
}
