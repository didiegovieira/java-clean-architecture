# ☕ Java and Clean Architecture

<table>
    <tr>
        <td>
            <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
        </td>
        <td>
            <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" />
        </td>
        <td>
            <img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" />
        </td>
        <td>
            <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" />
        </td>
        <td>
            <img src="https://img.shields.io/badge/Shell_Script-121011?style=for-the-badge&logo=gnu-bash&logoColor=white" />
        </td>
    </tr>
</table>

## 🚀 Introduction
Java is one of the most popular programming languages in the world, known for its portability, robustness, and wide application in various domains, from mobile app development to large-scale enterprise systems.

<img width="1000" src="https://hermes.dio.me/articles/cover/7b89fda2-4af3-4ae0-98bc-ad2b65854909.png" alt="terraform logo">


## 📋 Requirements
> [!IMPORTANT]
> To start this project, you will need Docker and Docker Compose installed on your machine.

> [!NOTE]
> To simplify the project initialization process, we provide a shell script that will handle the installation of necessary requirements on Linux and start Docker Compose.

```bash
bash ./start_project.sh
```

## ✨ Clean Architecture
Clean Architecture, also known as Clean Architecture, is a set of software design practices and principles aimed at creating systems that are modular, testable, and independent of external frameworks. Developed by Robert C. Martin, Clean Architecture promotes the separation of concerns, facilitating code maintenance, evolution, and scalability.

## ✅ Benefits of Java with Clean Architecture
- **Modularity**: Clean Architecture encourages dividing the system into independent modules, which is facilitated by Java's package system.
  
- **Testability**: Clear separation of responsibilities enables easy creation of unit, integration, and acceptance tests, ensuring system quality and robustness.

- **Maintainability**: With a well-defined structure and layer separation, it's easier to understand and maintain the code over time.

- **Framework Independence**: Clean Architecture promotes minimal dependency on external frameworks, allowing Java code to be easily migrated and adapted to new technologies.

## 🛠️ Components of Clean Architecture in Java
1. **Entities**: Representations of business concepts of the system.
  
2. **Use Cases**: Represent the system's functionalities and implement business rules.

3. **Boundary Interfaces**: Are the system's input and output interfaces, such as user interfaces, APIs, or databases.

4. **Frameworks and Drivers**: Are the elements external to the system, such as web frameworks, persistence libraries, etc.

## 📄 Example Implementation
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
