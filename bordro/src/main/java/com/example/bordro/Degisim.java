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

public class Degisim {
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private TextField isimSoyisim;
    @FXML
    private TextField tcKimlikNo;
    @FXML
    private TextField medeniDurum;
    @FXML
    private TextField sigortaSicilNo;
    @FXML
    private TextField tcGir;
    @FXML
    private Button ekle;
    @FXML
    private Button sil;
    @FXML
    private Label mesaj1;
    @FXML
    private Label mesaj2;
    @FXML
    private  Button cikis;

    @FXML
    protected void personelEkle(){
        Bordro bordro = new Bordro();
        bordro.dosyaOku();
        bordro.personelEkle(isimSoyisim.getText(),tcKimlikNo.getText(),sigortaSicilNo.getText(),medeniDurum.getText());
        bordro.dosyaYaz();
        mesaj1.setText("Personel eklendi.");
    }
    @FXML
    protected void personelSil(){
        Bordro bordro = new Bordro();
        bordro.dosyaOku();
        bordro.personelSil(tcGir.getText());
        bordro.dosyaYaz();
    }
    @FXML
    protected void geri(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("yetkiliSayfa.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Menü");
        stage.show();
    }
}
