package adapter;

public class AdaptadorAPI {
    private ServicioExterno servicio;

    public AdaptadorAPI(ServicioExterno servicio) {
        this.servicio = servicio;
    }

    public String obtenerDatosAdaptados() {
        return "[Adaptado] " + servicio.obtenerDatos();
    }
}
