import tp02.ejercicio1.*;
public class TestListaDeEnterosConArreglos {
	public static void listaReversa(ListaDeEnteros lista,int tamanio) {
			System.out.println(lista.elemento(tamanio));
			if (tamanio > 1) {
				listaReversa(lista,--tamanio);
			}
		}
	public static void main(String[] args) {
		//arguments = 5 34 20 1 2;
		ListaDeEnteros lista = new ListaDeEnterosConArreglos();
		for(String item:args) {
			Integer numero = Integer.parseInt(item);
			lista.agregarFinal(numero);
		}
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());	
		}
		listaReversa(lista,lista.tamanio());
	}

}
