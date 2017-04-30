/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder.gui.mainapp;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXMasonryPane;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author JuanJose
 */
public class FavoritePlacesController implements Initializable {
    
    @FXML private VBox vbox;
    @FXML private JFXListView listView;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        for (int i = 0; i< 4; i++){
            Label lbl = new Label("Text "+ i);
            listView.getItems().add(lbl);
        }
        listView.depthProperty().set(1);
    }    
}
