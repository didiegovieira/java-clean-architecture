package cleanarchitecture.app.infrastructure.gateways.user;

import cleanarchitecture.app.domain.entity.User;
import cleanarchitecture.app.infrastructure.persistence.user.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj) {
        return new UserEntity(
                userDomainObj.username(),
                userDomainObj.email(),
                userDomainObj.password()
        );
    }

    User toDomainObj(UserEntity userEntity) {
        return new User(
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getPassword()
        );
    }
}
