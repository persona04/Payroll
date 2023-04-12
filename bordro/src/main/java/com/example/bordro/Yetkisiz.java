package com.example.bordro;


public class Yetkisiz extends Kullanici {
    Yetkisiz(){}
    Yetkisiz(String kullaniciAdi, String parola){
        super(kullaniciAdi,parola,false);
    }

    @Override
    boolean kullaniciAdiDogrula(String kullaniciAdi) {
        if(this.kullaniciAdi.equals(kullaniciAdi)){
            return true;
        }
        return false;
    }

    @Override
    boolean parolaDogrula(String parola) {
        if(this.parola.equals(parola)){
            return true;
        }
        return false;
    }

    @Override
    boolean yetkiliHesabi() {
        return this.yetkili;
    }
}
