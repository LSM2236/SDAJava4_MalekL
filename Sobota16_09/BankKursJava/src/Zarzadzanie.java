public class Zarzadzanie {

    public static void main(String[] args) {
        Bank PKO = new Bank(15000000.0, "Plac Kilinskiego, Zgierz");
        Klient klient1 = new Klient("Jan","Nowak", 1, 2500,false);

        PKO.sprawdzeniePozyczek(klient1.posiadaPozyczke);
        PKO.wplataPieniedzy(klient1);
    }
}
