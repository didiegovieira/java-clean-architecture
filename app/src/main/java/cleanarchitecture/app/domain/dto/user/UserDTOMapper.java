package cleanarchitecture.app.domain.dto.user;

import cleanarchitecture.app.domain.entity.User;

public class UserDTOMapper {
    public CreateUserResponse toResponse(User user) {
        return new CreateUserResponse(
                user.username(),
                user.email()
        );
    }

    public User toUser(CreateUserRequest request) {
        return new User(
                request.username(),
                request.email(),
                request.password()
        );
    }
}
