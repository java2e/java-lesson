package org.banka.model;

public class Kredi extends BaseModel{

    private String krediNo;

    private int taksitSayisi;

    private int krediMiktari;

    private boolean delete; // true ise silindi false ise halen duruyor

    public void setDelete(boolean delete)
    {
        this.delete = delete;
    }

    // private Musteri musteri;


    public Kredi(int id,String krediNo,int taksitSayisi,int krediMiktari)
    {
        super(id);
        this.krediNo = krediNo;
        this.krediMiktari= krediMiktari;
        this.taksitSayisi=taksitSayisi;
    }

    public Kredi(){

    }

    /*
    get set....
     */

    @Override
    public String toString() {
        return "Kredi{" +
                "krediNo='" + krediNo + '\'' +
                ", taksitSayisi=" + taksitSayisi +
                ", krediMiktari=" + krediMiktari +
                '}';
    }
}
