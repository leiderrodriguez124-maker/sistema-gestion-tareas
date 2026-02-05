public class Tarea {

    // Atributos privados
    private int id;
    private String titulo;
    private String programador;
    private int prioridad;

    // Constructor
    public Tarea(int id, String titulo, String programador, int prioridad) {
        this.id = id;
        this.titulo = titulo;
        this.programador = programador;
        this.prioridad = prioridad;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getProgramador() {
        return programador;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Mostrar información de la tarea
    @Override
    public String toString() {
        String nivel = "";
        switch (prioridad) {
            case 1:
                nivel = "Baja";
                break;
            case 2:
                nivel = "Media";
                break;
            case 3:
                nivel = "Alta";
                break;
        }

        return "ID: " + id +
               " | Título: " + titulo +
               "\nProgramador: " + programador +
               " | Prioridad: " + nivel + " (" + prioridad + ")";
    }
}
