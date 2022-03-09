#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Renegociar divida
 
  

 Background:
 
 Given que esteja no site "https://www.casasbahia.com.br/hotsite/cartao-casas-bahia.aspx?nid=201406"
 
  Scenario: Renegociar dividas com cpf
    
    
    When Clicar renegociar divida
    And preencher cpf
    Then valido informação



   