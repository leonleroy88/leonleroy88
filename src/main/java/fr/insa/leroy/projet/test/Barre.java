/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.io.IOException;
import java.io.Writer;
import static java.lang.Math.atan;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.paint.Color;
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

    public Barre (int id, Noeud debut, Noeud fin, double compression, double traction, double cout){
        this.identificateur = id;
        this.noeudDebut = debut;
        this.noeudArrivee = fin;
        this.noeudDebut.getBarreDebut().add(this);
        this.noeudArrivee.getBarreArrivee().add(this);
        this.compression = compression;
        this.traction = traction;
        this.cout = cout;
        
    } 
    
    public Barre ( Noeud debut, Noeud fin){
        this(-1, debut, fin, 0, 0, 0);
        
    } 
////    Méthode qui renvoie le noeud opposé au noeud entré
   public Noeud noeudOppose (Noeud n) {
       Noeud oppose;
       if (n!=this.noeudArrivee && n!=this.getNoeudDebut()){
           throw new Error ("Le noeud entré ne correspond pas à la barre entrée");
       }
       if (n==this.noeudArrivee){
           oppose=this.noeudDebut;
       }
       else oppose=this.noeudArrivee;
       return oppose;
   }
    
////    Méthode qui calcule l'angle
    public double Angle (Noeud n) {
        double y1, y2, x1, x2;
        Noeud nopp=this.noeudOppose(n);
//        Si le noeud entré est le noeud de départ, n récupère les coordonées du neoud d'arrivée. Et inversement.
        x1 = n.getPx();
        y1 = n.getPy();
        x2 = nopp.getPx();
        y2 = nopp.getPy();
        double angle = atan((y2-y1)/(x2-x1));
        return angle;
    }    
    
    public Group dessine(List<Barre> problemes){
        Line res = new Line(this.getNoeudDebut().getPx(), this.getNoeudDebut().getPy(), this.getNoeudArrivee().getPx(), this.getNoeudArrivee().getPy());
        if (problemes.contains(this)) {
            res.setStroke(Color.RED);
        } else  {
            res.setStroke(Color.BLACK);
        }
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
       return "Barre"+ this.identificateur+" : [id : "+this.identificateur +" debut:"+this.noeudDebut+" fin:"+this.noeudArrivee;
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

    public double getCout(double cout){
        return cout;
    }
    
    public void setCOut(double cout){
        this.cout = cout;
    }
    void save(Writer w) throws IOException {
        w.append("Barre;" + getIdentificateur()+ ";" + getNoeudDebut().getId() + ";" + getNoeudArrivee().getId() + "\n");
    }

}
    
