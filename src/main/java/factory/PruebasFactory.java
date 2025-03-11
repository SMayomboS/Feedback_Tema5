package factory;

public class PruebasFactory implements TareaFactory {
    public Tarea crearTarea() {
        return new TareaPruebas();
    }
}
