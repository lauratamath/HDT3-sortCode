/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: ordenar una estructura de datos e implementa las funciones de sort
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import java.util.ArrayList;
public class Insertion implements Sort{
	@Override
	public ArrayList<Compare> sort(ArrayList<Compare> dato, int datos){
		int orden = 1; //Cantidad actual de datos ordenados
		int index; // indice actual

		//Ciclo para ordenar
		while(orden < datos){
			Compare actual = dato.get(orden);

			for(index = orden; index > 0; index --){
				//Verificar si es mayor el valor
				if (actual.compareTo(dato.get(index -1))<0){
					dato.set(index, dato.get(index-1));	
				} else{
					break;
				}
			}

			dato.set(index, actual); //Volver a agregar el antiguo valor
			orden ++;
		}
		return dato;

	}

}