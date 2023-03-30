package tests;
import tp02.ejercicio2.*;
import java.util.Scanner;
public class TestListaEnlanzadaGenerica {

	public static void main(String[] args) {
		ListaEnlazadaGenerica<Estudiante> lista = new ListaEnlazadaGenerica<Estudiante>();
		Scanner s= new Scanner(System.in);
		
		for (int i = 0;i < 4;i++) {
			Estudiante e = new Estudiante();
			System.out.println("Ingrese el nombre del estudiante: ");
			e.setNombre(s.nextLine());
			System.out.println("Ingrese el apellido del estudiante: ");
			e.setApellido(s.nextLine());
			System.out.println("Ingrese comision del estudiante: ");
			e.setComision(s.nextLine());
			System.out.println("Ingrese email del estudiante");
			e.setEmail(s.nextLine());
			System.out.println("Ingrese direccion del estudiante");
			e.setDireccion(s.nextLine());
			lista.agregarFinal(e);
		}
		lista.comenzar();
		while (!lista.fin()) {
			System.out.println(lista.proximo().tusDatos());
		}
	}

}
