package com.hoiddev.hoidhubapi.Api.Controller.Home;

import com.hoiddev.hoidhubapi.Api.Response.Home.GenericHomeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SideNavBarController {

        @GetMapping("/api/home/side-nav-bar")
        public GenericHomeResponse[] getSideNavBar() {
                return new GenericHomeResponse[] {
                        new GenericHomeResponse("Home", "home", "home"),
                        new GenericHomeResponse("About", "info", "about"),
                        new GenericHomeResponse("Contact", "contact_mail", "contact"),
                        new GenericHomeResponse("Login", "login", "login"),
                        new GenericHomeResponse("Register", "person_add", "register")
                };
        }

}
