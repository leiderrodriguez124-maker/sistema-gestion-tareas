public class Main {

    public static void main(String[] args) {

        System.out.println("=== Sistema de Gestión de Tareas ===\n");

        // 1. Crear la cola
        ColaTareas cola = new ColaTareas();

        // 2. Agregar tareas
        System.out.println("Agregando tareas a la cola...\n");

        cola.encolar(new Tarea(1, "Corregir bug en login", "Carlos", 3));
        cola.encolar(new Tarea(2, "Actualizar documentación", "Ana", 1));
        cola.encolar(new Tarea(3, "Implementar API REST", "Luis", 3));
        cola.encolar(new Tarea(4, "Revisar código", "María", 2));
        cola.encolar(new Tarea(5, "Optimizar base de datos", "Pedro", 3));

        // 3. Mostrar la tarea del frente
        System.out.println("\nPróxima tarea a realizar:\n");
        System.out.println(cola.verFrente());

        // 4. Atender dos tareas
        System.out.println("\nAtendiendo primera tarea...");
        cola.desencolar();

        System.out.println("Atendiendo segunda tarea...");
        cola.desencolar();

        // 5. Buscar tareas con prioridad alta
        cola.buscarPorPrioridad(3);

        // 6. Mostrar tareas pendientes
        System.out.println("\nTareas pendientes: " + cola.contarTareas());
    }
}
