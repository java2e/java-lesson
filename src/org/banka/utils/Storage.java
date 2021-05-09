package org.banka.utils;

import org.banka.model.Kredi;
import org.banka.model.Musteri;
import org.banka.model.Personel;

public class Storage {
    /*
    Array Dizi
    Collecion Framework
     */

    public static Musteri MUSTERILER[];

    public static Kredi KREDILER [];

    public static Personel PERSONELLER [];

    public static int LAST_ID=0;

    public static void addMusteri(Musteri musteri){

        if(MUSTERILER == null)
        {
            MUSTERILER = new Musteri[1];
            MUSTERILER[0]=musteri;
        }
        else{

            Musteri gecici []  = new Musteri[MUSTERILER.length];
            for(int i=0;i<gecici.length;i++)
                gecici[i] = MUSTERILER[i];

            MUSTERILER = new Musteri[MUSTERILER.length+1];

            for(int i=0;i<gecici.length;i++)
                MUSTERILER[i]=gecici[i];

            MUSTERILER[MUSTERILER.length-1] = musteri;
        }

    }

    public static void addKredi(Kredi kredi)
    {
        if(KREDILER == null)
        {
            KREDILER = new Kredi[1];
            KREDILER[0]=kredi;
        }
        else{

            Kredi gecici []  = new Kredi[KREDILER.length];
            for(int i=0;i<gecici.length;i++)
                gecici[i] = KREDILER[i];

            KREDILER = new Kredi[KREDILER.length+1];

            for(int i=0;i<gecici.length;i++)
                KREDILER[i]=gecici[i];

            KREDILER[KREDILER.length-1] = kredi;
        }

    }
/*
JDBC PostgreSql Veritabanı işlemleri yapıcagız!!!!!
 */
    public static void addPersonel(Personel personel)
    {
        if(PERSONELLER == null)
        {
            PERSONELLER = new Personel[1];
            PERSONELLER[0]=personel;
        }
        else{

            Personel gecici []  = new Personel[PERSONELLER.length];
            for(int i=0;i<gecici.length;i++)
                gecici[i] = PERSONELLER[i];

            PERSONELLER = new Personel[PERSONELLER.length+1];

            for(int i=0;i<gecici.length;i++)
                PERSONELLER[i]=gecici[i];

            PERSONELLER[PERSONELLER.length-1] = personel;
        }

    }

}
