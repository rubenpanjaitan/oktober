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
public class InnerClass {
    private static final  int SIZE=15;
    private int[] array=new int[SIZE];
    
    //constructor
    
    public InnerClass(){
        for(int i=0;i<SIZE;i++){
            array[i]=i;
        }
    }
    
    public void printEven(){
        DataStructureInterface iterator=this.new EvenIterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
            
    }
    
    interface DataStructureInterface extends java.util.Iterator<Integer>{}
    
    private class EvenIterator implements DataStructureInterface{
        
        private int nextIndex=0;
        @Override
        public boolean hasNext() {
            return (nextIndex<=SIZE-1);
        }

        @Override
        public Integer next() {
            Integer retValue = Integer.valueOf(array[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
        
    }
    
    public static void main(String []args){
        InnerClass inner = new InnerClass();
        inner.printEven();
        
    }
}
