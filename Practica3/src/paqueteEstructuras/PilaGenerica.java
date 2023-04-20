package paqueteEstructuras;

public class PilaGenerica<T> {
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void apilar (T elemento) {
		datos.agregarFinal(elemento);
	}
	
	public T tope() {
		return datos.elemento(datos.tamanio());
	}
	
	public T desapilar() {
		T elemento = this.tope();
		datos.eliminarEn(datos.tamanio());
		return elemento;
	}
	
	public boolean esVacia() {
		return datos.esVacia();
	}
	
	
}
