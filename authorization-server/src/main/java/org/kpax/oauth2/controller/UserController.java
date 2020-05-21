package org.kpax.oauth2.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }

    @PreAuthorize("#oauth2.hasScope('read')")
    @RequestMapping("/user/also-me")
    public String test(Principal user) {
        return "The principal's name is: " + user.getName();
    }
}
