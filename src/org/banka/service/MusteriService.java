package org.banka.service;

import org.banka.model.Musteri;
import org.banka.utils.Storage;

public class MusteriService extends BaseService<Musteri> {
    /*
    Müşteri ile ilgili işlemleri yapılacak!!
     */


    @Override
    public Musteri[] listeGetir() {
        return Storage.MUSTERILER;
    }
}
