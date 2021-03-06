/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

/**
 *
 * @author Elève
 */
public class  NoeudAppuiSimple extends NoeudAppui {
    private double normale;
    
    
    public NoeudAppuiSimple(int id, double PX, double PY, Vecteur2D V, double normale)
    {
        super(id,PX, PY, V);
        this.px=PX;
        this.py=PY;
        this.normale = normale;
        
    }
  
    
@Override
    public String toString(){
       return "Noeud Appui simple : [id : "+this.getId() +"Ppx:"+this.px+" py:"+this.py+" force:"+this.getForce().toString() ;
    
    }     

    @Override
    public Group dessine() {
        Ellipse rep = new Ellipse(this.getPx(), this.getPy(), 5, 8);
        rep.setStroke(Color.RED);
         Group l = new Group(rep);
         return l;
       }

    /**
     * @return the normale
     */
    public double getNormale() {
        return normale;
    }

    /**
     * @param normale the normale to set
     */
    public void setNormale(double normale) {
        this.normale = normale;
    }
public void save(Writer w) throws IOException {
        w.append("NoeudSimple;" + getId() + ";" + "(" + this.px + "," + this.py + ")\n");
    }

    
}
