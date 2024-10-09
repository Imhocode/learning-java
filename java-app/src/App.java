import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * 
         *  este comentario es de varias lineas
         * 
        */

        // Este es un comentario de una sola linea 

        // VARIABLE: es un esapcio de memoria que tiene un nombre asociado y puede contener un valor cambiente
        // DECLARACION: asignar el tipo de dato y el nombre de la varibale sin darle un valor inicial
        // ASIGNACION: asignar el tipo de dato y el nombre de la variable dandole o no un valor inicial
        // DEFINICION: darle un valor a la variable ya declarada


        // TIPOS DE VARIABLES:
        // VARIABLES PRIMITIVAS: alamacenan valores basicos
        // VARIABLES DE REFERENCIA: Almacenan direcciones de memoroia que apuntan a objetos

        // TIPO DE DATOS ENTEROS: byte(-128 al 127), short(-32768 al 32767), int, long    
       // int numero = 5;

        // TIPO DE DATOS REALES: float(6 deciamles) y el double
      //  double decima = 1.555;

        // TIPO DE DATOS CARACTER
        // char letra = 'a';

         // TIPO DE DATO BOOLEANO
       //  boolean v = true;
        // boolean f = false;

        // STRING cadena de caracteres
       // String cadena = "PRUEBA";


       /* String texto = "   esto Es una prueba de un string   ";
        System.out.println(texto);

        int longitud = texto.length();
        System.out.println(longitud);

        char caracter = texto.charAt(0);
        System.out.println(caracter);

        String subCadena = texto.substring( 0, 8);
        System.out.println(subCadena);
        
        String minuscula = texto.toLowerCase();
        System.out.println(minuscula);

        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        int indice = texto.indexOf("prueba");
        System.out.println(indice);

        String reemplazar = texto.replace("prueba", "hola");
        System.out.println(reemplazar);

        boolean contiene = texto.contains("hola");
        System.out.println("esto tiene la palabra indicada? " + contiene);

        String sinEspacios = texto.trim();
        System.out.println(sinEspacios);
        
        */

        // OPERADIRES: simbolos que sirven para hacer operaciones con varaibles o valores
        // ARITMETICOS

        /*int a = 5;
        int b = 4;
        int c = a- b;
        System.out.println(c);
        */

        /* 
        int a = 13;
        int b = a % 2; // EL % o resto nos puede ayduar a ver si un numero es par o impar
        System.out.println(b);
        */

        //Asignacion
       /* int c = 5;
        c=10;
        c+=15;
        c+=25;
        c-=12;
        c*= 2;
        c/=10;
        c++;
        c++;
        c++;
        c--;
         */

            //OPERADORES DE COMPARCION
            /* 
         int a = 3;
         int b = 5;
         boolean esMayor = a> b;
        boolean esIgual = a ==b;
         System.out.println(esMayor);
*/

        //OPERADORES DE LOGICA

       /*  boolean condicion1 = true;
        boolean condicion2 = false;
        
        boolean resultadoAND =  condicion1 && condicion2; // ambos deben ser positivos para que de true
        boolean resultadoOR = condicion1 || condicion2; // uno de los dos debe ser positivo para que de true
        boolean resultadoNOT = !condicion1; // lo opouesto a lo que tenga asignado previamente 
        */
          
         // que tipo de bebida te gusta
       /*   String bebida = "gaseosa";
         switch (bebida) {
            case "cafe":
                System.out.println("Buena eleccion");
                break;
            case "mate":
            System.out.println("debes ser de otro pais");
            default:
                System.out.println("no reconozco esa bebida");
                break;
         }
         if (bebida == "cafe") {
            System.out.println("buena elecion");
         } else if (bebida == "Mate") {
            System.out.println("debe ser de otro pais");

         } else if (bebida == "gaseosa"){
            System.out.println("ten cuidaod con el ezucxa");

         } else if (bebida == "vino"){
            System.out.println("no conduzacas");
         }*/

         /*Scanner scanner = new Scanner(System.in);

         System.out.println("Bienvenido a la maquina de bebida:");
         System.out.println("1. vino");
         System.out.println("2. gasesosa");
         int opcion = scanner.nextInt();

         switch (opcion) {
            case 1:
                System.out.println("Buena eleccion vino");
                break;
            case 2:
            System.out.println("debes ser de otro pais con gaseosa");
            default:
                System.out.println("no reconozco esa bebida");
                break;

                }
            System.out.println("disfruta de tu bebida");
            scanner.close();*/

// FOR : Inicializacion d eun variable; condicion, actulizacion
     /*   for(int i = 1; i <= 10; i++){
            for(j=1; j <=5; j++){}
            System.out.println(i);
            System.out.println();
        }
        }*/


// WHILE
/* 
        int contador = 1;
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }
        */

        // DO WHILE
/* 
        int contador = 1;

        do {
            System.out.println("esto sucede primero");
            System.out.println(contador);

            // actulizacion de la varaible para que no sea un bucle eterno
            contador++;
        } while (contador <= 5);*/
/*int i ;
        for(i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5) 
            break;{ // sirve para cortar el bucle antes de que llegue  la condicion
                continue; // salta las lineas que continuan de las llaaves del for
                return; // para cerrar funciones
            }
        }*/

            // ARREGLOS: estrucwturas de datos que tiene valores del mismo tipo bajo un mismo nombre
            // Estos valores se distribuyen secucialmente en la memoria y se ouede accer a ellos meidant eu  indice
            // los arreglos son tambiien llamados vectores o matrices

            // EL INDICE SE EMPIEZA A CONTAR DSDE 0 Y NO DESDE 1
 /*           int [] numeros = {10,20,30,40,50};
             numeros [3] = 80;

            for (int index = 0; index < numeros.length; index++){
                System.out.println(numeros[index]);
            }
            
*/

// para saber cuantas letras tiene una palabra
/* 
         String palabra = "hola";
         System.out.println(palabra.length());
*/

        //                              JUEGO AHORCADO

        // CLASE SCANNER QUE NOS PERMITA QUE EL USUARIO ESCRIBA
        Scanner scanner = new Scanner(System.in);

        // DECLARACIONES Y ASIGNACIONES
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinida = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // ESTRUCTURA DE CONTROL bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // ESTRUCTURA DE CONTROL bucle

        while (!palabraAdivinida && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "( " + palabraSecreta.length() + "letras)");
            System.out.println("Introduce una letra");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta =  true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto te queda: " + (intentosMaximos - intentos) + " intentos");                
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinida = true;
                System.out.println("Felicidades: " + palabraSecreta);
            }
        }
        if(!palabraAdivinida){    System.out.println(" que pena te quedaste sin intentos");}
    scanner.close();
























    }
}
