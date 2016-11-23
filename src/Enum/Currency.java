/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Hita Do
 */
public enum Currency {

    IDR("Indonesia Rupiah"),
    USD("United Stated Dollar"),
    SGD("Singapore Dollar"),
    JPY("Japan Yen"),
    INR("India Rupee"),
    HKD("Hongkong Dollar");

    private String currency;

    Currency(String code) {
        currency = code;
    }

    public String getCurrency() {
        return currency;
    }
    
   public Currency getValue(String name){ 
       for(Currency currency : Currency.values()){
           //return name;
           if(currency.getCurrency().equals(name)){
               return currency;
           }
       } 
       return null;
       
   }

}
