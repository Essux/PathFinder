/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder.gui.mainapp;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author JuanJose
 */
public class SidePaneController implements Initializable {
    
    @FXML private JFXButton but1;
    @FXML private JFXButton but2;

    
    @FXML
    void toggleDrawer(ActionEvent event) {
        //Relative path through components
        Parent root = but1.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
        AnchorPane ap = (AnchorPane) sp.getChildren().get(1);
        JFXDrawer sidePane = (JFXDrawer) ap.getChildren().get(0);
        
        if (!sidePane.isShown()) {
            ap.setMouseTransparent(false);
            sidePane.open();
        }
        else {
            ap.setMouseTransparent(true);
            sidePane.close();
        }
    }
    
    @FXML
    void goToUpdateUser(ActionEvent event) throws IOException {
        //Relative path through components
        Parent root = but1.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
               
        toggleDrawer(new ActionEvent());
        
        sp.getChildren().remove(0);
        
        AnchorPane ap = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/UpdateUser.fxml"));
        sp.getChildren().add(0, ap);        
    }
    
    @FXML
    void goToUpdateRoute(ActionEvent event) throws IOException {
        //Relative path through components
        Parent root = but2.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
        
        toggleDrawer(new ActionEvent());
        
        sp.getChildren().remove(0);
        
        AnchorPane ap = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/UpdateRoute.fxml"));
        sp.getChildren().add(0, ap);
    }
    
    @FXML
    void goToUpdateTransport(ActionEvent event) throws IOException {
        //Relative path through components
        Parent root = but2.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
        
        toggleDrawer(new ActionEvent());
        
        sp.getChildren().remove(0);
        
        AnchorPane ap = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/UpdateTransport.fxml"));
        sp.getChildren().add(0, ap);
    }
    
    @FXML
    void goToFavoritePlaces(ActionEvent event) throws IOException {
        //Relative path through components
        Parent root = but2.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
        
        toggleDrawer(new ActionEvent());
        
        sp.getChildren().remove(0);
        
        AnchorPane ap = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/FavoritePlaces.fxml"));
        sp.getChildren().add(0, ap);
    }
    
    @FXML
    void goToMapView(ActionEvent event) throws IOException {
        //Relative path through components
        Parent root = but2.getScene().getRoot();
        StackPane sp = (StackPane) root.getChildrenUnmodifiable().get(1);
        
        toggleDrawer(new ActionEvent());
        
        sp.getChildren().remove(0);
        
        AnchorPane ap = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/MapMain.fxml"));
        sp.getChildren().add(0, ap);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
