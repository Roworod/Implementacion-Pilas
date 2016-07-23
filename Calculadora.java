
public class Calculadora implements I_Calculadora{

	private Stack miPila;
	private String operaciones;
	
	
	@Override
	public int calcular(String vector) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String leerArchivo(String direccion) {
		// TODO Auto-generated method stub
		return null;
	}

	public Stack getMiPila() {
		return miPila;
	}

	public void setMiPila(Stack miPila) {
		this.miPila = miPila;
	}

	public String getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(String operaciones) {
		this.operaciones = operaciones;
	}

}
