package algoritmos;

import java.util.Random;

public class Insercion {
	
	private int[] arreglo = new int[50000];
		
	public void generarArreglo() {
		Random rand = new Random();
		
		for (int i = 0; i < 50000; i++) {
			arreglo[i] = rand.nextInt();
		}
		
	}
	public void ordenamiento() {
		int i,j;
		Integer aux;
		for (i = 1; i < arreglo.length-1; i++) {
			aux = arreglo[i];
			j = i - 1;
			while ((j>=0) && (arreglo[j]>aux)) {
				arreglo[j+1] = arreglo[j];
				j--;
			}
			arreglo[j+1] = aux;
			
		}
	}
	
	
	public static void main(String[] args) {
		Insercion ins = new Insercion();
		ins.generarArreglo();
		double timeIni = System.currentTimeMillis();
		ins.ordenamiento();
		double timeFin = System.currentTimeMillis();
		double time = timeFin - timeIni;
		System.out.println("tiempo en milis: " + time);
		
	}
}
