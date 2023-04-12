package com.example.bordro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerGiris {
    @FXML
    private Label hataMesajı;
    @FXML
    private TextField kullaniciAdi;
    @FXML
    private TextField parola;
    @FXML
    private Button buton;

    Yetkili yetkili = new Yetkili("gurkan","gurkan123");
    Yetkisiz yetkisiz = new Yetkisiz("ahmet","bilgi");
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    protected void login(ActionEvent event) throws IOException {
        if(kullaniciAdi.getText().equals(yetkisiz.kullaniciAdi) && parola.getText().equals(yetkisiz.parola)){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("yetkisizSayfa.fxml"));
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Arama");
            stage.show();
        }
        else if(kullaniciAdi.getText().equals(yetkili.kullaniciAdi) && parola.getText().equals(yetkili.parola)){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("yetkiliSayfa.fxml"));
            root = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Menü");
            stage.show();
        }
        else{
            hataMesajı.setText("Hatalı kullanıcı adı, parola konmbinasyonu girdiniz.");
        }
    }
}