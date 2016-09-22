//No me acuerdo de meter datos por consola..
public class trabajo{
	public static void main (String[] args) {
		
		System.out.println("¿Cómo te llamas?");
		System.out.print("Nombre: ");
		String nombre = System.console().readLine();
		
		System.out.println("Encantado de conocerte " + nombre);
	}
}
