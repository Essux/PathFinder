/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author JuanJose
 */
public class LoginController implements Initializable {
    
    @FXML
    private JFXButton loginBut;
    
    @FXML
    private JFXDrawer drawer;
    
    @FXML
    private JFXHamburger hamburger;
    
    @FXML
    private void toggleDrawer(MouseEvent event) {    
        if (drawer.isHidden()) drawer.open();
        else drawer.close();
    }
    
    @FXML
    private void login(ActionEvent event) {
        System.out.println("Logging In...");
    }
    
    @FXML
    private void goToRegister(MouseEvent event) throws IOException {
        System.out.println("Going to Register Window...");
        Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("PathFinder");
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
