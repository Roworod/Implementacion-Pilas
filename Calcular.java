/*************************
/Hoja de trabajo 2
/@author: Robbin Woods 15201
/@version: 1.0
**************************/

public class Calcular implements I_Calculadora{
	private Stack miPila;
	private String operaciones;

	public void setMiPila(Stack pila){}

	public Stack getMiPila(){}

	public void SetOperaciones(String operaciones){
		this.operaciones=operaciones;
	}

	public String getOperaciones(){
		return operaciones;
	}

	//implementaciones

	public int Calcular (String vector){
		int i=0;
		int tempResultado;
		do{
			try (String valor=Integer.ToString(vector[i])){  //hay que modificar estras instrucciones
				miPila.push();
				stackpointer+=1;	//no se cual es el apuntador
			}
			catch{
				if (stackpointer<2)
					System.out.println("Error, no hay suficientes datos en la pila");
				else{
					switch(vector[i]){
						case '+':
							int tempInt1=miPila.pop();
							int tempInt2=miPila.pop();
							tempResultado=tempInt2+tempInt1;
							i++;
							break;
						case '-':
							int tempInt1=miPila.pop();
							int tempInt2=miPila.pop();
							tempResultado=tempInt2-tempInt1;
							i++;
							break;
						case '*':
							int tempInt1=miPila.pop();
							int tempInt2=miPila.pop();
							tempResultado=tempInt2*tempInt1;
							i++;
							break;
						case '/':
							int tempInt1=miPila.pop();
							int tempInt2=miPila.pop();
							tempResultado=tempInt2/tempInt1;
							i++;
							break;
					}
				}

			}

		}while (i<vector.length());

	}

	public String ToString(){
		return "Hola";
	}

	public String LeerArchivo(String direccion){
		return "hola";
	}


}