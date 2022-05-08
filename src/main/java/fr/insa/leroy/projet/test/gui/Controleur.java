/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Barre;
import fr.insa.leroy.projet.test.Treillis;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Elève
 */
public class Controleur {

    private MainPanel vue;
    private InterfaceL essai;
    private List<Barre> selection;
    private int etat;
    private Stage stage;

    public Controleur(MainPanel vue) {
        this.vue = vue;

    }

    public void changetat(int nouvelEtat) {
        if (nouvelEtat == 30) {
            this.essai.getNoeudsimple().setSelected(true);
            this.selection.clear();
            // this.segmentEnCoursDeCreation = null;
            // this.vue.getbGrouper().setDisable(true);

        }

    }

    public void clikdanslazone(MouseEvent t) {
        if (this.etat == 20) {
            double px = t.getX();
            double py = t.getY();
            // creation points
            //Color col = Color.BLUE;
            Treillis model = this.vue.getModel();
            //  model.add(new Noeud(px,py) );

        }
    }

    public void boutonNoeudSimple(ActionEvent t) {
        this.changetat(20);
    }

    public void boutonNoeuddouble(ActionEvent t) {
        this.changetat(30);
    }

    public void boutonBarre(ActionEvent t) {
        this.changetat(40);
    }
//        public void zoomDouble() {
//        this.vue.setZoneModelVue(this.vue.getZoneModelVue().scale(0.5));
//        this.vue.redrawAll();
// 

}
