/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author Elève
 */
public abstract class NoeudAppui extends Noeud {

    public NoeudAppui(int id,double PX, double PY, Vecteur2D V) {
        super(id, PX, PY, V);
        this.px=PX;
        this.py=PY;
    }
@Override
    public String toString(){
       return "Noeud Appui : [id : "+this.getId() +" px:"+this.px+" py:"+this.py+" force:"+this.getForce().toString() ;
    
    }     
     public Group dessine() {
        Ellipse rep = new Ellipse(this.getPx(), this.getPy(), 5, 8);
        rep.setStroke(Color.RED);
         Group l = new Group(rep);
         return l;
       }


}
