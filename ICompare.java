/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de:
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
public interface ICompare<C>{
	/**
	pre: se compara el valor
	@return -1 cuando el valor es menor al objeto, 1 si es mayor, y 0 si es igual
	**/
	public abstract int compareTo(C compaVal);
}