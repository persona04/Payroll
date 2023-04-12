package com.example.bordro;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class YetkisizSayfa implements Sabitler {

    @FXML
    private Label isimSoyisim;
    @FXML
    private Label tcKimlikNumarasi;
    @FXML
    private Label sigortaSicliNo;
    @FXML
    private Label medeniDurum;
    @FXML
    private TextField arama;
    @FXML
    private Label hataMesaji;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private Button buton;
    @FXML
    private Button cikis;
    @FXML
    private Label gelir;
    @FXML
    private  Label sgkprimi;
    @FXML
    private Label brut;
    @FXML
    private Label damga;
    @FXML
    private Label issizlikfon;
    @FXML
    protected void ara(){
        Bordro bordro = new Bordro();
        bordro.dosyaOku();
        if(bordro.personelBul(arama.getText())==null){
            hataMesaji.setText("Hatalı giriş!");
        }
        else{
             Personel e = bordro.personelBul(arama.getText());
             isimSoyisim.setText(e.getIsimSoyisim());
             tcKimlikNumarasi.setText(e.getTcKimlikNumarasi());
             sigortaSicliNo.setText(e.getSigortaSicilNo());
             medeniDurum.setText(e.getMedeniDurum());
             sgkprimi.setText(Integer.toString(sgkPrimi*brutAgariUcret/100));
             issizlikfon.setText(Integer.toString(issizlikSigortaFonu*brutAgariUcret/100));
             gelir.setText(Integer.toString(gelirVergisi*brutAgariUcret/100));
             damga.setText(Integer.toString(damgaVergisi*brutAgariUcret/100));
             brut.setText(Integer.toString(brutAgariUcret));
        }
    }

    @FXML
    protected void logout(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("giris.fxml"));
        root = loader.load();
        stage = (Stage)((javafx.scene.Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Giriş");
        stage.show();
    }
}
