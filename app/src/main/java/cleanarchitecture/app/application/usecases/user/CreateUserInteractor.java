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
