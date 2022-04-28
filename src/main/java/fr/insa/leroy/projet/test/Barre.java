/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.awt.Color;
import javafx.scene.Group;
import javafx.scene.shape.Line;

/**
 *
 * @author Elève
 */
public class Barre {
    private int identificateur;
    private Noeud noeudDebut;
    private Noeud noeudArrivee;
    private double traction;
    private double compression;
    private double cout;

    public Barre (int id, Noeud debut, Noeud fin){
        this.identificateur = id;
        this.noeudDebut = debut;
        this.noeudArrivee = fin;
    } 
    
    public Barre ( Noeud debut, Noeud fin){
        this.identificateur = -1;
        this.noeudDebut = debut;
        this.noeudArrivee = fin;
    } 
    
    /*public static Barre NoeudOppose(Barre b, Noeud n){
        Noeud noeudD, noeudF;
        b = new Barre(noeudD, noeudF);
    }*/
        
    public Group dessine(){
        Line res = new Line(this.getNoeudDebut().getPx(), this.getNoeudDebut().getPy(), this.getNoeudArrivee().getPx(), this.getNoeudArrivee().getPy());
        Group g = new Group(res);
        return g;
    }
    /**
     * @return the identificateur
     */
    public int getIdentificateur() {
        return identificateur;
    }

    /**
     * @param identificateur the identificateur to set
     */
    public void setIdentificateur(int identificateur) {
        this.identificateur = identificateur;
    }

    /**
     * @return the noeudDebut
     */
    public Noeud getNoeudDebut() {
        return noeudDebut;
    }

    /**
     * @param noeudDebut the noeudDebut to set
     */
    public void setNoeudDebut(Noeud noeudDebut) {
        this.noeudDebut = noeudDebut;
    }

    /**
     * @return the noeudArrivee
     */
    public Noeud getNoeudArrivee() {
        return noeudArrivee;
    }

    /**
     * @param noeudArrivee the noeudArrivee to set
     */
    public void setNoeudArrivee(Noeud noeudArrivee) {
        this.noeudArrivee = noeudArrivee;
    }
  
   @Override
     public String toString(){
       return "Ta barre : [id : "+this.identificateur +" debut:"+this.noeudDebut+" fin:"+this.noeudArrivee;
    }

}
    
