/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de:
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import java.util.ArrayList;
import java.util.*;
public class Radix implements Sort{
	public ArrayList<Compare> sort(ArrayList<Compare>dato, int datos){
		for(int i=0; i < 6 ; i++){
			bucketPass(dato, datos, i);	
		}return dato;
	}

	private static int decimo(int datos, int decimal){//Regresa el valor
		if(decimal ==0){
			return datos%10;
		}else{
			return decimo(datos/10, decimal-1);
		}
	}

	private static void bucketPass(ArrayList<Compare> dato, int datos, int decimal){
		Compare valor;
		Vector<Vector<Integer>> posicion = new Vector<Vector<Integer>>(10);
		posicion.setSize(10);
		for (int j=0; j<10; j++){
			posicion.set(j, new Vector<Integer>());	
		} 


		for (int i = 0; i < datos; i++) {
			valor = dato.get(i);
			int j = decimo(valor.getValor(), decimal);
			posicion.get(j).add(valor.getValor());
		}

		int i = datos;

		for (int j=9; j >= 0; j--) {
			while (!posicion.get(j).isEmpty()){
				i--;
				valor = new Compare(posicion.get(j).remove(posicion.get(j).size() - 1));
				dato.set(i, valor);
			}
		}

	}


}