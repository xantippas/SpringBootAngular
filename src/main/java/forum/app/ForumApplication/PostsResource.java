package forum.app.ForumApplication;

import forum.app.ForumApplication.model.Posts;
import forum.app.ForumApplication.service.PostsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsResource {

    private final PostsService postsService;

    public PostsResource(PostsService postsService) {
        this.postsService = postsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Posts>> getAllPosts() {
        List<Posts> posts = postsService.findAllPosts();
        return new ResponseEntity<>(posts, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Posts> addPost(@RequestBody Posts posts) { //JSON format
        Posts newPost = postsService.addPost(posts);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }

    /*@PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) { //JSON format
        User newUser = userService.updateUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id) { //JSON format
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK); //sends an OK to user that everything is well
    }*/

}

