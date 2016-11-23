/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Enumeration;

/**
 *
 * @author Hita Do
 */
public  class EnumerationReligi {

    public static String[] religi = {"BUDHA", "HINDU", "ISLAM", "KATOLIK", "PROTESTAN"};

    public static Enumeration elements() {
        return new EnumeratorReligi();
    }

    private static class EnumeratorReligi implements Enumeration {

        private int id = 0;

        public EnumeratorReligi() {
        }

        @Override
        public boolean hasMoreElements() {
            return (id < EnumerationReligi.religi.length);
        }

        @Override
        public Object nextElement() {
            
            return EnumerationReligi.religi[id++];
        }
    }

}
