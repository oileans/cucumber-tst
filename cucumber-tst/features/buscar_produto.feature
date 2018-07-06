Feature: Pesquisa de produto na loja. 

Scenario: Pesquisar 
	Given que o usuário já esteja logado 
	When pesquisar o nome de um produto 
	And acessar o detalhe do produto 
	Then será exibido detalhes do produto 
	
  	