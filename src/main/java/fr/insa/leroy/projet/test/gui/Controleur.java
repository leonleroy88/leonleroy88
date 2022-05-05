/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Treillis;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Elève
 */
public class Controleur {

    private MainPanel vue;
    

    private int etat;

    public Controleur(MainPanel vue) {
        this.vue = vue;

    }

    public void changetat(int nouvelEtat) {
        if (nouvelEtat == 30) {
           
        }

    }

    public void clikdanslazone(MouseEvent t) {
        if (this.etat==20){
        double px = t.getX();
        double py = t.getY();
        //Color col = Color.BLUE;
        Treillis model = this.vue.getModel();
      //  model.add(new Noeud(px,py) );
        

    }
    }
     public void boutonNoeudSimple(ActionEvent t){
        this.changetat(20);   
    }
      public void boutonNoeuddouble(ActionEvent t){
        this.changetat(30);   
    }
       public void boutonBarre(ActionEvent t){
        this.changetat(40);   
    }
//        public void zoomDouble() {
//        this.vue.setZoneModelVue(this.vue.getZoneModelVue().scale(0.5));
//        this.vue.redrawAll();
//    }
     
}
