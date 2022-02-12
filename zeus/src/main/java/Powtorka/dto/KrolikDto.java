package Powtorka.dto;

public class KrolikDto {
    public String imie;
    public String kolor;
    public int wiek;
    public KrolikPlec plec;

    public KrolikDto(String imie, String kolor, int wiek, KrolikPlec plec) {
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
    public KrolikPlec getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return "\"" +
                "imie='" + imie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }
}
