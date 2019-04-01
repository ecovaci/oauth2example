package org.kpax.oauth2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ClientApplication {

    @RequestMapping("/still-me")
    public String home(Principal user) {
        return "Hello " + user.getName();
    }

    @RequestMapping("/test")
    public String test(Principal user) {
        return "Hello " + user.getName();
    }


}