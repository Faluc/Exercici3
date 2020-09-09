import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fase4 {

	public static void main(String[] args) {
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";
		
		List<String> arrayciutat1 = new ArrayList<String>(Arrays.asList(ciutat1.split("")));
		Collections.reverse(arrayciutat1);
		System.out.println(arrayciutat1);
		List<String> arrayciutat2 = new ArrayList<String>(Arrays.asList(ciutat2.split("")));
		Collections.reverse(arrayciutat2);
		System.out.println(arrayciutat2);
		List<String> arrayciutat3 = new ArrayList<String>(Arrays.asList(ciutat3.split("")));
		Collections.reverse(arrayciutat3);
		System.out.println(arrayciutat3);
		List<String> arrayciutat4 = new ArrayList<String>(Arrays.asList(ciutat4.split("")));
		Collections.reverse(arrayciutat4);
		System.out.println(arrayciutat4);
		List<String> arrayciutat5 = new ArrayList<String>(Arrays.asList(ciutat5.split("")));
		Collections.reverse(arrayciutat5);
		System.out.println(arrayciutat5);
		List<String> arrayciutat6 = new ArrayList<String>(Arrays.asList(ciutat6.split("")));
		Collections.reverse(arrayciutat6);
		System.out.println(arrayciutat6);
		}
}


