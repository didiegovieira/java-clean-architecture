package cleanarchitecture.app.domain.entity;

public record User(
        String username,
        String email,
        String password
) {
}
