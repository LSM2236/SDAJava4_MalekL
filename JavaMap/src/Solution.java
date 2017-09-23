import java.lang.reflect.Array;
import java.util.*;

class Solution {
	public static void main(String[] argh) {
		String[] names = { "uncle sam", "tom", "harry" };
		int[] numbers = { 99912222, 11122222, 12299933 };
		// dodaj do mapy nazwy oraz odpowiadaj¹ce im numery
		Map mapa = new HashMap();
		for (int i = 0; i < names.length; i++){
			mapa.put(names[i], numbers[i]);
		}
		System.out.println(mapa);
		String[] query = { "uncle sam", "uncle tom", "harry" };
		query.toString();
		// sprawdŸ czy w mapie wystêpuj¹ powy¿sze wartoœci,
		// jeœli tak wypisz nazwê oraz numer np. tom = 11122222
		// jeœli nie - wyœwietl "nie znaleziono"
		for (String nazwa : query){
			if (mapa.containsKey(nazwa)){
				System.out.println(nazwa + "=" + mapa.get(nazwa));
			}else {
				System.out.println("Nie znaleziono");
			}
		}

	}
}