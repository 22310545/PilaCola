package actividad1;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> cola = new LinkedList<>();
        Stack<Integer> pila = new Stack<>();
        
        int opcion;
        
        do {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Insertar elemento en la cola");
            System.out.println("2. Insertar elemento en la pila");
            System.out.println("3. Eliminar elemento de la cola");
            System.out.println("4. Eliminar elemento de la pila");
            System.out.println("5. Mostrar contenido de la cola");
            System.out.println("6. Mostrar contenido de la pila");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un elemento para la cola:");
                    int elementoCola = scanner.nextInt();
                    cola.offer(elementoCola);
                    break;
                case 2:
                    System.out.println("Ingrese un elemento para la pila:");
                    int elementoPila = scanner.nextInt();
                    pila.push(elementoPila);
                    break;
                case 3:
                    if (!cola.isEmpty()) {
                        System.out.println("Se eliminó el elemento " + cola.poll() + " de la cola.");
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 4:
                    if (!pila.isEmpty()) {
                        System.out.println("Se eliminó el elemento " + pila.pop() + " de la pila.");
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 5:
                    System.out.println("Contenido de la cola:");
                    if (!cola.isEmpty()) {
                        for (int elemento : cola) {
                            System.out.println(elemento);
                        }
                    } else {
                        System.out.println("La cola está vacía.");
                    }
                    break;
                case 6:
                    System.out.println("Contenido de la pila:");
                    if (!pila.isEmpty()) {
                        for (int i = pila.size() - 1; i >= 0; i--) {
                            System.out.println(pila.get(i));
                        }
                    } else {
                        System.out.println("La pila está vacía.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 0);
        
        scanner.close();
    }
}