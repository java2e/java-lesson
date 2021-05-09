package org.banka.model;

import java.util.Arrays;

public class Banka extends BaseModel {

    private String adi;

    private Musteri musteriler[];

    private Kredi krediler [];

    private Pair<Integer,Integer> krediListesi [];

    public Banka(int id,String adi){
        super(id);
        this.adi = adi;
    }


    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", musteriler=" + Arrays.toString(musteriler) +
                ", krediler=" + Arrays.toString(krediler) +
                '}';
    }
}
