package test;

import main.Parametros;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarUsuario() {
        Parametros.getInstance().setUsuario("arthur.dornelas");
        assertEquals("arthur.dornelas", Parametros.getInstance().getUsuario());
    }

    @Test
    public void deveRetornarConta() {
        Parametros.getInstance().setConta("53256736-21");
        assertEquals("53256736-21", Parametros.getInstance().getConta());
    }
}
