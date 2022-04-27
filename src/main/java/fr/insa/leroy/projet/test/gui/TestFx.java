/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import fr.insa.leroy.projet.test.Treilli;
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;  
         
public class TestFx extends Application { 
   @Override 
   
public void start(Stage primaryStage) throws Exception {
  
    
primaryStage.setTitle("Projet - Treillis");
Treilli model = Treilli.treilliTest();
Scene scene = new Scene(new MainPanel(model),700,600);
primaryStage.setScene(scene);
primaryStage.show();
    

   }
    public static void main(String[] args) {
        launch(args);
    }
        
    }
      //creating label email 
