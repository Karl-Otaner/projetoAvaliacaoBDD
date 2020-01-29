# language: pt
#coding: utf-8
Funcionalidade: Buscar produto pela Lupa

 

  @Buscadeproduto @Valido
  Cenário: Pagina de Busca Produto Valido
    Dado O usuário está na página inicial
    Quando o usuário clica na barra de pesquisa
    E digitar o nome do produto Valido
    Então será direcionado para a página produtos

  @Buscadeproduto @Invalido
  Cenário: Pagina de Busca Produto Inexistente
    Dado O usuário está na página inicial
    Quando o usuário clica na barra de pesquisa
    E digitar o nome do produto invalido
    Então Valida a mensage que o produto não existe


