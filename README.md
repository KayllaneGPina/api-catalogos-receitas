# 📚 Catálogo de Receitas de Cozinha

Este projeto é uma aplicação web para gerenciar receitas de cozinha. Ele foi desenvolvido em Java utilizando o Spring Boot, com o objetivo de aplicar os princípios SOLID e Clean Code, promovendo um código mais robusto, fácil de manter e escalável.

### 🚀  Funcionalidades
- Gerenciamento de receitas com categorias, ingredientes e instruções.
- Relacionamento entre receitas e ingredientes utilizando Spring Data JPA.
- API RESTful para operações CRUD em receitas e ingredientes.

### 🛠️  Tecnologias
- Java 17
- Spring Boot
- Spring Data JPA
- Lombok
- H2 Database

### 🧑‍💻 Princípios SOLID Aplicados

###### **S - Single Responsibility Principle (SRP)**
Cada classe do projeto possui uma única responsabilidade. As entidades Recipe e Ingredient, por exemplo, foram desenhadas para representar somente os dados relacionados às receitas e ingredientes, respectivamente.

###### **O - Open/Closed Principle (OCP)**
O código foi estruturado de maneira que novas funcionalidades possam ser adicionadas sem modificar as classes existentes. Por exemplo, a adição de novos tipos de categorias pode ser feita facilmente estendendo o enum Category.

###### L - Liskov Substitution Principle (LSP)
As classes e interfaces foram projetadas de forma que os subtipos possam ser usados de forma intercambiável com os tipos base, garantindo a integridade do sistema.

###### I - Interface Segregation Principle (ISP)
Foram criadas interfaces específicas para as responsabilidades de cada repositório, garantindo que as classes não sejam obrigadas a implementar métodos que não utilizam.

###### D - Dependency Inversion Principle (DIP)
A aplicação foi projetada para depender de abstrações (interfaces) e não de implementações concretas, facilitando a manutenção e o teste do código.

### 🧼 Clean Code
Além dos princípios SOLID, o código foi escrito seguindo as melhores práticas de Clean Code, o que inclui:
- **Nomes Significativos**: Classes, métodos e variáveis possuem nomes claros e descritivos.
- **Funções Pequenas e Simples**: Métodos foram escritos para serem curtos e focados em uma única tarefa.
- **Formatação Consistente**: Código foi formatado de forma consistente para garantir legibilidade.
- **Redução de Código Boilerplate**: Lombok foi utilizado para eliminar código repetitivo, como getters, setters e construtores, permitindo foco na lógica de negócio.,

### 📝 Instruções de Uso
1. Clone o repositório:
```bash
git clone https://github.com/KayllaneGPina/api-catalogos-receitas.git
```

2. Acesse o diretório do projeto:
```bash
cd catalogo-receitas
```

### 🧪 Testando com Swagger
A aplicação inclui uma interface Swagger para facilitar o teste da API. Acesse o Swagger em: `http://localhost:8080/swagger-ui.html`

Exemplos de Payloads:
```bash
{
  "name": "Salada de Frutas",
  "ingredients": [
    {
      "name": "Maçã",
      "quantity": "2",
      "unit": "Unidade"
    },
    {
      "name": "Banana",
      "quantity": "3",
      "unit": "Unidade"
    },
    {
      "name": "Laranja",
      "quantity": "2",
      "unit": "Unidade"
    }
  ],
  "instructions": "Corte as frutas em pedaços pequenos e misture tudo em uma tigela.",
  "category": "SOBREMESA"
}
```

### 📝 Conclusão
Se você tiver sugestões de feedback, melhorias ou qualquer outra recomendação para tornar o projeto ainda melhor, por favor, sinta-se à vontade para compartilhar. Estou aberta a críticas construtivas e ansiosa para continuar aprendendo e evoluindo como desenvolvedora.
