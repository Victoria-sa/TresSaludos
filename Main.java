package main;

import java.util.Iterator;

public class Main {

	public Main() {
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.out.println("Primera llamada a tresSaludos");
		
		System.out.println("Primera llamada a tresSaludos");
		tresSaludos();
		System.out.println("Segunda llamada a tresSaludos");
		tresSaludos();
		System.out.println("Tercera llamada a tresSaludos");
		tresSaludos();
		despedida();
	}

	static void tresSaludos () {
			System.out.println("...");
			for (int i=1; i<=3; i++) {
			System.out.println("**Hola**");
			}
	}
	
	static void despedida() {
	
		System.out.println("....");
		System.err.println( "Adios....");
	}
}
	

