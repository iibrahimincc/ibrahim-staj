package ibrahim.ibrahimstaj.controller;

import java.time.LocalDate;

public class StajBilgiResponse {
    private String adi;
    private String soyadi;

    private String bölümü;

    private int stajGünü;

    private LocalDate baslangicTarihi;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getBölümü() {
        return bölümü;
    }

    public void setBölümü(String bölümü) {
        this.bölümü = bölümü;
    }

    public int getStajGünü() {
        return stajGünü;
    }

    public void setStajGünü(int stajGünü) {
        this.stajGünü = stajGünü;
    }

    public LocalDate getBaslangicTarihi() {
        return baslangicTarihi;
    }

    public void setBaslangicTarihi(LocalDate baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }
}
