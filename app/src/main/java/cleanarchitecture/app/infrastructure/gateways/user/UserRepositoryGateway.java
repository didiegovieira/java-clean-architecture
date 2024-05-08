package cleanarchitecture.app.infrastructure.gateways.user;

import cleanarchitecture.app.application.gateways.UserGateway;
import cleanarchitecture.app.domain.entity.User;
import cleanarchitecture.app.infrastructure.persistence.user.UserEntity;
import cleanarchitecture.app.infrastructure.persistence.user.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedUserEntity = userRepository.save(userEntity);

        return userEntityMapper.toDomainObj(savedUserEntity);
    }
}
