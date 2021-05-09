package org.banka.model;

public class Musteri extends BaseModel {

    private String adiSoyadi;

    private String tcNo;

    private boolean delete; // true false

    public void setDelete(boolean delete)
    {
        this.delete = delete;
    }

    public Musteri(int id,String adiSoyadi,String tcNo){
        super(id);
        this.adiSoyadi = adiSoyadi;
        this.tcNo = tcNo;
    }

    public Musteri(){

    }

    @Override
    public String toString() {
        return "Musteri{" +
                "adiSoyadi='" + adiSoyadi + '\'' +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }
}
