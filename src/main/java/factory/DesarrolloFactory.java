package factory;

public class DesarrolloFactory implements TareaFactory {
    public Tarea crearTarea() {
        return new TareaDesarrollo();
    }
}
