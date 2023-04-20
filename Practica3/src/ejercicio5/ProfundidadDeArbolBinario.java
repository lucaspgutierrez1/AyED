package ejercicio5;
import paqueteEstructuras.*;
public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> arbol;
	private void setArbol(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int altura() {
		if (arbol.esVacio())
			return -1;
		else {
			int altIzq=-1,altDer=-1;
			if(arbol.tieneHijoIzquierdo()) {
				altIzq= arbol.getHijoIzquierdo().altura();
			}
			if(arbol.tieneHijoDerecho()) {
				altDer=arbol.getHijoDerecho().altura();
			}
			return Math.max(altIzq, altDer) +1;
		}
	}
	public int sumaElementosProfundida(int p) {
		ColaGenerica <ArbolBinario<Integer>> cola = new ColaGenerica<>();
		ArbolBinario<Integer> arbol2;
		int contNivel = 0,suma = 0;
		cola.encolar(arbol);
		cola.encolar(null);
		if(p<= arbol.alt)
	}
}
