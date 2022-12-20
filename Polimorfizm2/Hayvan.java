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
public class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }
    public  String konus(){
        return "Hayvan konuşuyor.";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
}
