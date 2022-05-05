/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leroy.projet.test.gui;

/**
 *
 * @author Elève
 */
import java.io.InputStream;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author francois
 */
public class BoutonIcone extends Button {

    public BoutonIcone(String relPathOfImageFile, double sizeX, double sizeY) {
        // chargement des icones : la systaxe 
        // this.getClass().getResourceAsStream(path) permet de retrouver 
        // un fichier en indiquant son chemin relatif par rapport au répertoire
        // contenant la classe de this.
        // Cela à condition que les fichiers correspondants aient bien été
        // copiés !! Pour cela, voir le tag <ressources> dans le fichier .pom
        InputStream is = this.getClass().getResourceAsStream(relPathOfImageFile);
        if (is == null) {
            this.setText("?? " + relPathOfImageFile);
        } else {
            Image img = new Image(is, sizeX, sizeY, false, true);
            this.setGraphic(new ImageView(img));

        }

    }
}