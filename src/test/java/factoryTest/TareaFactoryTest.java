package factoryTest;

import factory.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TareaFactoryTest {
    @Test
    void testFactoryMethod() {
        TareaFactory factory = new DesarrolloFactory();
        Tarea tarea = factory.crearTarea();
        assertNotNull(tarea);
    }
}