package com.example;

import java.time.LocalDate;
import java.time.Month;

public class App {
	
	static String printObject(Object obj) {
		
		/* Recibe como parametro un object y en dependencia del tipo imprimira el salario
		 * si se trata de un empleado o el total de asignaturas si se tratase de un 
		 * estudiante */
		
		/* Utilizando los beneficios de Pattern Matching */
		
		if (obj instanceof Empleado empleado) {
			
			// Empleado empleado = (Empleado) object;
			
	
			return "Salario del empleado: " + empleado.getSalario();
		} else if (obj instanceof Estudiante estudiante) {
			
			// Estudiante estudiante = (Estudiante) object;
			
			return "Total de asignaturas del estudiante: " +
			estudiante.getTotalAsignaturas();
		} else {
			return "No es ni empleado ni estudiante";
		}
		
	}
	
	public static void main(String[] args) {

			Persona[] personas = { 
				
				Persona.builder()
				.nombre("Jorge")
				.primerApellido("Pascual")
				.segundoApellido("Ramirez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1995, Month.JANUARY, 10))
				.build(), 
				
				Persona.builder()
				.nombre("Sebastian")
				.primerApellido("Sanjuanelo")
				.segundoApellido("Arrieta")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2000, Month.DECEMBER, 1))
				.build(), 
				
				Persona.builder()
				.nombre("Alex Eduardo")
				.primerApellido("Pilicita")
				.segundoApellido("Changoluisa")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1997, Month.SEPTEMBER, 11))
				.build(), 
				
				Persona.builder()
				.nombre("Javier")
				.primerApellido("Jurado")
				.segundoApellido("Moran")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(2005, Month.OCTOBER, 25))
				.build(), 
				
				Persona.builder()
				.nombre("Rodrigo")
				.primerApellido("Rivero")
				.segundoApellido("Fernandez")
				.genero(Genero.HOMBRE)
				.fechaNacimiento(LocalDate.of(1992, Month.NOVEMBER, 4))
				.build() 
			};
			
			/* El Operador instanceof se utiliza para saber si una variable de referencia 
			 * o de objeto es una instancia de un tipo, es decir, de una clase concreta */
			
			Persona p1 = new Persona();
			
			Estudiante e1 = new Estudiante();
			
			e1.setTotalAsignaturas(10);
			
			Empleado emp1 = new Empleado();
			
			emp1.setSalario(3450.25);
			
			/* Invocar o llamar el metodo printObject */
			
			
		   	System.out.println("El resultado es: " + printObject(p1));
		   	System.out.println(printObject(e1));
		   	System.out.println(printObject(emp1));
		   	
		   	/* Ejercicio de la actividad del miercoles 15 de Abril 
		   	 * 
		   	 * 1 - Crear un array de Objetos y agregarle elementos de tipo Empleado
		   	 * y Estudiante. Tres empleados, dos del genero HOMBRE y uno del genero
		   	 * MUJER o OTRO,  y tres estudiantes, con todas las propiedades
		   	 * de Persona en ambos casos
		   	 * 
		   	 *  2- Recorrer o Iterar el array utilizando una sentencia for mejorado 
		   	 *  y para los estudiates obtener la media de las asignaturas matriculadas,
		   	 *  y para los empleados obtener el salario medio de los empleados del genero 
		   	 *  HOMBRE 
		   	 *  
		   	 *  Se sugiere utilizar Pattern Matching con instanceof en el momento de 
		   	 *  recorrer/iterar el array */
		   	
		   	
		   	
	}
}












