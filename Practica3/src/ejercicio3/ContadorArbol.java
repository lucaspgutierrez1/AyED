package ejercicio3;
import paqueteEstructuras.*;
public class ContadorArbol {
	private ListaEnlazadaGenerica<Integer> paresPostOrden(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista){
		if(arbol.tieneHijoIzquierdo()) {
			paresPostOrden(arbol.getHijoIzquierdo(),lista);
		}
		if(arbol.tieneHijoDerecho()) {
			paresPostOrden(arbol.getHijoDerecho(),lista);
		}
		if((arbol.getDato() % 2)==0) {
			lista.agregarFinal(arbol.getDato());
		}
		return lista;
	}
	
	private ListaEnlazadaGenerica<Integer> paresInOrden(ArbolBinario<Integer> arbol,ListaEnlazadaGenerica<Integer> lista){
		if (arbol.tieneHijoIzquierdo()) {
			paresInOrden(arbol.getHijoIzquierdo(),lista);
		}
		if((arbol.getDato()%2)==0) {
			lista.agregarFinal(arbol.getDato());
		}
		if(arbol.tieneHijoDerecho()) {
			paresInOrden(arbol.getHijoDerecho(),lista);
		}
		return lista;
	}
	
	public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(ArbolBinario<Integer> arbol){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		this.paresPostOrden(arbol, lista);
		return lista;
	}
	
	public ListaEnlazadaGenerica<Integer> numerosParesInOrden(ArbolBinario<Integer> arbol){
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica<>();
		this.paresInOrden(arbol, lista);
		return lista;
	}
}
