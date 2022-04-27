/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Noeud;
import fr.insa.leroy.projet.test.Treilli;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

/**
 * sert a rien pour le moment 
 *
 * @author Elève
 */
public class Dessin extends Pane{
    private MainPanel main;
    
    public Dessin(MainPanel main) {
        super();
        Rectangle clip = new Rectangle();
        clip.heightProperty().bind(this.heightProperty());
        clip.widthProperty().bind(this.widthProperty());
        this.setClip(clip);
        this.main = main;
        FxUtils.setSimpleBorder(this, Color.CYAN, 2);
        this.redrawAll();
    }
    
    public  void redrawAll() {
        this.getChildren().clear();
        Treilli model = this.main.getModel();
        for(int i = 0 ; i < model.getNoeuds().size() ; i ++) {
            Noeud cur = model.getNoeuds().get(i);
            // Group rep = cur.dessine();
            Ellipse rep = new Ellipse(cur.getPx(), cur.getPy(), 10, 10);
            this.getChildren().add(rep);
        }
       
    }
    
}
    

