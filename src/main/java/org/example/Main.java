package org.example;
import adapter.*;
import factory.*;
import observer.*;

public class Main {
    public static void main(String[] args) {
        // Prueba de Factory Method
        TareaFactory factory = new DesarrolloFactory();
        Tarea tarea = factory.crearTarea();
        tarea.ejecutar();

        // Prueba de Adapter
        ServicioExterno api = new APIextrerna();
        AdaptadorAPI adaptador = new AdaptadorAPI(api);
        System.out.println(adaptador.obtenerDatosAdaptados());

        // Prueba de Observer
        Notificador notificador = new Notificador();
        Usuario usuario1 = new Usuario("Juan");
        Usuario usuario2 = new Usuario("Ana");

        notificador.agregarObservador(usuario1);
        notificador.agregarObservador(usuario2);

        notificador.notificar("Se ha creado una nueva tarea en el sistema.");
    }
}