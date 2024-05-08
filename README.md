# Java e Clean Architecture

## Introdução
O Java é uma das linguagens de programação mais populares do mundo, conhecida por sua portabilidade, robustez e ampla aplicação em diversos domínios, desde desenvolvimento de aplicativos móveis até sistemas de grande escala em empresas.

<img width="1000" src="https://hermes.dio.me/articles/cover/7b89fda2-4af3-4ae0-98bc-ad2b65854909.png" alt="terraform logo">


## Requisitos
> [!IMPORTANT]
> Para iniciar este projeto, você precisará ter o Docker e o Docker Compose instalados em sua máquina.

> [!NOTE]
> Para facilitar o processo de inicialização do projeto, fornecemos um script de shell que cuidará da instalação dos requisitos necessários no Linux e iniciará o Docker Compose.

```bash
bash ./start_project.sh
```

## Arquitetura Limpa (Clean Architecture)
A Arquitetura Limpa, também conhecida como Clean Architecture, é um conjunto de práticas e princípios de design de software que visa criar sistemas que sejam modularizados, testáveis e independentes de frameworks externos. Desenvolvida por Robert C. Martin, a Clean Architecture promove a separação de preocupações, facilitando a manutenção, evolução e escalabilidade do código.

## Benefícios do Java com Clean Architecture
- **Modularidade**: A Clean Architecture incentiva a divisão do sistema em módulos independentes, o que é facilitado pelo sistema de pacotes do Java.
  
- **Testabilidade**: A separação clara de responsabilidades permite a fácil criação de testes unitários, integrados e de aceitação, garantindo a qualidade e robustez do sistema.

- **Manutenibilidade**: Com uma estrutura bem definida e separação de camadas, é mais fácil entender e dar manutenção ao código ao longo do tempo.

- **Independência de Frameworks**: A Clean Architecture promove a dependência mínima de frameworks externos, permitindo que o código Java seja facilmente migrado e adaptado a novas tecnologias.

## Componentes da Clean Architecture em Java
1. **Entidades**: Representações de conceitos de negócio do sistema.
  
2. **Casos de Uso (Use Cases)**: Representam as funcionalidades do sistema e implementam as regras de negócio.

3. **Interfaces de Fronteira (Boundary Interfaces)**: São as interfaces de entrada e saída do sistema, como interfaces de usuário, APIs ou bancos de dados.

4. **Frameworks e Drivers**: São os elementos externos ao sistema, como frameworks web, bibliotecas de persistência, etc.

## Exemplo de Implementação
```java
package cleanarchitecture.app.application.usecases.user;

import cleanarchitecture.app.application.gateways.UserGateway;
import cleanarchitecture.app.domain.entity.User;

public class CreateUserInteractor {
    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
