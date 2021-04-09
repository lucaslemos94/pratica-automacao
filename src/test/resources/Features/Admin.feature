#language: pt
@Admin @End2End
Funcionalidade: Admin

	Contexto:
		Dado que o usuario esteja na pagina principal do sistema
		E que o usuario esteja logado
		
		@PesquisarUsuario  @SmokeTest
		Esquema do Cenario: Pesquisar Usuario
			Quando acionar o menu Admin
			E informar o campo de busca Username como "<usuario>"
			E informar o campo de busca User Role como "<perfil>"
			E informar o campo de busca Empployee Name como "<nomeFuncionario>"
			E informar o campo de busca Status como "<situacao>"
			E clicar no botao Search
			Entao o sistema devera apresentar lista com o resultado da busca de acordo com os filtros.
			
			Exemplos:
				
				| usuario | perfil | nomeFuncionario | situacao |
				| Admin		| Admin	 | Christine Tarabay | Enabled |
				| Alice.Duval | ESS | Alice Duval | Enabled |
				| Joe.Root | ESS | Joe Root | Enabled |
				