/**
* @author Laura Tamath
* @since 10/02/2020
* Literatura Citada: Bailey, D. (septiembre 2007). "Java Stuctures Data Structure in Java
* Clase encargada de: implementar todas las clases y mostrar resultados al usuario
* @version 12/02/2020
* Seccion: 20		Catedrático: Douglas B. 	Clase: Algortimos y estructuras de datos
*/
import java.util.Random;
import java.util.*; 
import java.io.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		Sort selection = new Selection();
		Sort radix = new Radix();
		Sort quick = new Quick();
		Sort merge = new Merge();
		Sort insertion = new Insertion();
		Random aleatorio = new Random();


		int cantidad = aleatorio.nextInt(100)+10;
		ArrayList<Compare> orden = new ArrayList<Compare>();
		ArrayList<Compare> dato = new ArrayList<Compare>();
	
		//Generar numeros aleatorios y adjuntarlos al .txt
		try{
			FileWriter fwri = new FileWriter("DataUnsorted.txt", true);
			PrintWriter pwri = new PrintWriter("DataUnsorted.txt");
			pwri.close();

			for(int i=0; i<cantidad; i++){
				int generados = aleatorio.nextInt(10);
				fwri.write(generados + "\n");
				dato.add(new Compare(generados));
			} fwri.close();
		}catch(IOException e) {
            System.out.println("El archivo no se ha encontrado");
        }
	orden = radix.sort(dato, cantidad);

        try{
        	PrintWriter pwri = new PrintWriter("SortedData.txt");
        	FileWriter fwri = new FileWriter("SortedData.txt", true);
        	pwri.close();

        	for(int i=0; i<orden.size(); i++){
        		int generados = orden.get(i).getValor();
        		fwri.write(generados + "\n");
        	}
        	fwri.close();
        }catch(IOException e) {
            System.out.println("El archivo no se ha encontrado");
        }
	}
}