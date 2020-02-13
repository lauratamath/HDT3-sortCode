/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: ordenas una estructura de tipo compare
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import java.util.ArrayList;

public class Quick implements Sort{

	//pre: arreglo no ordenado
	//post: arreglo ordenado
	public ArrayList<Compare> sort(ArrayList<Compare> dato, int datos){
		qs(dato, datos -1, 0);
		return dato;
	}

	private static void qs(ArrayList<Compare> dato, int left, int right){
		int ultright;
		if (left >= right) return;

		ultright = posiciona(dato, right, left);
		qs(dato, ultright+1, right);
		qs(dato, left, ultright-1);
	}

	/**
	@param dato //datos a ordenar
	@param left //indica que tan a la izquierda esta del inicio del array
	@param right //inidica que tan a la derecha esta el inicio del array
	**/

	private static int posiciona(ArrayList<Compare> dato, int right, int left){
		while (true){
			//Moviendo el puntero hacia la izquierda
			while(left < right && dato.get(left).compareTo(dato.get(right)) < 0){
				right --;
			}
			if(left < right){
					swap(dato, left ++, right);
			}else{
				return left;
			}
			//Moviendo el puntero hacia la derecha
			while(left <right && dato.get(left).compareTo(dato.get(right))<0){
				left ++;
			}
			if (left < right) {
				swap(dato, left, right--);
			}else{
				return right;
			}
		}
	}


	/**
	@param dato 				//datos a ordenar
	@param primer				//se obtiene la primera posicion, para asignar el siguiente
	@param siguiente			// viceversa 
	**/

	//Cambio de datos
	private static void swap(ArrayList<Compare> dato, int primer, int siguiente){
		Compare temporal;
		temporal = dato.get(primer);
		dato.set(siguiente, temporal);
		dato.set(primer, dato.get(siguiente));
	}
}