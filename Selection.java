/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: implementar las funciones del sort selection, 
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos de tipo compare 
*/
import java.util.ArrayList;

public class Selection implements Sort{
	@Override
	public ArrayList<Compare> sort(ArrayList<Compare> dato, int datos){
		int unsorsed = datos;
		int maximo;
		Compare ayu;

		while(unsorsed>0){
			maximo = 0;
			//Recorrer array para ver cual es el mayor
			for(int i = 1; i < unsorsed;i++){
				if(dato.get(maximo).compareTo(dato.get(i))<0){
					maximo = i;
				}
			} swap(dato, maximo, unsorsed-1);
			unsorsed--;
		}
		return dato;
	}
	private static void swap(ArrayList<Compare>dato, int primer, int siguiente){
		Compare temporal; 
		temporal = dato.get(primer);
		dato.set(primer, dato.get(siguiente));
		dato.set(siguiente, temporal);
	}
}
