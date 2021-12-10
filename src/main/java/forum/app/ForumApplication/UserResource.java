package forum.app.ForumApplication;

import forum.app.ForumApplication.model.User;
import forum.app.ForumApplication.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//server side that the world can see
//api layer
@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserResource {
    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    //retrieve info in backend
    //responseentity is a generic need to pass in what data is going to be in the body, RETURN HTTP RESPONSE
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.findAllUsers();
        System.out.println(users.toString());
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

/*    @GetMapping("find/{id}")
    public ResponseEntity<List<User>> getUserById(@PathVariable("id") UUID id){
        User user = userService.findUserById();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }*/

    @PostMapping("/add") //post info in backend
    public ResponseEntity<User> addUser(@RequestBody User user){ //JSON format
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED); //created something on the server which this is doing
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user){ //JSON format
        User newUser = userService.updateUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK); //created something on the server which this is doing
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id){ //JSON format
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK); //sends an OK to user that everything is well
    }

}
