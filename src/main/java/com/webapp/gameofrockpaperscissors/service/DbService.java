package com.webapp.gameofrockpaperscissors.service;

import com.webapp.gameofrockpaperscissors.domain.User;
import com.webapp.gameofrockpaperscissors.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {
    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers() {
        return  repository.findAll();
    }

    public User getUserById(final Long id) {
        return repository.findById(id).orElse(null);
    }

    public User saveUser(final User user) {
        return repository.save(user);
    }

    public void deleteUser(final Long userId) {
        repository.deleteById(userId);
    }



}
