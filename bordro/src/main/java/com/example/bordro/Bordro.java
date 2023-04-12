package com.example.bordro;

import java.io.*;
import java.util.ArrayList;

public class Bordro {
    Bordro(){}
    ArrayList<Personel> personeller = new ArrayList<Personel>();

    void dosyaOku(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("bordro.txt"));
            String line;
            while((line= reader.readLine())!=null){
                String[] data = line.split(",");
                personeller.add(new Personel(data[0],data[1],data[2],data[3]));
            }
        }
        catch(IOException e){
            System.out.printf("Dosya açılamadı.");
        }
    }
    void dosyaYaz(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("bordro.txt"));
            for(Personel e : personeller){
                writer.write(e.getIsimSoyisim()+","+e.getTcKimlikNumarasi()+","+e.getSigortaSicilNo()+","+e.getMedeniDurum()+"\n");
            }
            writer.close();
        }
        catch(IOException e){
            System.out.printf("Dosya açılamadı.");
        }
    }
    boolean personelSil(String tc){
        for(Personel e: personeller){
            if(e.getTcKimlikNumarasi().equals(tc)){
                personeller.remove(e);
                return true;
            }
        }
        return false;
    }
    void personelEkle(String isim, String tc, String sigorta, String medeniDurum){
        personeller.add(new Personel(isim,tc,sigorta,medeniDurum));
    }
    Personel personelBul(String tc){
        for(Personel e : personeller){
            if(e.getTcKimlikNumarasi().equals(tc)){
                return e;
            }
        }
    return null;
    }

    void personelDegistir(Personel personel, String isim, String tc, String sigorta, String medeni){
        personel.setIsimSoyisim(isim);
        personel.setTcKimlikNumarasi(tc);
        personel.setSigortaSicilNo(sigorta);
        personel.setMedeniDurum(medeni);
    }
}