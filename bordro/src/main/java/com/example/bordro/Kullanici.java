package com.example.bordro;

public abstract class Kullanici {

        boolean yetkili = false;
        String kullaniciAdi = "";
        String parola = "";

        Kullanici(){}

        Kullanici(String kullaniciAdi, String parola,boolean yetkili){
            this.kullaniciAdi = kullaniciAdi;
            this.parola = parola;
            this.yetkili= yetkili;
        }

        abstract boolean kullaniciAdiDogrula(String kullaniciAdi);
        abstract boolean parolaDogrula(String parola);
        abstract boolean yetkiliHesabi();
}
