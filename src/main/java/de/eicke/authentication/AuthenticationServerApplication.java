package de.eicke.authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class AuthenticationServerApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationServerApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AuthenticationServerApplication.class, args);
    }


}
