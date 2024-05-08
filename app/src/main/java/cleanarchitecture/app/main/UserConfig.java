package cleanarchitecture.app.main;

import cleanarchitecture.app.application.gateways.UserGateway;
import cleanarchitecture.app.application.usecases.user.CreateUserInteractor;
import cleanarchitecture.app.domain.dto.user.UserDTOMapper;
import cleanarchitecture.app.infrastructure.gateways.user.UserEntityMapper;
import cleanarchitecture.app.infrastructure.gateways.user.UserRepositoryGateway;
import cleanarchitecture.app.infrastructure.persistence.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserUseCase(UserGateway userGateway) {
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper() {
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper() {
        return new UserDTOMapper();
    }
}
