package br.com.opensanca.openmeetup.repository;

import br.com.opensanca.openmeetup.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lferreira on 6/10/17.
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
