/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder.gui.mainapp;

import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author JuanJose
 */
public class MainStageController implements Initializable {
    
    @FXML private JFXDrawer sidePane;
    
    @FXML private ImageView menuButton;
    
    
    @FXML
    void toggleDrawer(MouseEvent event) {
        //Relative path through components
        Parent root = sidePane.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
        AnchorPane ap = (AnchorPane) sp.getChildren().get(1);
        
        if (!sidePane.isShown()) {
            ap.setMouseTransparent(false);
            sidePane.open();
        }
        else {
            ap.setMouseTransparent(true);
            sidePane.close();
        }
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            Node sidePaneContent = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/SidePane.fxml"));
            //sidePane.setContent(sidePaneContent);
            sidePane.setSidePane(sidePaneContent);
        } catch (IOException ex) {
            Logger.getLogger(MainStageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
