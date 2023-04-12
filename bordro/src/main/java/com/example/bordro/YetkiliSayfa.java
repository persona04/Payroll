package com.example.bordro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class YetkiliSayfa {
    @FXML
    private Button arama;
    @FXML
    private Button duzenleme;
    @FXML
    private Button listeleme;
    @FXML
    private Button cikis;
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;

    @FXML
    protected void aramaSayfasi(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("arama.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Arama");
        stage.show();
    }
    @FXML
    protected void cikis(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("giris.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Giriş");
        stage.show();
    }
    @FXML
    protected void degisim(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("degisim.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Değişim");
        stage.show();
    }
    @FXML
    protected void listele(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tabloSayfa.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Tablo");
        stage.show();
    }
}
