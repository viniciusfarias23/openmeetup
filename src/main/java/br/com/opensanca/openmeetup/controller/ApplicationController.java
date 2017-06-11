package br.com.opensanca.openmeetup.controller;

import br.com.opensanca.openmeetup.domain.Account;
import br.com.opensanca.openmeetup.domain.Role;
import br.com.opensanca.openmeetup.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lferreira on 6/10/17.
 */
@Slf4j
@Controller
public class ApplicationController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @ResponseBody
    @GetMapping("/createDefaultUser")
    public String createDefaultUser() {
        Account account = new Account();
        account.setUsername("user");
        account.setPassword(passwordEncoder.encode("123123"));
        account.setRole(Role.ROLE_ADMIN);

        accountRepository.save(account);

        return "ok";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
