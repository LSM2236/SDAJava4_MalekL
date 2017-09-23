import java.util.*;
interface AdvancedArithmetic{
  int divisorSum(int n);
}

//Napisz klasê MyCalculator implementuj¹c¹ interfejs AdvancedArithmetic
//Metoda divisorSum powinna zwracaæ sumê dzielników liczby podaj przez u¿ytkownika
//Przyk³ad: u¿ytkownik wpisaæ cyfrê 6
//Dzielniki to: 1, 2, 3, 6
//Suma dzielników: 12


public class Solution{
    public static void main(String []args){
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(myCalculator.divisorSum(n) + "\n");
      	sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
