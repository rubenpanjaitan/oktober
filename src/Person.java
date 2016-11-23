
import java.time.LocalDate;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hita Do
 */
class Person {

    static Person createPerson() {
        return null;
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;
    
    public Person(){

    }
    

    public Person(String name, Sex gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age=age;
    }

    void printPerson() {
       System.out.println("Nama->"+getName()+" Jenis Kelamin->"+getGender()+" Usia->"+getAge());
    }
    
     public enum Sex {
        MALE, FEMALE
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

   

   
}
