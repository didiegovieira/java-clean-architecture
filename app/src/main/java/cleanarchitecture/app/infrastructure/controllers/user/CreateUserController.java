package cleanarchitecture.app.infrastructure.controllers.user;

import cleanarchitecture.app.application.usecases.user.CreateUserInteractor;
import cleanarchitecture.app.domain.dto.user.CreateUserRequest;
import cleanarchitecture.app.domain.dto.user.CreateUserResponse;
import cleanarchitecture.app.domain.dto.user.UserDTOMapper;
import cleanarchitecture.app.domain.entity.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class CreateUserController {
    private final CreateUserInteractor createUserInteractor;

    public CreateUserController(CreateUserInteractor createUserInteractor) {
        this.createUserInteractor = createUserInteractor;
    }

    @PostMapping
    ResponseEntity<CreateUserResponse> createUser(@Valid @RequestBody CreateUserRequest request) {
        User userObj = new UserDTOMapper().toUser(request);
        User createdUser = createUserInteractor.createUser(userObj);

        return ResponseEntity
                .status(201)
                .body(new UserDTOMapper().toResponse(createdUser));
    }
}
