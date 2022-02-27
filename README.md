<h2>Desafio de projeto: Desenvolvimento de testes unitários para validar uma API REST de gerenciamento estoques de cerveja</h2>

<h3>Realização dos testes unitários para validar os processos realizados pelas classes Controller e Service e aplicação do conceito TDD para criação dos
processos de decremento</h3>

Neste desafio de projeto trabalhamos com o framework de testes JUnit e com o auxílio do Hamcrest e Mockito.

Partindo inicialmente do projeto clonado do repositório do instrutor Rodrigo Peleias, no GitHub, realizei os testes unitários
propostos no projeto para acompanhar as explicações iniciais.
Assim como proposto, utilizei do método TDD (Test-driven Development) para o desenvolvimento dos métodos
responsáveis pelo decremento  do estoque de uma cerveja, assim como os tratamentos de exceções  causados
pelos Httpsresponses possíveis.

Como complemento, estanciei uma classe específica para o tratamento da exceção quando uma requisição de
decremento fosse maior que o estoque real.

Com este projeto finalizo o BootCamp da Spread na plataforma da Digital Innovation One.