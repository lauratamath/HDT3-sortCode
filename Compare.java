/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: implementar iCompare
* @version 11/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
public class Compare implements ICompare<Compare>{
	private int valor; 

	/**
	*pre: Un nuevo valor a comparar
	*Post: el objeto obtiene su valor
	* @param nuevoVal
	**/
	public Compare(int nuevoVal){
		this.valor = nuevoVal;
	}

	/**
	*pre: Un nuevo objeto, de tipo compare, se comparara
	@param compaVal es el nuevo objeto
	*post: Se restan los valores de los objetos y 
	@return ese resultado
	**/

	public int compareTo(Compare compaVal){
		return this.valor - compaVal.getValor();
	}

	/**
	pre: obtendra el valor
	post: el valor del objeto
	**/
	public int getValor(){
		return this.valor;
	}

	/**
	pre: debe de tener el valor del atributo valor
	post: cambiar el del atributo valor
	**/
	public void setValor(int nuevoVal){
		this.valor = nuevoVal;
	}
}




