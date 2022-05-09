/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Elève
 */
// Nooeud appuisimple ou double pas de force
public class NoeudAppuiDouble extends NoeudAppui { 

    public NoeudAppuiDouble(int id ,double PX, double PY, Vecteur2D V, ArrayList<Barre> barreArrivee, ArrayList<Barre> barreDebut) {
        super(id,PX, PY, V, barreArrivee, barreDebut);
        this.px=PX;
        this.py=PY;
    }
@Override
    public String toString(){
       return "Noeud Appui Double : [id : "+this.getId() +" px:"+this.px+" py:"+this.py+" force:"+this.getForce().toString() ;
    
    }     

    
    public Group dessine() {
         Rectangle rep = new Rectangle(this.getPx(), this.getPy(), 8, 8);
         Group l = new Group(rep);
         return l;
            
     }

   

      
    
}
