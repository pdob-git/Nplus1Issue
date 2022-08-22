package pl.pdob.Nplus1Issue.user;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @SuppressWarnings("SpellCheckingInspection")
    @GetMapping("/users/entitygraph")
    public List<User> getAllUsers() {
        System.out.println("Request @EntityGraph");
        return userService.getAllEntityGraph();
    }

    @SuppressWarnings("SpellCheckingInspection")
    @GetMapping("/users/joinfetch")
    public List<User> getAllUsersNoIssue() {
        System.out.println("Request JoinFetch");
        return userService.getAllSQLJoinFetch();
    }

    @GetMapping("/users/{id}")
    public User getAllUsers(@PathVariable Long id) {
        return userService.getById(id);
    }


}
