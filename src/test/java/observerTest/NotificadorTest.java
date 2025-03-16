package observerTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import observer.*;

class NotificadorTest {
    @Test
    void testObserverPattern() {
        Notificador notificador = new Notificador();
        Usuario usuario = new Usuario("Carlos");

        notificador.agregarObservador(usuario);
        assertDoesNotThrow(() -> notificador.notificar("Nueva tarea disponible"));
    }
}