
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadoraPrubea = new Calculadora();
		String direccion = "C:\\Users\\HRV\\workspace\\AED\\src\\Prueba\\";
		String instrucciones = calculadoraPrubea.leerArchivo(direccion);
		System.out.println(instrucciones);
		int resultado = calculadoraPrubea.calcular(instrucciones);
		System.out.println("El resultado de la operacion es : "+resultado);
	}

}
