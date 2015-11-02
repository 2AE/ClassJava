/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import static com.mycompany.parcautomobile.Vehicule.unVehicule;
import com.vaadin.data.util.BeanItemContainer;

/**
 *
 * @author Abdel
 */
public class Visiteur {

    /**
     * @return the Visiteur
     */
    public static BeanItemContainer<Visiteur> getVisiteur() {
        return Visiteur;
    }

    /**
     * @param aVisiteur the Visiteur to set
     */
    public static void setVisiteur(BeanItemContainer<Visiteur> aVisiteur) {
        Visiteur = aVisiteur;
    }
    static Object unVisiteur;
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int codePostal;
    private static BeanItemContainer<Visiteur> Visiteur = new BeanItemContainer<>(Visiteur.class);
    private static BeanItemContainer<unVehicule> unVehicule = new BeanItemContainer<>(unVehicule.class);
    public Visiteur() {
    }
    
     public Visiteur(int id, String nom, String prenom, String adresse,int codePostal) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        Visiteur.addBean(this);
        unVehicule.addBean(this);
    }
     
     public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    
    public String getAdresse() {
        return adresse;
    }
    
     public int getcodePostal() {
        return codePostal;
    }
    
      public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
      
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
     public void setcodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
