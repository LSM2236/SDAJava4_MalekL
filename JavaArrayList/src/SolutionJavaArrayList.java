import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SolutionJavaArrayList {
    /*
    5 - pierwsza warto�� wczytana z konsoli - oznacza ile element�w b�dzie mie� tablica pocz�tkowa
	12 0 1 78 12 - elementy tablicy (wczytane z konsoli)
	2 - ile operacji chcesz wykona� (wczytane z konsoli)
	Insert - nazwa pierwszej operacji (wczytane z konsoli)
	5 23 - indeks, do kt�rego ma zosta� przypisana warto�� (wczytane z konsoli)
	Delete - nazwa drugiej operacji (wczytane z konsoli)
	0 - indeks elementy do usuni�cia
     */
	
	/*
	 Kroki do wykonania:
	 1) zapytaj u�ytkownika ile element�w b�dzie mie� tablica pocz�tkowa
	 2) popro� u�ytkownika o wpisanie element�w, dodaj je do tablicy
	 3) zapytaj ile operacji u�ytkownik chce wykona�
	 4) wczytaj nazw� operacji
	 5) wczytaj liczb� b�d� liczby podane przez u�ytkownika (zale�y od wybranej operacji)
	 6) kroki 4) i 5) powt�rz dla ka�dej operacji
	 7) wy�wietl wynik
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




