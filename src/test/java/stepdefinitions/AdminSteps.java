package stepdefinitions;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pageobjects.AdminPage;


public class AdminSteps {
	
	WebDriver driver;
	String usuarioBusca;
	
	@Quando("^acionar o menu Admin$")
	public void acionar_o_menu_Admin() throws Throwable {
	    AdminPage ap = new AdminPage(Hooks.getDriver());
	    ap.menuAdmin();
	    
	}
	

	@Quando("^informar o campo de busca Username como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_Username_como(String arg1) throws Throwable {
		 AdminPage ap = new AdminPage(Hooks.getDriver());
		 usuarioBusca = arg1;
		 ap.preencherUsuarioBusca(arg1);
	}

	@Quando("^informar o campo de busca User Role como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_User_Role_como(String arg1) throws Throwable {
		AdminPage ap = new AdminPage(Hooks.getDriver());
		ap.preencherPerfilBusca(arg1);
		
	}

	@Quando("^informar o campo de busca Empployee Name como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_Empployee_Name_como(String arg1) throws Throwable {
		AdminPage ap = new AdminPage(Hooks.getDriver());
		ap.preencherNomeUsuarioBusca(arg1);
	}

	@Quando("^informar o campo de busca Status como \"([^\"]*)\"$")
	public void informar_o_campo_de_busca_Status_como(String arg1) throws Throwable {
		AdminPage ap = new AdminPage(Hooks.getDriver());
		ap.preencherSituacaoBusca(arg1);
	}

	@Quando("^clicar no botao Search$")
	public void clicar_no_botao_Search() throws Throwable {
		AdminPage ap = new AdminPage(Hooks.getDriver());
		ap.clicarBotaoPesquisar();
	}

	@Entao("^o sistema devera apresentar lista com o resultado da busca de acordo com os filtros.$")
	public void o_sistema_devera_aprensentar_lista_com_o_resultado_da_busca_de_acordo_com_os_filtros() throws Throwable {
		AdminPage ap = new AdminPage(Hooks.getDriver());
		ap.validarLinkUsuario(usuarioBusca);
	}


}
