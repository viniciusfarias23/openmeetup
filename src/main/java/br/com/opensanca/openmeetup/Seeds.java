package br.com.opensanca.openmeetup;

import br.com.opensanca.openmeetup.domain.Account;
import br.com.opensanca.openmeetup.domain.Company;
import br.com.opensanca.openmeetup.domain.Meetup;
import br.com.opensanca.openmeetup.domain.Role;
import br.com.opensanca.openmeetup.repository.AccountRepository;
import br.com.opensanca.openmeetup.repository.CompanyRepository;
import br.com.opensanca.openmeetup.repository.MeetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

/**
 * Created by lferreira on 6/11/17.
 */
@Component
public class Seeds implements CommandLineRunner {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private MeetupRepository meetupRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (accountRepository.count() != 0) {
            return;
        }

        Company company = new Company();
        company.setName("company");

        companyRepository.save(company);

        Account account = new Account();
        account.setUsername("user");
        account.setPassword(passwordEncoder.encode("123123"));
        account.setRole(Role.ROLE_ADMIN);
        account.setCompany(company);

        accountRepository.save(account);

        for (int i = 0; i < 10; i++) {
            Meetup meetup = new Meetup();
            meetup.setTitle("Meetup " + i);
            meetup.setMeetupDate(LocalDateTime.now().plusDays(i));
            meetup.setDescription("Description " + i);
            meetup.setCompany(company);

            meetupRepository.save(meetup);
        }
    }
}
