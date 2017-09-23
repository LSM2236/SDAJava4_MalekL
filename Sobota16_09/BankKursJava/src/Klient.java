public class Klient {
    String imie;
    String nazwisko;
    int numerID;
    double stanKontaKlient;
    boolean posiadaPozyczke = false;

    public Klient(String imie, String nazwisko, int numerID){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerID = numerID;
    }
    public Klient(String imie, String nazwisko, int numerID, double stanKontaKlient, boolean posiadaPozyczke){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerID = numerID;
        this.stanKontaKlient = stanKontaKlient;
        this.posiadaPozyczke = posiadaPozyczke;

    }

    public boolean isPosiadaPozyczke() {
        return posiadaPozyczke;
    }
    public boolean zaciagnijPozyczke(){
        return posiadaPozyczke == true;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumerID() {
        return numerID;
    }
}
