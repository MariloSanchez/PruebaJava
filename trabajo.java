//No me acuerdo de meter datos por consola..
public class trabajo{
	public static void main (String[] args) {
		
		System.out.print("¿Cómo te llamas?: ");
		String nombre = System.console().readLine();		
		System.out.println("Encantado de conocerte " + nombre);
		System.out.print("¿Qué edad tienes?: ");
		int edad = Integer.parseInt(System.console().readLine());
		if(edad >= 18) {
			System.out.print("Te invito a tomar una copa");
		} else {
			System.out.print("Este es un chat de adultos, te rogaría que lo abandonases. Hata luego");
		}
	}
}
