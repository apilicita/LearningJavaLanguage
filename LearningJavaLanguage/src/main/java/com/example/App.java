package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	static final int TOTAL_ELEMENTOS = 100;

	public static void main(String[] args) {

		/*
		 * ¿Que es un Array?
		 * 
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
		 * 
		 * Es un identificador que, a direncia de una variable, hace referencia a una
		 * zona en la memoria RAM donde se almacenan un conjunto de valores del mismo
		 * tipo de dato.
		 * 
		 * Un array, una vez creado, es de tamaño fijo, se pueden modificar sus
		 * elementos pero no se puede aumentar ni disminuir la cantidad de elementos del
		 * array
		 * 
		 * Para acceder a los elementos de un array se utiliza un indice, entre
		 * corchetes, que se inicia en el valor cero
		 */

		/*
		 * Supongamos que tenemos una aplicacion que maneja nombres, si por cada nombre
		 * creamos una variable, seria bastante engorroso recorrer todos los nombres a
		 * traves de los nombres de las variables, ademas de lo complicado que seria
		 * darle mantenimiento a una aplicacion de este tipo
		 */

		String nombre1 = "Carolina";
		String nombre2 = "Jorge";
		String nombre3 = "Dani";

		/* ¿Como declarar un array con los elementos anteriores? */

		String[] nombres = { "Carolina", "Jorge", "Dani" };

		/* A continuacion declaramos un array de numeros enteros primitivos */

		int[] numeros = { 1, 2, 3, 4, 5 };

		/* Mostrar por consola la cantidad de elementos que tiene el array numeros */
		System.out.println("El array numeros tiene: " + numeros.length + " elementos");

		/* Para mostrar el primer elemento del array numeros */
		System.out.println("El primer elemento del array seria: " + numeros[0]);

		/*
		 * numeros es un array de tamaño fijo, puedo modificar sus elementos paro no
		 * agregar ni eliminar ninguno
		 */

		// modificar el primer elemento del array
		numeros[0] = 100;

		System.out.println(numeros[0]);

		/*
		 * Crear arrays reservando en memoria espacio para los elementos que tendra el
		 * array posteriormente
		 */
		int[] numeros2 = new int[10];

		System.out.println("El array numeros2 tiene: " + numeros2.length + " elementos");
		System.out.println("El primer elemento del array numeros2 es: " + numeros2[0]);

		/*
		 * Creando un array de Persona, es decir, un array donde cada elemento del array
		 * es de un tipo Persona
		 */

		Persona[] personas = { 
				
				Persona.builder()
				.nombre("Jorge")
				.primerApellido("Pascual")
				.segundoApellido("Ramirez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
				.salario(3500.50)
				.build(), 
				
				Persona.builder()
				.nombre("Sebastian")
				.primerApellido("Sanjuanelo")
				.segundoApellido("Arrieta")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1))
				.salario(2450.70)
				.build(), 
				
				Persona.builder()
				.nombre("Alex Eduardo")
				.primerApellido("Pilicita")
				.segundoApellido("Changoluisa")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11))
				.salario(4800.46)
				.build(), 
				
				Persona.builder()
				.nombre("Javier")
				.primerApellido("Jurado")
				.segundoApellido("Moran")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
				.salario(4500.50)
				.build(), 
				
				Persona.builder()
				.nombre("Rodrigo")
				.primerApellido("Rivero")
				.segundoApellido("Fernandez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
				.salario(3760.40)
				.build() 
			};
		
		/* OPERADORES */
		
		/* Operadores aritmeticos, que son: +, -, *, /, % 
		 * 
		 * De anteriores operadores vamos a ejemplificar, a continuacion, el
		 * operador % (utilizado, entre otras cosas, para saber si un numero 
		 * es para o no) 
		 * 
		 * Vamos a implementar una sentencia de control de flujo, que no existe en SQL
		 * que es la sentencia for, que se utiliza para recorrer los elementos de un
		 * array, porque se conoce a priori la contidad de elementos del erray 
		 * 
		 * Primero utilizaremos la sentencia for clasica y posteriormente la sentencia
		 * for mejorado (mal llamado for each) */
		
		/* El Ejemplo, concretamente seria:
		 * 
		 * 1- Declarar un array de 100 elementos
		 * 2- Agregarle valores al array 
		 * 3- Recorrer el array y solamente mostrar los elementos que sean pares.
		 * */
		
		// Declaracion del array de 100 elementos
		
		int[] numerosEnteros = new int[TOTAL_ELEMENTOS];
		
		// Recorrer el array numerosEnteros y asignar a cada elemento un valor entre 1
		// y 100
		
//		for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i = i + 1) {
//			
//			numerosEnteros[i] = i + 1;
//		}
		
		/* La expresion i = i + 1 da lugar al operador de auto incremento
		 * que seria i++ *
		 * 
		 * 
		 * NOTA IMPORTANTE!!!
		 * 
		 * Cuando el operador de auto incremento (++) o tambien auto decremento (--)
		 * esta solo en una sentencia da lo mismo que vaya delante de la variable o detras, 
		 * es decir, ++i; es lo mismo que i++;
		 * 
		 * Pero, cuando el operador de auto incremento o auto decremento esta en una expresion
		 * aqui si importa el orden, por ejemplo
		 * 
		 * ++i * 25; Primero incrementa el valor de la i y luego lo multiplica por 25
		 * i-- * 25; Premero decrementa el valor de la i y luego la multiplica por 25
		 * */
		
		for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i++) {
			
			numerosEnteros[i] = i + 1;
		}
		
		// Mostrar los elementos del array original. Y aqui vamos a utilizar 
		// una SENTENCIA FOR MEJORADA
		
		System.out.println("----------- Array Original ----------------");
		
		for ( int numeroEntero : numerosEnteros)
			System.out.println(numeroEntero);
		
		/*
		 * Utilizando una sentencia for clasica, recorrer el array numerosEnteros
		 * y mostrar solamente los que sean pares */
		
		System.out.println("----------- Elementos que son par del array original ---------");
		
		for (int i = 0; i <= TOTAL_ELEMENTOS - 1; i++) {
			if (numerosEnteros[i] % 2 == 0) {
				// Si entramos en este bloque (llave de apertura y llave de cierre)
				// quiere decir que el elemento del array numerosEnteros es par
				System.out.println(numerosEnteros[i]);
			}
		}
		
		/*
		 * 
		 * Ejercicio # 3.

			1- Comitear los cambios actuales del proyecto LearningJavaLanguage, 
			poner como comentario, por ejemplo, “antes de realizar el ejercicio 3” 

			2- Utilizar un bucle for mejorado para mostrar los elementos que 
			son impares del array numerosEnteros y 
			contar la cantidad de números impares encontrados
		*/
		
	}
}












