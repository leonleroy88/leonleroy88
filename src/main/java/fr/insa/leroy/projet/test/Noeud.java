/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.util.ArrayList;
import javafx.scene.Group;

/**
 *
 * @author Elève
 */
public abstract class Noeud {
    private int  id;
    double px;
    double py;
    private Vecteur2D force;
    private ArrayList<Barre> barreArrivee = new ArrayList();
    private ArrayList<Barre> barreDebut = new ArrayList();
    
    
    public Noeud(int ID, double PX, double PY, Vecteur2D V, ArrayList<Barre> barreArrivee, ArrayList<Barre> barreDebut){
        this.id=ID;
        this.px=PX;
        this.py=PY;
        this.force=V;     
        this.barreArrivee = barreArrivee;
        this.barreDebut = barreDebut;
    }
    public Noeud(double PX, double PY, Vecteur2D V){
        this.id=-1;
        this.px=PX;
        this.py=PY;
        this.force=V;      
    }
    public Noeud(double PX, double PY){
        Vecteur2D V = new Vecteur2D(0.0,0.0);
        this.id=-1;
        this.px=PX;
        this.py=PY;
        this.force=V;      
    }
   
 /*   public static Noeud entreeNoeud (int ID, double PX, double PY, Vecteur2D V){
       double fx,fy;
       int type;
       System.out.println("Quel type de Noeud ? 0 noeud simple / 1 pour appui simple / 2 pour appui double");
       type = Lire.i();
        System.out.println("Entre les coordonnées en x et y du noeud");
       PX = Lire.d();
       PY = Lire.d();
       System.out.println("Entrre les coordonnées du vecteur force");
       fx = Lire.d();
       fy = Lire.d();
       V = new Vecteur2D(fx , fy);
       
       if (type == 0){
       NoeudSimple R = new NoeudSimple(PX,PY,V);
       }
       if (type==1){
       NoeudAppuiSimple R = new NoeudAppuiSimple(PX,PY,V);
       }
       if (type==2){
       NoeudAppuiDouble R = new NoeudAppuiDouble(PX,PY,V);
       }
       Noeud n = new Noeud(PX , PY , V){};  
       return(n);
               
       }   */
    
    @Override
     public String toString(){
       return "Ton point : [id : "+this.getId() +" px:"+this.px+" py:"+this.py+" force:"+this.getForce().toString() ;
    } 
     
    public double getPx(){
        return (this.px);
    }
    public double getPy(){
        return (this.py);
    }
    
    public void setPx(double px) {
        this.px = px;
    }
    public void setPy(double py) {
        this.py = py;
    }
    
    public void demandePx(){
        System.out.println(" quelle est la coordonnée px");
       double pX=Lire.d();  
        this.px=pX  ;
    }
    public void demandePy(){
        System.out.println(" quelle est la coordonnée py");
        double pY=Lire.d();
        this.py=pY;
    }
   
    public abstract Group dessine();
    
    public static int nbrInconnues(Noeud n){
        if ( n instanceof NoeudAppuiSimple){
            return 1;
        }
        else if (n instanceof NoeudAppuiDouble){
            return 2;
        }
        else 
            return 0;
    }

    /**
     * @return the barreArrivee
     */
    public ArrayList<Barre> getBarreArrivee() {
        return barreArrivee;
    }

    /**
     * @return the barreDebut
     */
    public ArrayList<Barre> getBarreDebut() {
        return barreDebut;
    }
    public static ArrayList<Barre> barresIncidentes(Noeud n){
        ArrayList<Barre> barresIncidentes = new ArrayList();
        barresIncidentes.addAll(n.barreArrivee);
        barresIncidentes.addAll(n.barreDebut);
        return barresIncidentes;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the force
     */
    public Vecteur2D getForce() {
        return force;
    }

    /**
     * @param force the force to set
     */
    public void setForce(Vecteur2D force) {
        this.force = force;
    }
}
               
