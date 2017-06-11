package br.com.opensanca.openmeetup.controller;

import br.com.opensanca.openmeetup.domain.Account;
import br.com.opensanca.openmeetup.domain.Company;
import br.com.opensanca.openmeetup.domain.Role;
import br.com.opensanca.openmeetup.repository.AccountRepository;
import br.com.opensanca.openmeetup.repository.CompanyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lferreira on 6/11/17.
 */
@Slf4j
@Controller
public class PagesController extends ApplicationController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

