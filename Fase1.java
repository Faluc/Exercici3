import java.util.Scanner;

public class Fase1 {

	public static void main(String[] args) {
		
		String ciutat1 = " ";
		String ciutat2 = " ";
		String ciutat3 = " ";
		String ciutat4 = " ";
		String ciutat5 = " ";
		String ciutat6 = " ";
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdudeix el nom de la ciutat 1");
		ciutat1 = entrada.next();
		System.out.println("Introdudeix el nom de la ciutat 2");
		ciutat2 = entrada.next();
		System.out.println("Introdudeix el nom de la ciutat 3");
		ciutat3 = entrada.next();
		System.out.println("Introdudeix el nom de la ciutat 4");
		ciutat4 = entrada.next();
		System.out.println("Introdudeix el nom de la ciutat 5");
		ciutat5 = entrada.next();
		System.out.println("Introdudeix el nom de la ciutat 6");
		ciutat6 = entrada.next();
		
		System.out.println(ciutat1);
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);
		
	}

}
