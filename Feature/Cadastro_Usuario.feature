# language: pt


Funcionalidade: Cadastrar usuario
  
  
   Contexto: 
    Dado O usuário esta na pagina home para cadastro
    Quando Navega para o login
    E clicar em cadastrar novo usuário
  
 @Sucesso
  Cenário: Cadastrar um usuário com sucesso
    E preenche formulario de cadastro
    E Clica no botão de registrar
    Então Valida se retornou a pagina principal
    
  @Falha
  Cenário: Cadastrar um usuário com falha
    E preenche formulario de cadastro falha
    E Clica no botão de registrar 
    Então valida mensagem de usuário incorreto