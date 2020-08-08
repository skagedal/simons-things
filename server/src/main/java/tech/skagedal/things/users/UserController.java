package tech.skagedal.things.users;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import java.util.UUID;
import javax.inject.Inject;

@Controller("/api/belongings/users")
public class UserController {
    @Inject
    UserRepository userRepository;

    @Get
    public Single<List<User>> index() {
        return userRepository.findAll().toList();
    }

    @Get("/{id}")
    public Single<User> getUser(UUID id) {
        return userRepository.findById(id).toSingle();
    }

    @Post
    public Completable postUser(User user) {
        user.setId(UUID.randomUUID());
        return userRepository.save(user).ignoreElement();
    }
}
