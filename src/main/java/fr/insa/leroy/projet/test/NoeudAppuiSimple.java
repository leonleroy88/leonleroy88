/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import javafx.scene.Group;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author Elève
 */
public class  NoeudAppuiSimple extends NoeudAppui {
    
    public NoeudAppuiSimple(double PX, double PY, Vecteur2D V) {
        super(PX, PY, V);
        this.px=PX;
        this.py=PY;
    }
@Override
    public String toString(){
       return "Noeud Appui simple : [id : "+this.id +"Ppx:"+this.px+" py:"+this.py+" force:"+this.force.toString() ;
    
    }     

    @Override
    public Group dessine() {
        Ellipse rep = new Ellipse(this.getPx(), this.getPy(), 5, 5);
         Group l = new Group(rep);
         return l;
       }


    
}
