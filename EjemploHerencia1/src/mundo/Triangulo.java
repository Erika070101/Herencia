package mundo;

public class Triangulo extends DosDimensiones {
	
	String estilo;
	double area() {
		return base*altura/2;
	}
	public void mostrarEstilo() {
		System.out.println("Trinaguloo es: " +estilo);
	}
}