/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

/**
 *
 * @author Elève
 */
// Nooeud appuisimple ou double pas de force
public class NoeudAppuiDouble extends NoeudAppui { 

    public NoeudAppuiDouble(double PX, double PY, Vecteur2D V) {
        super(PX, PY, V);
        this.px=PX;
        this.py=PY;
    }
@Override
    public String toString(){
       return "Noeud Appui Double : [id : "+this.id +" px:"+this.px+" py:"+this.py+" force:"+this.force.toString() ;
    
    }     
  
    
}
