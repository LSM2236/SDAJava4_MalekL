import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
        int count = 5;
        String [] pairLeft = {"john", "john", "john", "mary", "mary"};
        String [] pairRight = {"tom", "mary", "tom", "anna", "anna"};
        Set pary = new HashSet();
        for (int i=0; i < count; i++ ){
            pary.add(pairLeft[i]+"" +pairRight[i]);

            System.out.println(pary.size());
        }

	}
}
