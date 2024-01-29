package com.hoiddev.hoidhubapi.Business.User.Service;

import com.hoiddev.hoidhubapi.Business.User.Dto.CreateUserInDto;
import com.hoiddev.hoidhubapi.Data.Database.Entity.User;
import com.hoiddev.hoidhubapi.Data.Database.Repository.UserRepository.UserRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService {

    private final UserRepositoryInterface userRepository;

    @Autowired
    public CreateUserService(
            UserRepositoryInterface userRepository
    ) {
        this.userRepository = userRepository;
    }
    public void save(CreateUserInDto username) {
        User user = new User();
        user.setUsername(username.username());
        user.setPassword(username.password());
        user.setEmail(username.email());

        userRepository.save(user);
    }
}
