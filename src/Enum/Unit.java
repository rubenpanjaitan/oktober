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
public enum Unit {

    PANJANG("Meter", "Centimeter"),
    MASSA("Kilogram", "Gram"),
    WAKTU("Detik", "Menit"),
    SUHU("Kelvin", "Fahranheit"),
    ARUS("Ampere", "Kiloampere");

    private String satuanInternasional;
    private String satuanNonInternasional;

    Unit(String si, String nsi) {
        this.satuanInternasional = si;
        this.satuanNonInternasional = nsi;
    }

    public String getSi() {

        return satuanInternasional;
    }

    public String getNsi() {

        return satuanNonInternasional;
    }
}
