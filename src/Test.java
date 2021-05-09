import org.banka.model.Banka;
import org.banka.model.Musteri;
import org.banka.service.MusteriService;

public class Test {

    /*


    Generics
    < T,S,V >


Banka Kredi İşlem Uygulaması

Kredi
    id
    krediNo
    miktar
    taksitSayisi

    ekle,sil
Musteri
    id
    adiSoyadi
    tcNo

    ekle,sil
Banka
    id
    adi
    Musteriler
    Krediler

    ekle,sil



     */


    public static void main(String[] args) {
        /*
        Unit Test!
         */
        Musteri musteri = new Musteri(1,"Java","1231242");
        MusteriService musteriService =MusteriService.getInstance();
        musteriService.ekle(musteri);

        Musteri musteri2 = new Musteri(2,"Java 2","3224342");
        musteriService.ekle(musteri2);

        for(Musteri m : musteriService.listeGetir())
            System.out.println(m);


    }



}
