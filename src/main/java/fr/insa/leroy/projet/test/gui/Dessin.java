/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Barre;
import fr.insa.leroy.projet.test.Noeud;
import fr.insa.leroy.projet.test.Treilli;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
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
        FxUtils.setSimpleBorder(this, Color.BLUEVIOLET, 1);
        this.redrawAll();
    }
    
    public  void redrawAll() {
        this.getChildren().clear();
       
        
        Treilli model = this.main.getModel();
        for(int i = 0 ; i < model.getNoeuds().size() ; i ++) {
            Noeud cur = model.getNoeuds().get(i);
            // Group rep = cur.dessine();
            Ellipse rep = new Ellipse(cur.getPx(), cur.getPy(), 5, 5);
            this.getChildren().add(rep);
        }  
        for (int j =0; j < model.getBarres().size() ; j++){
            Barre bebe = model.getBarres().get(j);
            Line lol = new Line(bebe.getNoeudDebut().getPx(), bebe.getNoeudDebut().getPy(), bebe.getNoeudArrivee().getPx(), bebe.getNoeudArrivee().getPy());
            
            this.getChildren().add(lol);
            
        }
       
    
    
}
}
    

