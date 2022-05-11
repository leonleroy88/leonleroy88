/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;


import fr.insa.leroy.projet.test.Treillis;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Elève
 */
public class MainPanel extends BorderPane {
    
    private Treillis model;
    private Controleur control;
    
    private InterfaceH outilsTop;
    private InterfaceL outilsLeft;
    Dessin dessin;
    
    
    
    public MainPanel(Treillis model) {
        this.model = model;
        this.control = new Controleur(this);
        
        this.outilsTop = new InterfaceH();
        this.outilsLeft = new InterfaceL(this);
        this.dessin = new Dessin(this);
        
        this.setTop(this.outilsTop);
        this.setLeft(this.outilsLeft);
        this.setCenter(this.dessin);
       
       
       
       
    }
    public void redrawAll(){
        this.dessin.redrawAll();
    }
    /**
     * @return the model
     */
    public Treillis getModel() {
        return model;
    }
     public Controleur getControleur() {
        return control;
    }
    public InterfaceL getoutilsLeft(){
    return outilsLeft;
} 
}
