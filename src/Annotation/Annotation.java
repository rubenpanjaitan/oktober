/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Native;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 *
 * @author Hita Do
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String author();
    String date();

}

@MyAnnotation(
        author = "John Doe",
        date = "3/17/2002"
)

public class Annotation {

    @MyAnnotation(author = "Ruben",date = "12/22/1993")
    public int jumlah;

    public static void show() throws NoSuchFieldException {
        Annotation ann = new Annotation();
        try {
            Class c = ann.getClass();
            Method m = c.getMethod("testMethod");
            Field field= c.getField("jumlah");
            //Parameter param= c.getParameterAnnotations();
            MyAnnotation annotation1 = (MyAnnotation) c.getAnnotation(MyAnnotation.class);//(MyAnnotation)c.getAnnotation(MyAnnotation.class);
            MyAnnotation annotation2 = m.getAnnotation(MyAnnotation.class);
            MyAnnotation annotation3 = field.getAnnotation(MyAnnotation.class);
            //MyAnnotation annotation4 = 
            System.out.println("class annotation=====");
            System.out.println(annotation1.author());
            System.out.println(annotation1.date());
            System.out.println("method annotation=====");
            System.out.println(annotation2.author());
            System.out.println(annotation2.date());
            System.out.println("field annotation=====");
            System.out.println(annotation3.author());
            System.out.println(annotation3.date());
            System.out.println("parameter annotation=====");
            System.out.println(annotation3.author());
            System.out.println(annotation3.date());

        } catch (NoSuchMethodException ex) {
            System.out.println("method tidak valid " + ex.getMessage());

        }
    }

    @MyAnnotation(author = "Ade",date = "22/12/2011")
    public static void testMethod(@MyAnnotation(author = "a", date="01/01/2001")String str) {
        System.out.println("Welcome to Java");
        System.out.println("This is an example of Annotations");
    }

    public static void main(String[] args) throws NoSuchFieldException {
        
         @SuppressWarnings("null")
             String str;
        str = null;
        
        System.out.println(str);
        testMethod("test");
        show();
    }

}
