package ejercicio4;
import paqueteEstructuras.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		ArbolBinario<Integer> num14 = new ArbolBinario(14);
		ArbolBinario<Integer> num53 = new ArbolBinario(53);
		ArbolBinario<Integer> num2 = new ArbolBinario(2);
		ArbolBinario<Integer> num12 = new ArbolBinario(12);
		ArbolBinario<Integer> num9 = new ArbolBinario(9);
		ArbolBinario<Integer> num33 = new ArbolBinario(33);
		ArbolBinario<Integer> num102 = new ArbolBinario(102);
		
		num14.agregarHijoIzquierdo(num53);
		num14.agregarHijoDerecho(num2);
		num53.agregarHijoIzquierdo(num12);
		num53.agregarHijoDerecho(num9);
		num2.agregarHijoIzquierdo(num53);
		num2.agregarHijoDerecho(num102);
		
		RedBinariaLlena red= new RedBinariaLlena();
		System.out.println("El mayor retardo es" + red.retardoReenvio(num14) + " segundos");
	}

}
