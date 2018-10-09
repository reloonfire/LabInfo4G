package javaOO;

import java.util.Scanner;

public class Principale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Persona p;
		Archivio a = new Archivio(10);
		
		a.aggiungiPersona(new Persona("Alfonso","Mazzarella"));
		a.aggiungiPersona(new Persona("Lorenzo","Avallone"));
		p = a.cerca(sc.nextLine());
		System.out.println(p.nome);
	}
}
