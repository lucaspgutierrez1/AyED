package paqueteEstructuras;

public class ColaGenerica<T> {
	
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elemento) {
		datos.agregarFinal(elemento);
	}
	
	public T tope() {
		return datos.elemento(datos.tamanio());
	}
	
	public boolean esVacia() {
		return datos.esVacia();
	}
	
	public T desencolar() {
		T elemento = datos.elemento(1);
		datos.eliminarEn(1);
		return elemento;
	}
}
