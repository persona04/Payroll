package com.example.bordro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class TabloSayfa implements Sabitler{
    @FXML
    private Label tablo;
    @FXML
    private Button buton;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Stage stage;

    @FXML
    protected void yazdir(){
        Bordro bordro = new Bordro();
        bordro.dosyaOku();
        String tabloStringi="";
        for(Personel e: bordro.personeller){
            tabloStringi = tabloStringi+"İsim Soyisim: "+e.getIsimSoyisim()+"  TC Kimlik No: "+e.getTcKimlikNumarasi()+"  Medeni Durumu: "+"  Sigorta Sicil No: "+e.getSigortaSicilNo()+"  Brüt Asgari Ücret: "+brutAgariUcret+"  İşsizlik Sigorta Fonu: "+brutAgariUcret*issizlikSigortaFonu/100+"  Gelir Vergisi: "+brutAgariUcret*gelirVergisi/100+"  SGK Primi: "+brutAgariUcret*sgkPrimi/100+"  Damga Vergisi :"+brutAgariUcret*damgaVergisi/100+"\n";
        }
        tablo.setText(tabloStringi);
    }
    @FXML
    protected void geri(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("yetkiliSayfa.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
