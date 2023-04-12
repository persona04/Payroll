package com.example.bordro;

public class Personel {
    private String isimSoyisim;
    private String tcKimlikNumarasi;
    private String sigortaSicilNo;
    private String medeniDurum;
    Personel(){}
    Personel(String isimSoyisim, String tcKimlikNumarasi, String sigortaSicilNo, String medeniDurum){
        this.isimSoyisim = isimSoyisim;
        this.medeniDurum = medeniDurum;
        this.tcKimlikNumarasi = tcKimlikNumarasi;
        this.sigortaSicilNo = sigortaSicilNo;
    }
    void setIsimSoyisim(String isimSoyisim){
        this.isimSoyisim = isimSoyisim;
    }
    void setTcKimlikNumarasi(String tcKimlikNumarası){
        this.tcKimlikNumarasi = tcKimlikNumarası;
    }
    void setSigortaSicilNo(String sigortaSicilNo){
        this.sigortaSicilNo = sigortaSicilNo;
    }
    void setMedeniDurum(String medeniDurum){
        this.medeniDurum = medeniDurum;
    }
    String getTcKimlikNumarasi(){
        return this.tcKimlikNumarasi;
    }
    String getIsimSoyisim(){
        return this.isimSoyisim;
    }
    String getSigortaSicilNo(){
        return this.sigortaSicilNo;
    }
    String getMedeniDurum(){
        return this.medeniDurum;
    }
}