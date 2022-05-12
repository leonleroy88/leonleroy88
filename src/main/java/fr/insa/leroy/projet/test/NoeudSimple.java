/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author Elève
 */
public class NoeudSimple extends Noeud { 
    
    
    
    public NoeudSimple(int id,double PX, double PY, Vecteur2D V) {
        super(PX, PY, V);
        this.px=PX;
        this.py=PY;
    }
      
    @Override
    public String toString(){
       return "Noeud Simple : [id : "+this.getId() +" px:"+this.px+" py:"+this.py+" force:"+this.getForce().toString() ;
    
    }     

    @Override
    public Group dessine() {
        Ellipse rep = new Ellipse(this.getPx(), this.getPy(), 5, 5);
        Group l = new Group(rep);
        return l;
    }


    
}
