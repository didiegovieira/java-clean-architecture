package cleanarchitecture.app.domain.dto.user;

public record CreateUserResponse (
        String username,
        String email
) {
}
