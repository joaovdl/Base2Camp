package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
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

        String url = "http://google.com";
        String tituloEsperado = "Google";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        Assert.assertEquals(tituloEsperado,driver.getTitle());
        /*Thread.sleep(5000);     colocar tempo para a pagina fechar*/
        driver.quit();

}
    @Test

    public void validarLinkSiteGoogle(){

        String url = "http://google.com";
        String urlEsperada = "https://www.google.com/?gws_rd=ssl";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        Assert.assertEquals(urlEsperada,driver.getCurrentUrl());
        driver.quit();
    }

    @Test

    public void localizarElementosLoginMantis() {

        String url = "https://mantis-prova.base2.com.br/login_page.php";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        // Elemento de campo para preencher o nome do ususario
        driver.findElement(By.name("username"));

        // Elemento de campo para preencher a senha
        driver.findElement(By.name("password"));

        // Elemento que simboliza o botão
        driver.findElement(By.className("button"));


        driver.quit();
    }
    @Test

    public void localizarElementosLoginMantisXpath(){

        String url = "https://mantis-prova.base2.com.br/login_page.php";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        // ELemento de campo para preencher o nome do usuario
        driver.findElement(By.xpath("//*[@name='username']"));

        // Elemento de campo para preencher a senha
        driver.findElement(By.xpath("//*[@name='password']"));

        // Elemento que simboliza o botão
        driver.findElement(By.xpath("//*[@class='button']"));

        driver.quit();

    }






























}

