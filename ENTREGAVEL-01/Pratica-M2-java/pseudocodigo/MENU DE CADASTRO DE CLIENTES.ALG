Algoritmo "MENU DE CADASTRO DE CLIENTES"
//  
//  
//
//
Var
   nome : vetor [1..3] de caractere
   cpf  : vetor [1..3] de real
   email : vetor [1..3] de caractere
   telefone : vetor [1..3] de caractere
   endereco : vetor [1..3] de caractere
   destino : vetor [1..3] de caractere
   i, opcao : inteiro


Inicio

   escreval("==== CADASTRO DE CLIENTES ====")

   Para i de 1 ate 3 faca
      escreval()
      escreval("CLIENTE Nº",i)
      escreval("NOME: ")
      leia(nome[i])
      escreval()
      escreval("CPF:")
      leia(cpf[i])
      escreval()
      escreval("E-MAIL:")
      leia(email[i])
      escreval()
      escreval("TELEFONE:")
      leia(telefone[i])
      escreval()
      escreval("ENDEREÇO:")
      leia(endereco[i])
      escreval("DESTINO:")
      leia(destino[i])
   Fimpara
   escreval()

   escreval("==== DADOS CADASTRADOS ====")
   Para i de 1 ate 3 faca
      escreval()
      escreval("NOME: ", nome[i])
      escreval("CPF: ", cpf[i])
      escreval("E-MAIL: ", email[i])
      escreval("TELEFONE: ", telefone[i])
      escreval("ENDEREÇO: ", endereco[i])
      escreval("DESTINO: ", destino[i])
   Fimpara
Fimalgoritmo