# language: pt

Funcionalidade: Cadastrar Ususario
Descrição: essa ação, testará a funcionalidade de cadastrar um
novo usuario e cadastra um usuario já cadastrado.

Contexto:
	Dado o usuario esta na pagina inicial do site advantage online shopping
	Quando o usuario clicar em botao de login
	E Aguardar um tempo para carregar a pagina
	
@Sucesso
	Cenario: Cadastrar usuario com dados Validos
	E o usuario clicar em criar conta
	E Preencher formulario de cadastro
	E Clicar no botao de registro
	Entao Validar se retornou a pagina principal
	
@Falha
	Cenario: Fazer login com dados incorretos
	E usuario digitar Login e Senha
	| usuario     | senha  |
	| NomeUsuario | 123456 |
	E clicar no botao Sing in
	Entao validar mensagem de usuario ou senha  incorretos
	