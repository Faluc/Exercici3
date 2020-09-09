import java.util.ArrayList;

public class Fase3 {

	public static void main(String[] args) {
		
		String ciutat1 = "Barcelona";
		String ciutat2 = "Madrid";
		String ciutat3 = "Valencia";
		String ciutat4 = "Malaga";
		String ciutat5 = "Cadis";
		String ciutat6 = "Santander";
		
		String ciutat1_mod = ciutat1.replace("a", "4");
		String ciutat2_mod = ciutat2.replace("a", "4");
		String ciutat3_mod = ciutat3.replace("a", "4");
		String ciutat4_mod = ciutat4.replace("a", "4");
		String ciutat5_mod = ciutat5.replace("a", "4");
		String ciutat6_mod = ciutat6.replace("a", "4");
		
		ArrayList<String> ArrayCiutatsModificades = new ArrayList<String>();
		ArrayCiutatsModificades.add(ciutat1_mod);
		ArrayCiutatsModificades.add(ciutat2_mod);
		ArrayCiutatsModificades.add(ciutat3_mod);
		ArrayCiutatsModificades.add(ciutat4_mod);
		ArrayCiutatsModificades.add(ciutat5_mod);
		ArrayCiutatsModificades.add(ciutat6_mod);
		
		ArrayCiutatsModificades.sort(null);
		System.out.print(ArrayCiutatsModificades);
	}

}
