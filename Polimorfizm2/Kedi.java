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
public class Kedi extends Hayvan{//üst sınıfta parametreli constructer olduğu için alt sınıftada  parametreli constructor olmak zorunda yoksa hata verir

    public Kedi(String isim) {
        super(isim);
    }
    @Override
    public String konus(){
        return this.getIsim()+ "miyavlar"; 
    }
}
