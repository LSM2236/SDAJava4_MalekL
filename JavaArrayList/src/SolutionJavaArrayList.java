import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionJavaArrayList {
    /*
    5 - pierwsza wartoœæ wczytana z konsoli - oznacza ile elementów bêdzie mieæ tablica pocz¹tkowa
	12 0 1 78 12 - elementy tablicy (wczytane z konsoli)
	2 - ile operacji chcesz wykonaæ (wczytane z konsoli)
	Insert - nazwa pierwszej operacji (wczytane z konsoli)
	5 23 - indeks, do którego ma zostaæ przypisana wartoœæ (wczytane z konsoli)
	Delete - nazwa drugiej operacji (wczytane z konsoli)
	0 - indeks elementy do usuniêcia
     */
	
	/*
	 Kroki do wykonania:
	 1) zapytaj u¿ytkownika ile elementów bêdzie mieæ tablica pocz¹tkowa
	 2) poproœ u¿ytkownika o wpisanie elementów, dodaj je do tablicy
	 3) zapytaj ile operacji u¿ytkownik chce wykonaæ
	 4) wczytaj nazwê operacji
	 5) wczytaj liczbê b¹dŸ liczby podane przez u¿ytkownika (zale¿y od wybranej operacji)
	 6) kroki 4) i 5) powtórz dla ka¿dej operacji
	 7) wyœwietl wynik
	 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj liczbe elementow tablicy");
        int liczbaElementow = s.nextInt();
        List<Integer> lista = new ArrayList<>(liczbaElementow);
        for (int i = 0; i < liczbaElementow; i++) {
            System.out.println("podaj liczbe nr" + (i + 1));
            int liczba = s.nextInt();
            lista.add(liczba);
        }
        s.nextLine();
        System.out.println("podaj operacje oddzielone spacja");
        String operacja = s.nextLine();
        String[] tablicaOperacji = operacja.split(" ");
        List<String> typyOperacji = Arrays.asList(tablicaOperacji);
        for (String wpis : typyOperacji) {
            if (wpis.equals("insert")) {
                int index = s.nextInt();
                int liczba = s.nextInt();
                lista.add(index, liczba);
            } else if (wpis.equals("delete")) {
                int index = s.nextInt();
                lista.remove(index);
            } else {
                System.out.println("nie rozpoznano komendy");
            }
        }
        System.out.println(lista);
    }
    //   System.out.println(typyOperacji);
}




