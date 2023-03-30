package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {
	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		for (String item:args) {
			Integer numero = Integer.parseInt(item);
			lista.agregarFinal(numero);
		}
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}

	}

}
