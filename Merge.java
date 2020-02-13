/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: implementar las funciones SortMerge, es decir ordena una estructura de dator tipo compare
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import java.util.ArrayList;

public class Merge implements Sort{
	/**
	@param dato es el arreglo en el cual deben de estar ordenados los datos
	@return arreglo ordenado
	**/
	public ArrayList<Compare> sort(ArrayList<Compare> dato, int datos){
		ArrayList<Compare> temporal = new ArrayList<Compare>();

		mergeSortRecursive(dato,temporal,0,  datos-1);
		return dato;
	}

	private static void sort(ArrayList<Compare> dato, ArrayList<Compare> temporal, int cero, int uno, int dos){
		int resultante = uno;
		int actual = cero;
		int next = dos;

		while(actual < dos && next <= uno){
			if(dato.get(next).compareTo(temporal.get(actual))<0){
				dato.set(resultante++, dato.get(next++));
			}else{
				dato.set(resultante++, temporal.get(actual++));
			}
		}
		while(actual< dos){
			dato.set(resultante++, temporal.get(actual++));
		}
	}

	private static void mergeSortRecursive(ArrayList<Compare> dato, ArrayList<Compare> temporal, int min, int max){
		int existente = max - min +1;
		int medio = min + existente/2;
		int i;

		if(existente <2) return;
		for(i = min; i<medio; i++){
			temporal.set(i, dato.get(i));
		}

		mergeSortRecursive(temporal, dato, min, medio -1);
		mergeSortRecursive(dato, temporal, max, medio);
		sort(dato, temporal, medio, max, min);
	}
}