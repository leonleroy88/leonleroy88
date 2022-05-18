/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;


import fr.insa.leroy.projet.test.Barre;
import fr.insa.leroy.projet.test.Treillis;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

/**
 *
 * @author Elève
 */
public class MainPanel extends BorderPane {
    
    private Treillis model;
    private Controleur control;
    
    private List<Barre> barreProbleme;
    
    private InterfaceH outilsTop;
    private InterfaceL outilsLeft;
    Dessin dessin;
    private Button calculTout;
    
    
    
    public MainPanel(Treillis model) {
        this.model = model;
        this.control = new Controleur(this);
        this.barreProbleme = new ArrayList<>();
        
        this.outilsTop = new InterfaceH();
        this.outilsLeft = new InterfaceL(this);
        this.dessin = new Dessin(this);
        
        this.setTop(this.outilsTop);
        this.setLeft(this.outilsLeft);
        this.setCenter(this.dessin);
       
       this.calculTout = new Button("calcul");
       this.calculTout.setOnAction((t) -> {
           //TODO
//           this.barreProbleme = this.model.creaMatrice();
this.barreProbleme.add(this.model.getBarres().get(0));
           System.out.println(this.barreProbleme);
           this.dessin.redrawAll();
       });
       this.setBottom(this.calculTout);
       
       
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

    /**
     * @return the barreProbleme
     */
    public List<Barre> getBarreProbleme() {
        return barreProbleme;
    }
}
