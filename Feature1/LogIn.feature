# language: pt

Funcionalidade: Cadastrar Ususario
Descrição: essa ação, testará a funcionalidade de cadastrar um
					novo usuario e cadastra um usuario já cadastrado.

Contexto:
	Dado o usuario esta na pagina inicial do site advantage online shopping
	Quando o usuario clicar em botao de login
	
@TestCriarNovoUsuario
	Cenario: Cadastrar usuario com dados Validos
	E o usuario clicar em criar conta
	E Preencher formulario de cadastro
	E Clicar no botao de registro
	Entao Validar se retornou a pagina principal
	
@TestCriarNovoUsuarioJaCadastrado
	Cenario: Fazer login com dados incorretos
	E o usuario deve preencher o campo de Login
	E o ususario deve preencher o campo de senhoa
	Mas o login ou a senha estao incorretos
	Entao validar mensagem de usuario ou senha  incorretos