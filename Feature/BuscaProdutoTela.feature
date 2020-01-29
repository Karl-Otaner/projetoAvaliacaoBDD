# language: pt
#coding: utf-8

Funcionalidade: Buscar produto pela tela principal

@SucessoProdutoTela
Cenário: Busca Produto valido pela pagina principal
Dado: O usuario está na pagina principal
Quando escolha o produto pela imagem
E clique no mouse escolhido
Entao vai para a pagina do produto escolhido

@FalhaProdutoEscolhido
Cenário: Busca Produto invalido pela pagina principal
Dado: O usuario está na pagina
Quando o Usuario clicar para ver detalhes do laptop 
Entao Será exibida a página de outro laptop 
