package paqueteEstructuras;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int contador = 0;
		if (esHoja()) {
			return 1;
		}
		else {
			if(tieneHijoIzquierdo()) {
				contador = contador + this.getHijoIzquierdo().contarHojas();
			}
			if(tieneHijoDerecho()) {
				contador = contador + this.getHijoDerecho().contarHojas();
			}
		}
		return contador;
	}
	

    public ArbolBinario<T> espejo() {
		if(this.esVacio()) {
			return new ArbolBinario<T>();
		}
		else {
				ArbolBinario<T> espejoArbol = new ArbolBinario<T>(this.getDato());
				if (this.tieneHijoIzquierdo()) {
					espejoArbol.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
				}
				if (this.tieneHijoDerecho()) {
					espejoArbol.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
				}
				return espejoArbol;
		}
	}


	public void entreNiveles(int n, int m){
		int altura = 0;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<>();
		ArbolBinario<T> arbolBinario;
		cola.encolar(this);
		cola.encolar(null);
		
		if(n>=0 && m<=altura) {
			while(!cola.esVacia()) {
				arbolBinario = cola.desencolar();
				if (arbolBinario == null) {
					if (!cola.esVacia()) {
						cola.encolar(null);
						altura++;
					}
				}
				else {
					if(n<=altura && altura<=m) {
						System.out.println(arbolBinario.getDato());
					}
					if(arbolBinario.tieneHijoIzquierdo()) {
						cola.encolar(arbolBinario.getHijoIzquierdo());
					}
					if(arbolBinario.tieneHijoDerecho()) {
						cola.encolar(arbolBinario.getHijoDerecho());
					}
				}
			}
			
		}
	}

	

}
