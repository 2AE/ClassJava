/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metier;

import com.vaadin.data.util.BeanItemContainer;

/**
 *
 * @author SESSION 2
 */
public class Visiteur {
    
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private int codePostal;
    private static BeanItemContainer<Visiteur> Visiteur = new BeanItemContainer<>(Visiteur.class);
    
    public Visiteur() {
    }
   
    public Visiteur(int id, String nom, String prenom, String adresse, int CodePostal) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.Visiteur.addBean(this);
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
    
   
    public int getcodePostal() {
        return codePostal;
    }
        
    public String getAdresse() {
        return adresse;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public void setcodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

}
