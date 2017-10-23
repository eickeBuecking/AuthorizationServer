package de.eicke.authentication;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/user")
    public Principal user(Principal principal) {
    	if (principal != null) {
    		logger.debug(principal.toString());
    	} else {
    		logger.debug("Principal is null!");
    	}
       return principal;
    }
}
