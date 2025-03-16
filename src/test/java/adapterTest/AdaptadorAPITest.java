package adapterTest;

import adapter.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class APIextrerna implements ServicioExterno {
    @Override
    public String obtenerDatos() {
        return "Datos";
    }
}

public class AdaptadorAPITest {
    @Test
    void testAdapter() {
        ServicioExterno api = new APIextrerna();
        AdaptadorAPI adaptador = new AdaptadorAPI(api);
        assertNotNull(adaptador);
        assertEquals("[Adaptado] Datos", adaptador.obtenerDatosAdaptados());
    }
}