package forum.app.ForumApplication.service;

import forum.app.ForumApplication.model.User;
import forum.app.ForumApplication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

//service layer access all the data on the server
@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user){
        return userRepo.save(user);
    }

    public List<User> findAllUsers(){
        return userRepo.findAll();
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    /*public User findUserById(UUID id){
        return userRepo.findUserById(id);
    }*/

    public void deleteUser(int id){
        userRepo.deleteUserById(id);
    }
}
