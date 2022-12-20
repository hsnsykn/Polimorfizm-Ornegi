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
public class TestHayvan2 {
    public static void main(String[] args) {
        konustur(new Kedi("Boncuk"));
        konustur(new Kopek("Arap"));
        konustur(new At("Dülbül"));
    }
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
}
