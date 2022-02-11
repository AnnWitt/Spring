package annwitt.Powtorka.dto;

import annwitt.Powtorka.KrolikEnum;

public class KrolikOneDTO {
public String imie;
public String kolor;
public int wiek;
public KrolikEnum plec;

    public KrolikOneDTO(String imie, String kolor, int wiek, KrolikEnum plec) {
        this.imie = imie;
        this.kolor = kolor;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }
    public String getKolor() {
        return kolor;
    }
    public int getWiek() {
        return wiek;
    }
    public KrolikEnum getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "KrolikOneDTO{" +
                "imie='" + imie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }
}
