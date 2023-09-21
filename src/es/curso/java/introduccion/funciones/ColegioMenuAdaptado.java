package es.curso.java.introduccion.funciones;

import java.util.Scanner;

import es.curso.java.introduccion.utils.Utilidades;

public class ColegioMenuAdaptado {
	   final static String OPCIONES_MENU = "1. Insertar Alumno.:"
			+ "2. Mostrar Alumnos por Aula:"
			+ "3. Mostrar todos los alumnos aprobado del colegio:"
			+ "4. Buscar Alumno:"
			+ "5. Borrar Alumno:"
			+ "6. Salir";
	
       public static void main(String[] args)
       
       {
    	  
    	   String texto="Introduce el número de aulas del colegio";
    	   int numAulas=Utilidades.pideDatoNumerico(texto); 
   		   String [][] colegio = new String[numAulas][];
   		   
   		   for(int i=0;i<numAulas;i++) {
   	    	   texto="Introduce el número de alumnos del aula";
   			   int numAlumnos=Utilidades.pideDatoNumerico(texto);
   			   colegio[i] = new String[numAlumnos]; }
   		   
   		   String menu ="1 opeieei, 2jdfifidf";
   		   Utilidades.pintarMenu(menu);

//   		int opcion = 0;
//   		do {
//   			opcion = Utilidades.pintarMenu(OPCIONES_MENU,"Introduce valor (1-6)",":");
//   			
//   			switch (opcion) {
//   				case 1: //Insertar alumnos
//   					//Pedimos el aula donde se va a insertar el alumno
//   				 int numAula=Utilidades.pideDatoNumerico(texto="En qué aula quieres insertarlo? 1-"+colegio.length);
//   					String[] aula = colegio[numAula-1];
//   					
//   					boolean claseLlena = true;
//   					for (int i = 0; i < aula.length; i++) {
//   						if (aula[i]==null) {
//   							System.out.println("Posición "+(i+1)+ " libre");
//   							claseLlena=false;
//   							scan = new Scanner(System.in);
//   							System.out.println("Introduce el nombre");
//   							String nombre = scan.nextLine();
//   							
//   							scan = new Scanner(System.in);
//   							System.out.println("Introduce el dni");
//   							String dni = scan.nextLine();
//   							
//   							scan = new Scanner(System.in);
//   							System.out.println("Introduce la nota");
//   							String nota = scan.nextLine();
//   							
//   							aula[i]=nombre+":"+dni+":"+nota;
//   							//colegio[numAula-1][i]=nombre+":"+dni+":"+nota;
//   							break;
//   						}
//   					}
//   					if (claseLlena) {
//   						System.out.println("El aula está llena");
//   					}
//   					
//   					break;
//   				case 2: //Mostrar Alumnos
//   					for (int i=0;i<colegio.length;i++) {
//   						System.out.println("Aula: "+(i+1));
//   						for(int j=0;j<colegio[i].length;j++) {
//   							String datosAlumno = colegio[i][j];
//   							if (datosAlumno!=null) {
//   								String [] datosAlumnosArray = datosAlumno.split(":");
//   								System.out.println("\t"+datosAlumnosArray[0]+ " " 
//   									+datosAlumnosArray[1]+ " "+ datosAlumnosArray[2]);
//   							}
//   						}
//   					}
//   					
//   					
//   					break;
//   				case 3: //Mostrar aprobados
//   					
//   					System.out.println("============ Mostrando alumnos aprobados ============");
////   					for (int i=0;i<colegio.length;i++) {
////   						for(int j=0;j<colegio[i].length;j++) {
////   							String datosAlumno = colegio[i][j];
////   							if (datosAlumno!=null) {
////   								String [] datosAlumnosArray = datosAlumno.split(":");
////   								int nota = Integer.parseInt(datosAlumnosArray[2]);
////   								if (nota>=5) {
////   									System.out.println("\t"+datosAlumnosArray[0]+ " " 
////   											+datosAlumnosArray[1]+ " "+ 
////   											datosAlumnosArray[2]);
////   								}
////   							}
////   						}
////   					}
//   					
//   					
//   					for (String [] aulaFE : colegio) {
//   						for ( String datosAlumno : aulaFE ) {
//   							if (datosAlumno!=null) {
//   								String [] datosAlumnosArray = datosAlumno.split(":");
//   								int nota = Integer.parseInt(datosAlumnosArray[2]);
//   								if (nota>=5) {
//   									System.out.println("\t"+datosAlumnosArray[0]+ " " 
//   											+datosAlumnosArray[1]+ " "+ 
//   											datosAlumnosArray[2]);
//   								}
//   							}
//   						}
//   					}
//   					
//   					
//   					break;
//   				case 4: //Buscar por dni
//   					System.out.println("Introduce el dni del alumno a buscar");
//   					scan = new Scanner(System.in);
//   					String dni = scan.nextLine();
//   					
//   					boolean alumnoEncontrado = false;
//   					for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
//   						for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
//   							String datosAlumno = colegio[i][j];
//   							//Me aseguro de que haya información en esa posición
//   							if (datosAlumno!=null) {
//   								String dniAlumno = datosAlumno.split(":")[1];
//   								if (dni.equalsIgnoreCase(dniAlumno)) {
//   									System.out.println("El alumnos está en el aula "+(i+1));
//   									alumnoEncontrado=true;
//   									//Cuando hemos encontrado para que no sigan los bucles
//   									//Ponemos i y j en sus valores máximos
//   		//								i=colegio.length;
//   		//								j=colegio[i].length;
//   								}
//   							}
//   							
//   						}
//   						
//   					}
//   					if (!alumnoEncontrado) {
//   						System.out.println("El alumno con dni "+dni+" no está en el colegio");
//   					}
//   					
//   					
//   					break;
//   				case 5: //Borrar a partir de un dni
//   					
//   					System.out.println("Introduce el dni del alumno a borrar");
//   					scan = new Scanner(System.in);
//   					dni = scan.nextLine();
//   					
//   					alumnoEncontrado = false;
//   					for (int i=0;i<colegio.length && !alumnoEncontrado ;i++) {
//   						for(int j=0;j<colegio[i].length && !alumnoEncontrado  ;j++) {
//   							String datosAlumno = colegio[i][j];
//   							//Me aseguro de que haya información en esa posición
//   							if (datosAlumno!=null) {
//   								String dniAlumno = datosAlumno.split(":")[1];
//   								if (dni.equalsIgnoreCase(dniAlumno)) {
//   									colegio[i][j]=null;
//   									alumnoEncontrado=true;
//   									System.out.println("Alumno borrado");
//   								}
//   							}
//   							
//   						}
//   						
//   					}
//   					if (!alumnoEncontrado) {
//   						System.out.println("El alumno con dni "+dni+" no está en el colegio");
//   					}
//   					
//   					
//   					break;
//   				case 6: //Salir
//   					System.out.println("Adios");
//   					break;
//   				default:
//   					System.out.println("Opción incorrecta");
//   			
//   			}
//   			
//   			
//   			
//   		}while(opcion!=6);
//   	
   	}


    	
       }

