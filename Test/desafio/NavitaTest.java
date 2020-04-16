package Test.desafio;

import org.junit.*;
import desafio.Navita;

public class NavitaTest {

    private Navita navita;

    @Before
    public void setUp() {
        navita = new Navita();
    }

    @Test
    public void deveRetornarNumeroIrmao(){

        Integer numero = 1265974;

        Integer solution = this.navita.solution(numero);

        Assert.assertNotNull(solution);
        Assert.assertTrue(solution.equals(9765421));
        Assert.assertFalse(solution.equals(1));

    }

    @Test
    public void naoDeveRetornarNumeroNegativo() {

        int numero = -536255981;

        Integer solution = this.navita.solution(numero);

        Assert.assertNotNull(solution);
        Assert.assertTrue(solution.equals(0));
        Assert.assertFalse(solution.equals(1));

    }

    @Test
    public void deveRetornarZero() {

        int numero = 0;

        Integer solution = this.navita.solution(numero);

        Assert.assertNotNull(solution);
        Assert.assertTrue(solution.equals(0));
        Assert.assertFalse(solution.equals(1));

    }


    @Test
    public void deveRetornarUm() {

        int numero = 100000001;

        Integer solution = this.navita.solution(numero);

        Assert.assertNotNull(solution);
        Assert.assertTrue(solution.equals(1));
        Assert.assertFalse(solution.equals(110000000));

    }

}
