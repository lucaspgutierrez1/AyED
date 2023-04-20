package Ejercicio2;
import paqueteEstructuras.*;
public class ej2 {

	public static void main(String[] args) {
		ArbolBinario<String> a = new ArbolBinario("A");
		ArbolBinario<String> b = new ArbolBinario("B");
		ArbolBinario<String> c = new ArbolBinario("C");
		ArbolBinario<String> d = new ArbolBinario("D");
		ArbolBinario<String> e = new ArbolBinario("E");
		a.agregarHijoIzquierdo(b);	
		b.agregarHijoDerecho(c);
		a.agregarHijoDerecho(d);
		b.agregarHijoIzquierdo(e);	
		
		System.out.println("Su arbol tiene " + a.contarHojas()+" hojas");
	}

}
