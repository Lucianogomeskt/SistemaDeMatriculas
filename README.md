# Sistema de Matrículas (Spring Boot + Oracle)

Este projeto é a evolução de um sistema inicial baseado em `ArrayList`, agora migrado para uma arquitetura robusta utilizando **Spring Boot** e persistência de dados no **Oracle Database**.

## Tecnologias Utilizadas
* Java 17/21
* Spring Boot 3+ (Web, DevTools)
* JDBC / Oracle Driver (Persistência de dados)
* Maven (Gerenciamento de dependências)
* Thymeleaf (Interface Web dinâmica)
* Bootstrap 5 (Estilização e Responsividade)

 ## 🎨 Interface e Experiência do Usuário
* Design Responsivo: O sistema se adapta a diferentes tamanhos de tela graças ao uso do Framework Bootstrap.

## Estrutura do Projeto
O projeto segue o padrão de camadas para melhor organização e manutenção:
* `controller`: Gerenciamento das rotas e requisições HTTP.
* `service`: Regras de negócio do sistema.
* `dao`: Camada de acesso a dados (Data Access Object).
* `model`: Classes de entidade (Aluno, Curso, Matricula).
* `factory`: Gerenciamento da conexão com o banco de dados.

## Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/Lucianogomeskt/SistemaDeMatriculas.git](https://github.com/Lucianogomeskt/SistemaDeMatriculas.git)
