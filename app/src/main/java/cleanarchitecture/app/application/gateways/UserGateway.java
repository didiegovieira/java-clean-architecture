package cleanarchitecture.app.application.gateways;

import cleanarchitecture.app.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
