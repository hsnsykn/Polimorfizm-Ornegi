/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Haftaz10;

/**
 *
 * @author soyka
 */
public class TestHayvan {
    public static void main(String[] args) {
        Hayvan kedi = new Kedi ("Boncuk");
        Hayvan kopek= new Kopek("Arap");
        Hayvan at = new At ("Dülbül");
        
        System.out.println(kedi.konus());
        System.out.println(kopek.konus());
        System.out.println(at.konus());
    }
}
