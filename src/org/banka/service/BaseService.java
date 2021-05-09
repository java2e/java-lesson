package org.banka.service;

import org.banka.model.Kredi;
import org.banka.model.Musteri;
import org.banka.model.Personel;
import org.banka.utils.Storage;

public class BaseService<T> implements IService<T> {

    @Override
    public void ekle(T t) {
        /*
        EKLEME İŞLEMİ

         */
        if(t instanceof Musteri){
            ((Musteri) t).id = generateID();
            Storage.addMusteri((Musteri) t);
        }
        else if(t instanceof Kredi){
            ((Kredi) t).id = generateID();
            Storage.addKredi((Kredi) t);
        }
        else if(t instanceof Personel)
        {
            ((Personel) t).id = generateID();
            Storage.addPersonel((Personel) t);
        }
    }

    @Override
    public void sil(T t) {

        if(t instanceof Musteri)
        {
            /*
            storage icerisinde silecek
             */

            for(int i=0;i<Storage.MUSTERILER.length;i++)
            {
                if(((Musteri) t).id == Storage.MUSTERILER[i].id)
                {
                    Storage.MUSTERILER[i].setDelete(true);
                }
            }

        }
        else if(t instanceof Kredi)
        {

            for(int i=0;i<Storage.KREDILER.length;i++)
            {
                if(((Kredi) t).id == Storage.KREDILER[i].id)
                {
                    Storage.KREDILER[i].setDelete(true);
                }
            }


        }
    }

    @Override
    public T[] listeGetir() {
        return null ;
    }

    public int generateID()
    {
        /*
        onceki idler bak ona göre ccevir!!!!
         */
        Storage.LAST_ID=Storage.LAST_ID+1;
        return  Storage.LAST_ID; //(int) (Math.random()*100)+1;
    }
}
