public class ColaTareas {

    // Atributos privados
    private Tarea[] cola;
    private int frente;
    private int fin;
    private int contador;
    private final int CAPACIDAD = 20;

    // Constructor
    public ColaTareas() {
        cola = new Tarea[CAPACIDAD];
        frente = 0;
        fin = -1;
        contador = 0;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return contador == 0;
    }

    // Verifica si la cola está llena
    public boolean estaLlena() {
        return contador == CAPACIDAD;
    }

    // Encolar una tarea
    public void encolar(Tarea tarea) {
        if (estaLlena()) {
            System.out.println("⚠ La cola está llena, no se puede agregar más tareas.");
            return;
        }
        fin = (fin + 1) % CAPACIDAD;
        cola[fin] = tarea;
        contador++;
        System.out.println("✓ Tarea agregada: " + tarea.getTitulo());
    }

    // Desencolar una tarea
    public Tarea desencolar() {
        if (estaVacia()) {
            System.out.println("⚠ La cola está vacía.");
            return null;
        }
        Tarea tarea = cola[frente];
        frente = (frente + 1) % CAPACIDAD;
        contador--;
        return tarea;
    }

    // Ver la tarea del frente
    public Tarea verFrente() {
        if (estaVacia()) {
            return null;
        }
        return cola[frente];
    }

    // Contar tareas
    public int contarTareas() {
        return contador;
    }

    // 🔍 PUNTO 2: Buscar por prioridad
    public void buscarPorPrioridad(int prioridad) {
        if (estaVacia()) {
            System.out.println("No hay tareas en la cola.");
            return;
        }

        int encontrados = 0;
        System.out.println("\nBuscando tareas con prioridad " + prioridad + ":");

        for (int i = 0; i < contador; i++) {
            int indice = (frente + i) % CAPACIDAD;
            if (cola[indice].getPrioridad() == prioridad) {
                System.out.println("- " + cola[indice].getTitulo() +
                        " (" + cola[indice].getProgramador() + ")");
                encontrados++;
            }
        }

        if (encontrados == 0) {
            System.out.println("No se encontraron tareas con esa prioridad.");
        } else {
            System.out.println("Total encontradas: " + encontrados + " tareas");
        }
    }
}
