/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder.gui.useraccess;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JuanJose
 */
public class UserAccessController implements Initializable {
        
    @FXML private JFXButton loginBut;
    
    @FXML private JFXButton registerBut;
    
    @FXML private Label registerLabel;
    
    @FXML private TabPane tabPane;

    @FXML
    void login(ActionEvent event) throws IOException {
        System.out.println("Logging in...");
        Parent root = FXMLLoader.load(getClass().getResource("/pathfinder/gui/mainapp/MainStage.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("PathFinder");
        stage.show();
        
        Stage curStage = (Stage) loginBut.getScene().getWindow();
        curStage.close();
    }

    @FXML
    void goToRegister(MouseEvent event) {
        Parent root = registerLabel.getScene().getRoot();
        TabPane tb = (TabPane) root.getChildrenUnmodifiable().get(1);
        tb.getSelectionModel().select(1);
    }
    
    @FXML
    void register(ActionEvent event) {
        System.out.println("Registering...");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
