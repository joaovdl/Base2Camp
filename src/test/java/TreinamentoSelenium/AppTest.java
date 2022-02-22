package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void meuPrimeiroTeste() {

        String fruta = "Pera";

        assertTrue(fruta.equals("Pera"));
    }

    @Test
    public void meuSegundoTeste() {
        String empresa = "Base2";
        String cidade = "Belo Horizonte";
        String carro = "Gol";

        assertTrue(empresa.equals("Base2"));
        assertTrue(cidade.equals("Belo Horizonte"));
        assertEquals(empresa, "Base2");
        assertEquals(10, 6 + 4);
        assertEquals("Testar valor na variavel", carro, "Gol");

    }

    @Test

    public void meuTerceiroTeste() {
        assertEquals(4, 2 + 2);
    }

    @Test

    public void helloWord(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        Assert.assertEquals("Google",driver.getTitle());
        /*Thread.sleep(5000);     colocar tempo para a pagina fechar*/
        driver.quit();

}
}

