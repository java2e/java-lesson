package org.banka.service;

import org.banka.model.Kredi;
import org.banka.utils.Storage;

public class KrediService extends BaseService<Kredi> {


    private KrediService(){

    }

    public static KrediService krediService;

    public static KrediService getInstance(){
        if(krediService == null)
            krediService = new KrediService();
        return krediService;
    }

    @Override
    public Kredi[] listeGetir() {
        return Storage.KREDILER;
    }
}
