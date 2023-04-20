package ejercicio3;
import paqueteEstructuras.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		ArbolBinario<Integer> numero18 = new ArbolBinario(18);
		ArbolBinario<Integer> numero25 = new ArbolBinario(25);
		ArbolBinario<Integer> numero4 = new ArbolBinario(4);
		ArbolBinario<Integer> numero12 = new ArbolBinario(12);
		ArbolBinario<Integer> numero31= new ArbolBinario(31);
		ArbolBinario<Integer> numero104 = new ArbolBinario(104);
		
		numero18.agregarHijoIzquierdo(numero4);
		numero18.agregarHijoDerecho(numero25);
		numero25.agregarHijoDerecho(numero104);
		numero25.agregarHijoIzquierdo(numero12);
		numero4.agregarHijoDerecho(numero31);
		
		System.out.println("Pares PostOrden");
		ContadorArbol contador = new ContadorArbol();
		ListaEnlazadaGenerica<Integer> lista = contador.numerosParesPostOrden(numero18);
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
		
		System.out.println("Pares InOrden");
		ListaEnlazadaGenerica <Integer> lista2 = contador.numerosParesInOrden(numero18);
		lista2.comenzar();
		while(!lista2.fin()) {
			System.out.println(lista2.proximo());
		}
	}

}
