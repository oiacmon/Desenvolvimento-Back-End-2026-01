package BackEnd.Trabalho02.QuintaQuestao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleControllerTest {

    @Test
    void deveRetornarEquilatero() {
        TriangleController controller = new TriangleController();

        TriangleRequest req = new TriangleRequest();
        req.lado1 = 5;
        req.lado2 = 5;
        req.lado3 = 5;

        String resultado = controller.triangleType(req);

        assertEquals("Equilátero", resultado);
    }

    @Test
    void deveRetornarIsosceles() {
        TriangleController controller = new TriangleController();

        TriangleRequest req = new TriangleRequest();
        req.lado1 = 5;
        req.lado3 = 8;
        req.lado2 = 5;

        String resultado = controller.triangleType(req);

        assertEquals("Isósceles", resultado);
    }

    @Test
    void deveRetornarEscaleno() {
        TriangleController controller = new TriangleController();

        TriangleRequest req = new TriangleRequest();
        req.lado1 = 4;
        req.lado2 = 5;
        req.lado3 = 6;

        String resultado = controller.triangleType(req);

        assertEquals("Escaleno", resultado);
    }

    @Test
    void deveRetornarNaoTriangulo() {
        TriangleController controller = new TriangleController();

        TriangleRequest req = new TriangleRequest();
        req.lado1 = 1;
        req.lado2 = 2;
        req.lado3 = 10;

        String resultado = controller.triangleType(req);

        assertEquals("Não é um triângulo", resultado);
    }
}