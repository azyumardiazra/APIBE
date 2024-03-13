package com.kelompoktiga.demo.Service;

import com.kelompoktiga.demo.Repository.UserRepository;
import com.kelompoktiga.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Iterable <User> getAlluser () {
        return userRepository.findAll();
    }
    public User getuserByid(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User User) {
        return userRepository.save(User);
    }
    public void deleteUser (Long id) {
        userRepository.deleteById(id);
    }

//    public List <User> findUsersByNameContainingIgnoreCase(String name) { //class sensitif
//        if (StringUtils.hasText(name)) {
//            return userRepository.findUsersByNameContainingIgnoreCase(name);
//        }
//        return userRepository.findAll();
//    }
}
