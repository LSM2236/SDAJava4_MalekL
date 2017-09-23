import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    private Double stanKontaBanku = 1000000.0;
    String adres;
    Map<Integer, Klient> listaKlientow = new HashMap<>();

    public Bank(Double stanKontaBanku, String adres){
        this.stanKontaBanku = stanKontaBanku;
        this.adres = adres;
    }
    public boolean sprawdzeniePozyczek(boolean posiadaPozyczke){
        if (posiadaPozyczke){
            System.out.println("Klient posiada pożyczke");
            return true;
        }
        System.out.println("Klient nie posiada pozyczki");
        return posiadaPozyczke;

    }
    Scanner s = new Scanner(System.in);

    public double wplataPieniedzy(Klient klient){
        System.out.println("Prosze podac id klienta");
        int numerKlienta = s.nextInt();
        listaKlientow.put(numerKlienta, klient);
        if (listaKlientow.containsValue(klient)) {
            for (int i = 0; i <= listaKlientow.size(); i++) {
                System.out.println("Prosze podac kwote wplaty");
                double wplata = s.nextDouble();
                if (klient.numerID == numerKlienta) {
                    klient.stanKontaKlient += wplata;
                    System.out.println("Nowy stan konta klienta " + klient.imie + " to: " + klient.stanKontaKlient);
                    stanKontaBanku += wplata;
                } else {
                    System.out.println("Nie rozpoznano numeru klienta");
                }
                System.out.println("Nowy stan konta banku: " + stanKontaBanku.intValue());
                //System.out.println("Nowy stan konta klienta: " + stanKontaKlient);
                return wplata;
            }
        }else {
            System.out.println("nie odnaleziono klienta");
        }
        return stanKontaBanku;
    }


}
