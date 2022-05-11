/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test;

import java.util.ArrayList;

/**
 *
 * @author Elève
 */
public class Test {
    public static void main(String [] args){
   /* double PX = 0 ,PY = 0;  
    int ID = 0;
    Vecteur2D v1;
    Noeud n1;
    Vecteur2D fce = new Vecteur2D(0,0);*/
    
   
    Treillis t = new Treillis();
  //  t = Treillis.treilliTest();
    ArrayList<Barre> barrreQuiCasse = new ArrayList();
    barrreQuiCasse = t.barreCasse(t);
        System.out.println(barrreQuiCasse.get(0));
        
   
}
}
