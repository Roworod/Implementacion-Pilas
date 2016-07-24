
/**
*Calculadora, Esta se encarga de realizar los calculos para mostar el resultado del .txt con las instrucciones
*@version: 2.0
*@author: Robbin Woods 15201, Steven Rubio 15044, Erick Bautista 15192
*@since 2016-07-24
*/

import java.io.*;

public class Calculadora implements I_Calculadora{

	private Stack miPila;
	private String operaciones;
	
	
	/**
	 * Este metodo se encarga de leer un string e identidicar los numeros y operaciones, para hacer uso de la pila y retornar 
	 * el resultado de la operacion
	 * @param String Recibe el string de la instruccion a realizar
	 * @return int regresa el resutlado de la operaciones
	 */
	public int calcular(String vector) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Este metodo se encarga de leer un archivo de texto y almacenar en un string su contenido
	 * @param String, Recibe como parametro la direccion donde se encuentra el .txt con la operaciones a realizar
	 * @return String retorna el string que se encontraba en el .txt
	 */
	public String leerArchivo(String direccion) {
		FileInputStream dirtxt = new FileInputStream(direccion);
		DataInputStream lineas = new DataInputStream(dirtxt);
		BufferedReader memoriabuf = new BufferedReader(new InputStreamReader(lineas));
		operaciones=buffer.readLine();
		lineas.close();
		return operaciones;
		
		
		// TODO Auto-generated method stub
		//por que nul?>>>>>>return null;
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
