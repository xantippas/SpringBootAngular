package forum.app.ForumApplication.repo;

import forum.app.ForumApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
    void deleteUserById(UUID id); //query method(due to naming convention ById field), spring able to understand this language and create query for us

    //User findUserById(UUID id); //query method in spring
}
