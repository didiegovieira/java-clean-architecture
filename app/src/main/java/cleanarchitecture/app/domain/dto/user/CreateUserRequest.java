package cleanarchitecture.app.domain.dto.user;

public record CreateUserRequest (
        String username,
        String email,
        String password
) {
}
