package pl.pdob.Nplus1Issue.user;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(Long id){
        return userRepository.findById(id).orElse(new User());
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
