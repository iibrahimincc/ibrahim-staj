package ibrahim.ibrahimstaj.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@RestController
public class StajController {
    @GetMapping(value = "/staj-bilgisi")
    StajBilgiResponse stajbilgileri() {
        StajBilgiResponse response = new StajBilgiResponse();
        response.setAdi("ibrahim");
        response.setSoyadi("inanç");
        response.setStajGünü(stajGunsSayisi());
        response.setBaslangicTarihi(stajBaşlangic());
        response.setBölümü("Bilgisayar programlama");
        return response;
    }

//iibrahim.inanc@gmail.com
    //şifre: git23.,İi
    int stajGunsSayisi() {
        int stajsayisi = 20;
        return stajsayisi;
    }


    LocalDate stajBaşlangic() {
        return LocalDate.of(2023, Month.AUGUST, 11);
    }
}
