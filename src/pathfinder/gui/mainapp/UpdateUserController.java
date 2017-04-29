/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder.gui.mainapp;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXSnackbar.SnackbarEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author JuanJose
 */
public class UpdateUserController implements Initializable {
    
    @FXML private JFXButton updateBut;
    @FXML private AnchorPane mainPane;
    private JFXSnackbar snackbar;

    @FXML
    void update(ActionEvent event) {
        snackbar.enqueue(new SnackbarEvent("Update succeeded"));
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        snackbar = new JFXSnackbar(mainPane);
    }    
    
}
