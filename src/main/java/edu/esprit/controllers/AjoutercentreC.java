package edu.esprit.controllers;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class AjoutercentreC implements Initializable {
    FileChooser fileChooser = new FileChooser();
    @FXML
    private Button btnafficher;
    @FXML
    private Button btnajouter;
    @FXML
    private Button btnupload;
    @FXML
    private TextField tAdresse;
    @FXML
    private TextField tContact;
    @FXML
    private TextField tDescription;
    @FXML
    private TextField tNom;
    @FXML
    private ImageView timage;
    private File selectedFile;

    public AjoutercentreC() {
    }

    @FXML
    void affichercentre_c(ActionEvent event) {
    }

    @FXML
    void ajoutercentre_c(ActionEvent event) {
    }

    @FXML
    void uploadimage(ActionEvent event) {
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.btnupload.setOnAction(this::handleSelectImageButtonAction);
    }

    private void handleSelectImageButtonAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Image File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Image Files", new String[]{"*.png", "*.jpg", "*.gif"});
        fileChooser.getExtensionFilters().add(extFilter);
        this.selectedFile = fileChooser.showOpenDialog(this.btnupload.getScene().getWindow());
        if (this.selectedFile != null) {
            Image img = new Image(this.selectedFile.toURI().toString());
            this.timage.setImage(img);
        }

    }

    private void submitForm() {
    }
}

