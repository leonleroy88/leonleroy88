/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.stage.Stage;  
         
public class TestFx extends Application { 
   @Override 
   
public void start(Stage primaryStage) throws Exception {
  
    
primaryStage.setTitle("Projet");
Scene scene = new Scene(new MainPanel());
primaryStage.setScene(scene);
primaryStage.show();
    

   }
    public static void main(String[] args) {
        launch(args);
    }
        
    }
      //creating label email 
