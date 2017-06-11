package br.com.opensanca.openmeetup.repository;

import br.com.opensanca.openmeetup.domain.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lferreira on 6/11/17.
 */
@Repository
public interface CompanyRepository extends CrudRepository<Company, Long> {
}
