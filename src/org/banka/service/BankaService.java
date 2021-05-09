package org.banka.service;

import org.banka.model.Banka;
import org.banka.model.Musteri;

public class BankaService extends  BaseService<Banka> {


    public void bankaOlustur(Banka banka)
    {
        System.out.println("Banka olusturuldu => "+banka);

        MusteriService musteriService = MusteriService.getInstance();
    }

}
