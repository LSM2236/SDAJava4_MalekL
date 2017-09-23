import java.lang.reflect.Array;
import java.lang.reflect.Method;

class Printer
{
   public void printArray(Object[] tablica){
       for (Object object : tablica){
           System.out.println(object);
       }
   }
 
}

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Tworzenie dw�ch metod printArray nie jest dozwolone");
      
    }
}