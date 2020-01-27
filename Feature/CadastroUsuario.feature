# language: pt
#coding: utf-8
Funcionalidade: Cadastrar Ususario
  Descrição: essa ação, testará a funcionalidade de cadastrar um
  novo usuario e cadastra um usuario já cadastrado.

  Contexto: 
    Dado o usuario esta na pagina inicial do site advantage online shopping
    Quando o usuario clicar em botao de login
    E o usuario clicar em criar conta
 

  @Sucesso
  Cenario: Cadastrar usuario com dados Validos
    E Fazer o cadastro da nova conta
 		Entao validar o retorno a pagina inicial
 		
 	@Falha
  Cenario: Cadastrar usuario ja cadastrado
    E Fazer o cadastro ja existente
    Entao validar mensagem de usuario ja cadastrado

 