package forum.app.ForumApplication.service;

import forum.app.ForumApplication.model.Posts;
import forum.app.ForumApplication.repo.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

        private final PostsRepo postsRepo;

        @Autowired
        public PostsService(PostsRepo postsRepo) {
            this.postsRepo = postsRepo;
        }

        public Posts addPost(Posts posts){

            return postsRepo.save(posts);
        }

        public List<Posts> findAllPosts(){
            return postsRepo.findAll();
        }

        public Posts updatePost(Posts posts){
            return postsRepo.save(posts);
        }

        public Posts findPostById(int id){
            return postsRepo.findPostById(id);
        }

        public void deletePost(int id){
            postsRepo.deletePostById(id);
        }
    }


