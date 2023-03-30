package Ejercicio1punto6;
import tp02.ejercicio1.*;
public class Ejercicio1punto6 {
	public static ListaDeEnterosEnlazada calcularSucesion(int n,ListaDeEnterosEnlazada lista) {
		lista.agregarFinal(n);
		if (n!= 1) {
			if (n % 2 == 0) {
				return calcularSucesion(n/2,lista);
			}
			else {
				return calcularSucesion(3*n + 1,lista);
			}
		}
		else {
			return lista;
		}
	}
	public static int retornaSucesion(int n) {
		if (n != 1) {
			if (n % 2 == 0) {
				System.out.println(n/2);
				return retornaSucesion(n/2);
			}
			else {
				System.out.println(3*n + 1);
				return retornaSucesion(3*n + 1);
			}
		}	
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		retornaSucesion(6);
		lista = calcularSucesion(6,lista);
		lista.comenzar();
		while(!lista.fin()) {
			System.out.println(lista.proximo());
		}
	}

}
