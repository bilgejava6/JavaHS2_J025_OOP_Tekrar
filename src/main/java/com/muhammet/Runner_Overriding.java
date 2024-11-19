package com.muhammet;

public class Runner_Overriding {
    public static void main(String[] args) {

    }
}

class DosyaIslemleri{
    public void kaydet(String dosyaAdi){
        System.out.println("ilgili dosya baraşı ile kayıt edilmiştir.");
    }
}

class EcxelDosyaIslemleri extends DosyaIslemleri{
    private String[] dosyaListesi = {"musteri.xlsx", "odemeler.xlsx"};
    public void kaydet(String fileName){
        // önce kayıtlı mı kontrol et
        boolean varMi = false;
        for(String dosya : dosyaListesi){  // foreach
            if(dosya.equals(fileName)){
                System.out.println("Dosya güncellendi");
                varMi = true;
            }
        }
        if(!varMi)
            System.out.println("dosya eklendi.");
    }
}

class ResimDosyaIslemleri extends DosyaIslemleri{
    public void  kaydet(String dosyaAdi){

    }
}