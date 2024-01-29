package com.hoiddev.hoidhubapi.Api.Controller.User;

import com.hoiddev.hoidhubapi.Business.User.Dto.CreateUserInDto;
import com.hoiddev.hoidhubapi.Business.User.Service.CreateUserService;
import com.hoiddev.hoidhubapi.Business.User.Service.GetUserService;
import com.hoiddev.hoidhubapi.Data.Database.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    private final CreateUserService createUserService;
    @Autowired
    public CreateUserController(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }
    @PostMapping("/user")
    public void createUser (@RequestBody CreateUserInDto username) {
        createUserService.save(username);
    }

}
