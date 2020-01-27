# language: pt
#coding: utf-8

Característica: Pesquisa Produto

@Buscadeprodutos
Cenário: Pagina de Busca Produto
    Dado O usuário fornecido está na página inicial
    Quando o usuário clica na barra de pesquisa
    E digitar o nome do produto
    Então será direcionado para a página produtos
    
@Buscadeprodutoerro    
    Cenário: Pagina de Busca Produto Inexistente
    Dado O usuário fornecido está na página inicial
    Quando o usuário clica na barra de pesquisa
    E digitar o nome do produto invalido
    Então será direcionado para a página produtos não existente