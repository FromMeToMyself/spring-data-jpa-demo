package online.stringtek.springdatajpademo.example1.controller;

import online.stringtek.springdatajpademo.example1.entity.User;
import online.stringtek.springdatajpademo.example1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

/**
 * @author StringTek
 * @date 2020/9/17 13:22
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("user")
    public User addNewUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @GetMapping(path = "users")
    @ResponseBody
    public Page<User> getAllUsers(Pageable request) {
        return userRepository.findAll(request);
    }
}
