package com.hoiddev.hoidhubapi.Business.User.Service;

import com.hoiddev.hoidhubapi.Data.Database.Entity.User;
import com.hoiddev.hoidhubapi.Data.Database.Repository.UserRepository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserService {

    private final UserRepositoryInterface userRepository;

    @Autowired
    public GetUserService(
            UserRepositoryInterface ejemploRepository
    ) {
        this.userRepository = ejemploRepository;
    }

    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User ejemplo) {
        return userRepository.save(ejemplo);
    }

}
