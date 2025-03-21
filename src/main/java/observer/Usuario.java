package observer;

public class Usuario implements Observador {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Usuario " + nombre + " ha recibido el mensaje: " + mensaje);
    }
}
