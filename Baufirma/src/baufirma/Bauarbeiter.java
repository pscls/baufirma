/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baufirma;

import java.util.Date;

/**
 *
 * @author pascalschulze
 */
public class Bauarbeiter extends Angestellter  {
    String bauarbeiterTyp;
    
    public void Bauarbeiter () {
        aktiv = false;
    }
    
    public void Bauarbeiter (String neuerName, Adresse neueAdresse) {
        aktiv = false;
        name = neuerName;
        adresse = neueAdresse;
    }    
    
    public void setBauarbeiterTyp (String neuerBauarbeiterTyp) {
        bauarbeiterTyp = neuerBauarbeiterTyp;
    }
    
    public String getBauarbeiterTyp () {
        return bauarbeiterTyp;
    }
    
    
}
