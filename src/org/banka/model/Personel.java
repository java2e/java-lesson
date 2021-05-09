package org.banka.model;

public class Personel extends BaseModel {

    private String adSoyad;

    public Personel(int id,String adSoyad)
    {
        super(id);
        this.adSoyad = adSoyad;
    }

}
