//libreria para solicitud de datos a usuario
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner usuario = new Scanner(System.in);
		String direccion;
		direccion="";
		System.out.println("\n      ###########################################################");
		System.out.println("      #_________________________________________________________#");
		System.out.println("      #___ CALCULADORA__________________________________________#");
		System.out.println("      #__________________DESDE__________________________________#");
		System.out.println("      #__________________________ARCHIVOS_______________________#");
		System.out.println("      #____________________________________DE___________________#");
		System.out.println("      #_________________________________________TEXTO___________#");
		System.out.println("      #_________________________________________________TXT_____#");
		System.out.println("      #_________________________________________________________#");
		System.out.println("      ###########################################################\n");
		try
		{
			System.out.println("Ingrese el nombre del archivo que contiene la operacion (incluir el .txt) ");
			direccion= usuario.next();
			
			
			Calculadora calculadoraPrubea = new Calculadora();
			//String direccion = "ejemplo.txt";
		
			String instrucciones = calculadoraPrubea.leerArchivo(direccion);
			System.out.println(instrucciones);
			int resultado = calculadoraPrubea.calcular(instrucciones);
			System.out.println("El resultado de la operacion es : "+resultado);
		}
		catch(Exception e)
		{
			System.out.println("no se encontro o no existe el archivo solicitado");
		}
	}
}
