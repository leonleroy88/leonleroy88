/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import static java.lang.Math.atan;
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

    public Barre (int id, Noeud debut, Noeud fin, double compression, double traction){
        this.identificateur = id;
        this.noeudDebut = debut;
        this.noeudArrivee = fin;
        this.noeudDebut.getBarreDebut().add(this);
        this.noeudArrivee.getBarreArrivee().add(this);
        this.compression = compression;
        this.traction = traction;
        
    } 
    
    public Barre ( Noeud debut, Noeud fin){
        this(-1, debut, fin, 0, 0);
        
    } 
    
    /*public static Barre NoeudOppose(Barre b, Noeud n){
        Noeud noeudD, noeudF;
        b = new Barre(noeudD, noeudF);
    }*/
    
////    Méthode qui renvoie le noeud opposé au noeud rentré
   public static Noeud noeudOppose (Barre b, Noeud n) {
       Noeud nopp;
       if (n!=b.noeudArrivee && n!=b.getNoeudDebut()){
           throw new Error ("Le noeud entré ne correspond pas à la bare entrée");
       }
       if (n==b.noeudArrivee){
           nopp=b.noeudDebut;
       }
       else nopp=b.noeudArrivee;
       return nopp;
   }
    
////    Méthode qui calcule l'angle
    public static double Angle (Noeud n, Barre b) {
        double y1, y2, x1, x2;
        Noeud nopp=noeudOppose(b,n);
//        Si le noeud entré est le noeud de départ, n récupère les coordonées du neoud d'arrivée. Et inversement.
        x1 = n.getPx();
        y1 = n.getPy();
        x2 = nopp.getPx();
        y2 = nopp.getPy();
        
        
        double angle = atan((y2-y1)/(x2-x1));
        return angle;
    }    
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

    /**
     * @return the traction
     */
    public double getTraction() {
        return traction;
    }

    /**
     * @param traction the traction to set
     */
    public void setTraction(double traction) {
        this.traction = traction;
    }

    /**
     * @return the compression
     */
    public double getCompression() {
        return compression;
    }

    /**
     * @param compression the compression to set
     */
    public void setCompression(double compression) {
        this.compression = compression;
    }

}
    
