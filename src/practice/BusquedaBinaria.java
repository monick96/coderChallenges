package practice;

public class BusquedaBinaria {
    // Función para realizar la búsqueda binaria en una lista ordenada
    static int busquedaBinaria(String[] lista, String elemento) {
        int inicio = 0;
        int fin = lista.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            // Compara el elemento en el medio con el elemento buscado
            int comparacion = elemento.compareTo(lista[medio]);

            // Si el elemento está en el medio, devuelve la posición
            if (comparacion == 0) {
                return medio;
            }

            // Si el elemento es menor, busca en la mitad izquierda
            if (comparacion < 0) {
                fin = medio - 1;
            }
            // Si el elemento es mayor, busca en la mitad derecha
            else {
                inicio = medio + 1;
            }
        }

        // Si el elemento no está en la lista, devuelve -1
        return -1;
    }

    public static void main(String[] args) {
        // Lista de apellidos ordenada alfabéticamente
        String[] listaApellidos = {"Brown", "Johnson", "Miller", "Smith", "Taylor", "Williams", "Young"};

        // Elemento que deseas buscar
        String apellidoBuscado = "Young";

        // Realiza la búsqueda binaria
        int posicion = busquedaBinaria(listaApellidos, apellidoBuscado);

        // Muestra el resultado
        if (posicion != -1) {
            System.out.println("El apellido '" + apellidoBuscado + "' se encuentra en la posición " + posicion + ".");
        } else {
            System.out.println("El apellido '" + apellidoBuscado + "' no se encuentra en la lista.");
        }
    }
}
