/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baufirma;
import java.util.ArrayList;
import java.io.Serializable;

/**
 *
 * @author pascalschulze, till lehmann
 */
public class Auftrag extends Object implements Serializable {
    String titel;
    Adresse adresse;
    Projektleiter projektleiter;
    Architekt architekt;
    Statiker statiker;
    ArrayList<Bauarbeiter> bauarbeiterListe;
    ArrayList<Fahrzeug> fahrzeugListe;
    String auftraggeberName;
    Adresse auftraggeberAdresse;
    ArrayList<Material> materialListe;
    //Aufgabeliste: Bonusfeature
    ArrayList<String[]> aufgabenListe;
  
    public void Auftrag () { 
        bauarbeiterListe = new ArrayList<>();
        fahrzeugListe = new ArrayList<>();
        materialListe = new ArrayList<>();
    }
    
    public void Auftrag (String neuerTitel, Projektleiter neuerProjektleiter) {
        titel = neuerTitel;
        projektleiter = neuerProjektleiter;
        
        bauarbeiterListe = new ArrayList<>();
        fahrzeugListe = new ArrayList<>();
        materialListe = new ArrayList<>();
    }
    
    public void setTitel (String neuerTitel) {
        titel = neuerTitel;
    }
    
    public String getTitel () {
        return titel;
    }
    
    public void setAdresse (Adresse neuerAdresse) {
    
    }
    
    public Adresse getAdresse () {
        return adresse;
    }
    
    public void setProjektleiter (Projektleiter neuerProjektleiter) {
        projektleiter = neuerProjektleiter;
    }
    
    public Projektleiter getProjektleiter () {
        return projektleiter;
    }
    
    public void setArchitekt (Architekt neuerArchitekt) {
        architekt = neuerArchitekt;
    }
    
    public Architekt getArchitekt () {
        return architekt;
    }
    
    public void setStatiker (Statiker neuerStatiker) {
        statiker = neuerStatiker;
    }
    
    public Statiker getStatiker () {
        return statiker;
    }
    
    public void setBauarbeiterListe (ArrayList<Bauarbeiter> neueBauarbeiterListe) {
       bauarbeiterListe = neueBauarbeiterListe;
    }
    
    public ArrayList<Bauarbeiter> getBauarbeiterListe () {
        return bauarbeiterListe;
    }
    
    public void setFahrzeugListe (ArrayList<Fahrzeug> neueFahrzeugListe) {
        fahrzeugListe = neueFahrzeugListe;
    }
    
    public ArrayList<Fahrzeug> getFahrzeugListe () {
        return fahrzeugListe;
    }
    
    public void setAuftraggeberName (String neuerAuftraggeberName) {
        auftraggeberName = neuerAuftraggeberName;
    }
    
    public String getAuftraggeberName () {
        return auftraggeberName;
    }
    
    public void setAuftraggeberAdresse (Adresse neueAuftraggeberAdresse) {
        auftraggeberAdresse = neueAuftraggeberAdresse;
    }
    
    public Adresse getAuftraggeberAdresse () {
        return auftraggeberAdresse;
    }
    
    public void setMaterialListe (ArrayList<Material> neueMaterialListe) {
        materialListe = neueMaterialListe;
    }
    
    public ArrayList<Material> getMaterialListe () {
        return materialListe;
    }
    
    public void addBauarbeiterToListe (Bauarbeiter neuerBauarbeiter) {
        bauarbeiterListe.add(neuerBauarbeiter);
    }
    
     public void addFahrzeugToListe (Fahrzeug neuesFahrzeug) {
        fahrzeugListe.add(neuesFahrzeug);
    }
     
      public void addMaterialToListe (Material neuesMaterial) {
        materialListe.add(neuesMaterial);
    }
      
    public void setAufgabenListe (ArrayList<String[]> neueAufgabenListe){
        aufgabenListe = neueAufgabenListe;
    }
    
    public ArrayList<String[]> getAufgabenListe () {
        return aufgabenListe;
    }
    
    public void addToAufgabenListe (String[] neueAufgabe) {
        aufgabenListe.add(neueAufgabe);
    }
}
