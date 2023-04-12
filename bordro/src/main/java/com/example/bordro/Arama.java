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
import java.util.EventListener;

public class Arama implements Sabitler{
    @FXML
    private Scene scene;
    @FXML
    private Stage stage;
    @FXML
    private Button arama;
    @FXML
    private Button geri;
    @FXML
    private TextField tcGiris;
    @FXML
    private Label isimSoyisim;
    @FXML
    private Label tcKimlikNo;
    @FXML
    private Label sigortaSicilNo;
    @FXML
    private Label medeniDurum;
    @FXML
    private Label hataMesaji;
    @FXML
    private Parent root;
    @FXML
    private Label asgari;
    @FXML
    private Label sgkprim;
    @FXML
    private Label issizlik;
    @FXML
    private Label gelirvergisi;
    @FXML
    private Label damgavergisi;

    @FXML
    protected void arama(){
        Bordro bordro = new Bordro();
        bordro.dosyaOku();
        if(bordro.personelBul(tcGiris.getText())==null){
            hataMesaji.setText("Hatalı giriş.");
        }
        else{
            Personel e = bordro.personelBul(tcGiris.getText());
            isimSoyisim.setText(e.getIsimSoyisim());
            tcKimlikNo.setText(e.getTcKimlikNumarasi());
            sigortaSicilNo.setText(e.getSigortaSicilNo());
            medeniDurum.setText(e.getMedeniDurum());
            asgari.setText(Integer.toString(brutAgariUcret));
            sgkprim.setText(Integer.toString(brutAgariUcret*sgkPrimi/100));
            issizlik.setText(Integer.toString(issizlikSigortaFonu*brutAgariUcret/100));
            gelirvergisi.setText(Integer.toString(gelirVergisi*brutAgariUcret/100));
            damgavergisi.setText(Integer.toString(damgaVergisi*brutAgariUcret/100));
        }
    }
    @FXML
    protected void geriGit(ActionEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("yetkiliSayfa.fxml"));
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Menü");
        stage.show();
    }
}
