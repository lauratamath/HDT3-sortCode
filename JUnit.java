/**
* @author Laura Tamath
* @since 12/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: ordenas una estructura de tipo compare
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class JUnit{
	@Test
	public void merge(){
		Merge merge = new Merge();
		ArrayList<Compare> dato = new ArrayList<Compare>();
		ArrayList<Compare> dados = new ArrayList<Compare>();
		ArrayList<Compare> esperados = new ArrayList<Compare>();
		
		ArrayList<String> orden = new ArrayList<String>();
		ArrayList<String> pronto = new ArrayList<String>();

		//Datos que son dados
		dato.add(new Compare(6));
		dato.add(new Compare(2));
		dato.add(new Compare(4));
		dato.add(new Compare(9));
		dato.add(new Compare(1));

		//Datos que se esperan
		esperados.add(new Compare(1));
		esperados.add(new Compare(2));
		esperados.add(new Compare(4));
		esperados.add(new Compare(6));
		esperados.add(new Compare(9));
		
		dados = merge.sorting(dato, 5);
		
		for(int i=0; i<datos.size(); i++) {
			orden.add(dados.get(i).toString());
			pronto.add(esperados.get(i).toString());
		} assertEquals(pronto, orden);
	} 

	@Test
	public void quick(){
		Quick quick = new Quick();
		ArrayList<Compare> dato = new ArrayList<Compare>();
		ArrayList<Compare> dados = new ArrayList<Compare>();
		ArrayList<Compare> esperados = new ArrayList<Compare>();
		
		ArrayList<String> orden = new ArrayList<String>();
		ArrayList<String> pronto = new ArrayList<String>();

		//Datos que son dados
		dato.add(new Compare(6));
		dato.add(new Compare(2));
		dato.add(new Compare(4));
		dato.add(new Compare(9));
		dato.add(new Compare(1));

		//Datos que se esperan
		esperados.add(new Compare(1));
		esperados.add(new Compare(2));
		esperados.add(new Compare(4));
		esperados.add(new Compare(6));
		esperados.add(new Compare(9));
		
		dados = quick.sorting(dato, 5);
		
		for(int i=0; i<datos.size(); i++) {
			orden.add(dados.get(i).toString());
			pronto.add(esperados.get(i).toString());
		} assertEquals(pronto, orden);

	}



	@Test
	public void insertion(){
		Insertion insertion = new Insertion();
		ArrayList<Compare> dato = new ArrayList<Compare>();
		ArrayList<Compare> dados = new ArrayList<Compare>();
		ArrayList<Compare> esperados = new ArrayList<Compare>();

		ArrayList<String> orden = new ArrayList<String>();
		ArrayList<String> pronto = new ArrayList<String>();

		//Datos que son dados
		dato.add(new Compare(6));
		dato.add(new Compare(2));
		dato.add(new Compare(4));
		dato.add(new Compare(9));
		dato.add(new Compare(1));

		//Datos que se esperan
		esperados.add(new Compare(1));
		esperados.add(new Compare(2));
		esperados.add(new Compare(4));
		esperados.add(new Compare(6));
		esperados.add(new Compare(9));

		dados = insertion.sort(dato, 5);
		for(int i =0 ; i<dato.size(); i++){
			orden.add(esperados.get(i).toString());
			pronto.add(esperados.get(i).toString());
		}assertEquals(orden, pronto);
	}

	@Test
	public void radix(){
		Radix radix = new Radix();
		ArrayList<Compare> dato = new ArrayList<Compare>();
		ArrayList<Compare> dados = new ArrayList<Compare>();
		ArrayList<Compare> esperados = new ArrayList<Compare>();
		
		ArrayList<String> orden = new ArrayList<String>();
		ArrayList<String> pronto = new ArrayList<String>();

		//Datos que son dados
		dato.add(new Compare(6));
		dato.add(new Compare(2));
		dato.add(new Compare(4));
		dato.add(new Compare(9));
		dato.add(new Compare(1));

		//Datos que se esperan
		esperados.add(new Compare(1));
		esperados.add(new Compare(2));
		esperados.add(new Compare(4));
		esperados.add(new Compare(6));
		esperados.add(new Compare(9));
		
		dados = radix.sorting(dato, 5);
		
		for(int i=0; i<datos.size(); i++) {
			orden.add(dados.get(i).toString());
			pronto.add(esperados.get(i).toString());
		} assertEquals(pronto, orden);
	}

	@Test
	public void selection(){
		Selection selec = new Selection();
		ArrayList<Compare> dato = new ArrayList<Compare>();
		ArrayList<Compare> dados = new ArrayList<Compare>();
		ArrayList<Compare> esperados = new ArrayList<Compare>();
		
		ArrayList<String> orden = new ArrayList<String>();
		ArrayList<String> pronto = new ArrayList<String>();

		//Datos que son dados
		dato.add(new Compare(6));
		dato.add(new Compare(2));
		dato.add(new Compare(4));
		dato.add(new Compare(9));
		dato.add(new Compare(1));

		//Datos que se esperan
		esperados.add(new Compare(1));
		esperados.add(new Compare(2));
		esperados.add(new Compare(4));
		esperados.add(new Compare(6));
		esperados.add(new Compare(9));
		
		dados = selec.sorting(dato, 5);
		
		for(int i=0; i<datos.size(); i++) {
			orden.add(dados.get(i).toString());
			pronto.add(esperados.get(i).toString());
		} assertEquals(pronto, orden);
	}

}
