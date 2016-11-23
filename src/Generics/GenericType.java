/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Hita Do
 */
public class GenericType {

    public static class Util {

        public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
            return p1.getKey().equals(p2.getKey())
                    && p1.getValue().equals(p2.getValue());
        }
    }

    public class Pair<K, V> {

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public void methodReferenced() {
        GenericType.Pair<Integer, String> p1 = new Pair<>(1, "apple");
        GenericType.Pair<Integer, String> p2 = new Pair<>(2, "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());
        System.out.println(same);
    }

    public void typeInference() {
        Pair<Integer, String> p1 = new Pair<>(2, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "apple");
        boolean same = Util.compare(p1, p2);//pemanggilan melalui method langsung tanpa inference
        System.out.println(p1.getValue());
        System.out.println(p2.getValue());
        System.out.println(same);
    }
    
    public <U extends Number,V> void inspect(U u,V v){
        System.out.println("name: " +u.toString() );
        System.out.println("value: " +v.toString());
    }
}
