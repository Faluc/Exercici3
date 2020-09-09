import java.util.ArrayList;

public class Fase2 {

	public static void main(String[] args) {
		
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";
		
		ArrayList<String> arrayCiutats = new ArrayList<String>();
		arrayCiutats.add(ciutat1);
		arrayCiutats.add(ciutat2);
		arrayCiutats.add(ciutat3);
		arrayCiutats.add(ciutat4);
		arrayCiutats.add(ciutat5);
		arrayCiutats.add(ciutat6);
		
		arrayCiutats.sort(null);
		
		System.out.println(arrayCiutats);
		
	}

}
