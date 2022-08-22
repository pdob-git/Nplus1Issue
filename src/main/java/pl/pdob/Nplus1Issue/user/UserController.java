package pl.pdob.Nplus1Issue.user;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getAllUsers(@PathVariable Long id){
        return userService.getById(id);
    }


}
