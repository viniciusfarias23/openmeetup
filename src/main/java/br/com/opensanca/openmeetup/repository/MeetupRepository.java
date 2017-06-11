package br.com.opensanca.openmeetup.repository;

import br.com.opensanca.openmeetup.domain.Meetup;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lferreira on 6/11/17.
 */
@Repository
public interface MeetupRepository extends JpaRepository<Meetup, Long> {
}
