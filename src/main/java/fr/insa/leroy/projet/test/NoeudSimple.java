/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import javafx.scene.Group;

/**
 *
 * @author Elève
 */
public class NoeudSimple extends Noeud { 
    
    public NoeudSimple(double PX, double PY, Vecteur2D V) {
        super(PX, PY, V);
        this.px=PX;
        this.py=PY;
    }
    
        
    
    @Override
    public String toString(){
       return "Noeud Simple : [id : "+this.id +" px:"+this.px+" py:"+this.py+" force:"+this.force.toString() ;
    
    }     


    
}
