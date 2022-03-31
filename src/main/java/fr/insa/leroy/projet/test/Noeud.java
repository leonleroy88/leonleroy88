/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

/**
 *
 * @author Elève
 */
public abstract class Noeud {
    int  id=-1;
    double px;
    double py;
    Vecteur2D force;
    
    public Noeud(int ID, double PX, double PY, Vecteur2D V){
        this.id=ID;
        this.px=PX;
        this.py=PY;
        this.force=V;      
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
   
    public static Noeud entreeNoeud (double PX, double PY, Vecteur2D fce){
       double fx,fy;
       int type;
       System.out.println("Quel type de Noeud ? 0 noeud simple / 1 pour appui simple / 2 pour appui double");
       type = Lire.i();
       if (type == 0){
          // new NoeudAppuiSimple
       }
       
       
       System.out.println("Entre les coordonnées en x et y du noeud");
       PX = Lire.d();
       PY = Lire.d();
       System.out.println("Entrre les coordonnées du vecteur force");
       fx = Lire.d();
       fy = Lire.d();
       fce = new Vecteur2D(fx , fy);
       
       Noeud n = new Noeud(PX , PY , fce) {};
       return(n);
       
    }
        
          
     
   
    
    @Override
     public String toString(){
       return "Ton point : [id : "+this.id +" px:"+this.px+" py:"+this.py+" force:"+this.force.toString() ;
    
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
    
    
   
}
