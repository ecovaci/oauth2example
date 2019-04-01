package org.kpax.oauth2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ClientApplication {

    @Autowired
    private OAuth2RestOperations restOperations;

    @RequestMapping("/its-also-me")
    public String home() {
        String message = restOperations.getForObject("http://localhost:8081/auth/user/also-me", String.class);
        return "Message from auth server: " + message;
    }


    @RequestMapping("/its-me")
    public String home(Principal principal) {
        return "The principal's name is: " + principal.getName();
    }

}