### Descrição do Projeto

**Nome do Projeto**: LibraSys (Sistema de Gerenciamento de Biblioteca)

### Requisitos do Sistema

O sistema de gerenciamento de biblioteca permitirá o controle e administração de livros, membros e empréstimos de uma biblioteca. Ele deve cobrir os seguintes requisitos e funcionalidades:

#### Funcionalidades Principais

1. **Gerenciamento de Livros**
    - Adicionar um novo livro ao sistema.
    - Remover um livro do sistema.
    - Listar todos os livros disponíveis.
    - Marcar um livro como disponível ou emprestado.

2. **Gerenciamento de Membros**
    - Adicionar um novo membro ao sistema.
    - Remover um membro do sistema.
    - Listar todos os membros registrados.

3. **Gerenciamento de Empréstimos**
    - Registrar o empréstimo de um livro para um membro.
    - Registrar a devolução de um livro emprestado.
    - Listar todos os empréstimos em andamento.

#### Requisitos Detalhados

1. **Modelagem de Dados**
    - **Livro (Book)**: Representa um livro na biblioteca. Deve ter atributos como título, autor, ISBN e status de disponibilidade.
    - **Membro (Member)**: Representa um membro da biblioteca. Deve ter atributos como ID, nome, endereço, email e telefone.
    - **Empréstimo (Loan)**: Representa um registro de empréstimo. Deve ter atributos como livro, membro, data de empréstimo e data de devolução.

2. **Repositórios de Dados**
    - **Repositório de Livros (BookRepository)**: Armazena e gerencia os dados dos livros.
    - **Repositório de Membros (MemberRepository)**: Armazena e gerencia os dados dos membros.
    - **Repositório de Empréstimos (LoanRepository)**: Armazena e gerencia os dados dos empréstimos.

3. **Serviços de Negócios**
    - **Serviço de Livros (BookService)**: Contém a lógica para adicionar, remover e listar livros.
    - **Serviço de Membros (MemberService)**: Contém a lógica para adicionar, remover e listar membros.
    - **Serviço de Empréstimos (LoanService)**: Contém a lógica para registrar e gerenciar empréstimos e devoluções.

4. **Controladores**
    - **Controlador de Livros (BookController)**: Interface para interagir com o serviço de livros.
    - **Controlador de Membros (MemberController)**: Interface para interagir com o serviço de membros.
    - **Controlador de Empréstimos (LoanController)**: Interface para interagir com o serviço de empréstimos.

### Requisitos de Implementação

- **Classes e Atributos**
    - Cada entidade (Livro, Membro, Empréstimo) deve ter seus atributos básicos definidos.
    - Métodos para acessar e manipular esses atributos devem ser incluídos (getters e setters).

- **Lógica de Negócios**
    - Os serviços devem conter a lógica para manipulação dos dados, como adicionar, remover e listar entidades.
    - O serviço de empréstimos deve gerenciar o estado dos livros (disponível ou emprestado) e verificar a existência de membros e livros ao registrar um empréstimo.

- **Persistência de Dados**
    - Utilizar listas em memória para armazenar os dados das entidades.
    - Métodos para adicionar, remover e listar entidades nos repositórios.

- **Interação com o Sistema**
    - Controladores devem fornecer métodos para interagir com os serviços, simulando uma interface de usuário ou uma API.

### Considerações Adicionais

- **Encapsulamento e Modificação**
    - O projeto deve ser modular e seguir princípios de encapsulamento para facilitar futuras modificações e expansões.

- **Teste e Validação**
    - Implementar testes básicos para verificar a funcionalidade de adicionar, remover e listar entidades, bem como registrar empréstimos e devoluções.

Este projeto permitirá a prática e aplicação de conceitos fundamentais de Java, como classes, métodos, encapsulamento, herança, interfaces, pacotes e mais, proporcionando uma base sólida para o desenvolvimento de sistemas mais complexos no futuro.