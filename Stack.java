/************************
*Stack
*@version: 2.0
*@author: Robbin Woods 15201, Steven Rubio 15044
*****************************/
import java.util.*;
public class Stack implements I_Stack{
	private Vector vector1;

	public Stack(){
		this.vector1.clear();
	}
	
	 /**/
	public int size(){
		return vector1.size();
		
	}
 

	public void push(Object t){
			vector1.add(t);
	}
	
	@Override
	public Object pop() {
		Object t = vector1.lastElement();
		vector1.removeElementAt(vector1.size()-1);
		return t;
	}

	@Override
	public boolean isEmpty() {
		
		return vector1.isEmpty();
	}

	@Override
	public Object get() {
		Object t = vector1.get(vector1.size()-2);
		return t;
	}
	
	/* */
	public void setVector(String vector){

	}

	public String getVector(){
		return null;

	}


}
