package pl.pdob.Nplus1Issue.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService(userRepository);

    }

    @Test
    void getById() {
        //given
        Long id = 2L;

        //when
        User byId = userService.getById(id);

        //then
        System.out.println(byId);
    }

    @Test
    void getAll() {
        //given


        //when
        List<User> all = userService.getAllSQLJoinFetch();

        //then
        all.forEach(System.out::println);
    }
}