package br.com.primecontrol;

import br.com.primecontrol.pages.Cadastro;
import br.com.primecontrol.pages.CriarConta;
import br.com.primecontrol.pages.Login;
import br.com.primecontrol.pages.MenuPrincipal;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import core.Base;
import org.testng.annotations.Test;

public class CriaContaTest extends Base {

    private Login login = new Login();
    private MenuPrincipal menuPrincipal  = new MenuPrincipal();

    @Test
    public void executaCadastroNovaConta() throws GeneralLeanFtException, ReportException, CloneNotSupportedException {
        login.validaTelaLogin();
        login.logar();
        menuPrincipal.selecionaMenu("Adicionar Contas");
        new CriarConta(browser).cadastrarConta();
    }
}
