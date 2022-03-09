#Author: e2etreinamentos@e2etreinamentos.com.br

Feature: Cartao Casas Bahia
Como usuario quero validar aba cartoes 
  

 Background:
 
 Given que esteja no site "https://www.bradescard.com.br/SiteBradescard/solicitacoes"
 
  Scenario: Canal de solicitacoes
    
    
    When Clicar cookies
    And Entre no canal solicitacoes
    And Clico em sugestoes
    And Preencho campos
    Then envio solicitacao



  