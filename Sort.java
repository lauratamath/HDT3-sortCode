/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: poseer las operaciones que se llevaran a cabo (interfaz)
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import java.util.ArrayList;

public interface Sort{
	/**
	* @param dato
	* @param datos
	pre: Los datos se encuentran en un array desordenado
	post: la cantidad de datos a ordenar
	@return los datos se encuentran ordenados en el array
	 metodo que ordena el array  por medio de seleccion
	**/
	public ArrayList<Compare> sort(ArrayList<Compare> dato, int datos)
}