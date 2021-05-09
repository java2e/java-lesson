package org.banka.service;

import org.banka.model.Musteri;
import org.banka.utils.Storage;

public class MusteriService extends BaseService<Musteri> {
    /*
    Müşteri ile ilgili işlemleri yapılacak!!
     */


    private MusteriService()
    {

    }

    public static MusteriService musteriService;

    public static MusteriService getInstance(){
        if(musteriService == null)
            musteriService = new MusteriService();
        return musteriService;
    }

    @Override
    public Musteri[] listeGetir() {
        return Storage.MUSTERILER;
    }

}
