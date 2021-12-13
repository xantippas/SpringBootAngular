package forum.app.ForumApplication.repo;

import forum.app.ForumApplication.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepo extends JpaRepository<Posts, Integer> {
    void deletePostById(int id); //query method(due to naming convention ById field), spring able to understand this language and create query for us
    Posts findPostById(int id); //query method in spring


}
