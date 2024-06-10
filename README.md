
# DSCommerce

DSCommerce é uma API para gerenciamento de produtos, pedidos, categorias e usuários em um sistema de e-commerce. Este projeto utiliza o Spring Boot 3.2.5 e Java 17. Foi desenvolvido como parte do curso "Java Spring Professional" oferecido pela escola DevSuperior.

## Índice

- [Instalação](#instalação)
- [Endpoints](#endpoints)


## Instalação

### Pré-requisitos

- Java 17
- Maven

### Passos para clonar e rodar o programa

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/DSCommerce.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd DSCommerce
    ```
3. Compile e execute o projeto:
    ```bash
    mvn spring-boot:run
    ```

## Endpoints

### Products

| Método | Endpoint          | Descrição                                                                                                  | Autorização         |
|--------|-------------------|------------------------------------------------------------------------------------------------------------|---------------------|
| GET    | /products/{id}    | Retorna um produto pelo ID.                                                                                | Nenhuma             |
| GET    | /products         | Retorna todos os produtos, com opção de filtro por nome e paginação.                                       | Nenhuma             |
| POST   | /products         | Insere um novo produto.                                                                                    | ROLE_ADMIN          |
| PUT    | /products/{id}    | Atualiza um produto existente pelo ID.                                                                      | ROLE_ADMIN          |
| DELETE | /products/{id}    | Deleta um produto pelo ID.                                                                                  | ROLE_ADMIN          |

### Orders

| Método | Endpoint          | Descrição                                                                                                  | Autorização         |
|--------|-------------------|------------------------------------------------------------------------------------------------------------|---------------------|
| GET    | /orders/{id}      | Retorna um pedido pelo ID.                                                                                  | ROLE_ADMIN, ROLE_CLIENT |
| POST   | /orders           | Insere um novo pedido.                                                                                      | ROLE_CLIENT         |

### Categories

| Método | Endpoint          | Descrição                                                                                                  | Autorização         |
|--------|-------------------|------------------------------------------------------------------------------------------------------------|---------------------|
| GET    | /categories       | Retorna todas as categorias.                                                                               | Nenhuma             |

### UserController

| Método | Endpoint          | Descrição                                                                                                  | Autorização         |
|--------|-------------------|------------------------------------------------------------------------------------------------------------|---------------------|
| GET    | /me               | Retorna as informações do usuário autenticado.                                                             | ROLE_ADMIN, ROLE_CLIENT |
