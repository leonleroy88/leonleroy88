/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Barre;
import fr.insa.leroy.projet.test.Noeud;
import fr.insa.leroy.projet.test.Treillis;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * sert a rien pour le moment 
 *
 * @author Elève
 */
public class Dessin extends Pane{
    private MainPanel main;
    private Dessin dessinP;
    private Canvas test;
    
    public Dessin(MainPanel main) {
        super();
        Rectangle clip = new Rectangle();
        clip.heightProperty().bind(this.heightProperty());
        clip.widthProperty().bind(this.widthProperty());
        this.setClip(clip);
        this.main = main;
        FxUtils.setSimpleBorder(this, Color.BLUEVIOLET, 1);
//        this.test.setOnMouseClicked((t) -> {
//            Controleur control = this.main.getControleur();
//            control.clikdanslazone(t);
//        });
        this.redrawAll();
    }
    
    public void redrawAll() {
        this.getChildren().clear();
       
        
        Treillis model = this.main.getModel();
        for(int i = 0 ; i < model.getNoeuds().size() ; i ++) {
            Noeud cur = model.getNoeuds().get(i);
            Group rep = cur.dessine();
           // Ellipse rep = new Ellipse(cur.getPx(), cur.getPy(), 5, 5);
            
            this.getChildren().add(rep);
        }  
        for (int j =0; j < model.getBarres().size() ; j++){
            Barre bebe = model.getBarres().get(j);
            Group lol = bebe.dessine();
            this.getChildren().add(lol);
   
        }
       
       
    
    
}
}
    

