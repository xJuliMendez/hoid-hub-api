package com.hoiddev.hoidhubapi.Api.Controller.User;

import com.hoiddev.hoidhubapi.Business.User.Service.GetUserService;
import com.hoiddev.hoidhubapi.Data.Database.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class GetUserController {

    private final GetUserService getUserService;
    public GetUserController(
            GetUserService getUserService
    ) {
        this.getUserService = getUserService;
    }

    @GetMapping("/customer")
    public List<String> helloWorld() {
        //assign all users to a variable
        Iterable<User> users = getUserService.findAll();
        //return all users

        List<User> usersList = new ArrayList<>();
        users.forEach(usersList::add);
        return Arrays.asList(usersList.get(0).getUsername(), usersList.get(1).getUsername());
    }
}
