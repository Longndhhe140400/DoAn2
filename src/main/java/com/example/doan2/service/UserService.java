package com.example.doan2.service;


import com.example.doan2.entity.User;
import com.example.doan2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User findUserByPublicAddress(String publicAddress) {
        return userRepository.findByPublicAddress(publicAddress);
    }

    public Optional<User> findUserById(Integer id) {
        return userRepository.findById(id);
    }

    public User findUserByName(String username) {
        return userRepository.findByName(username);
    }


    public User findUserById(int Id) {
        return
                userRepository.findById(Id);
    }

    // function for load User by Email

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return new UserLoginService(user);
    }
}
