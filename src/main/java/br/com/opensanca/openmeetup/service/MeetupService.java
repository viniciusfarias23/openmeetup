package br.com.opensanca.openmeetup.service;

import br.com.opensanca.openmeetup.domain.Meetup;
import br.com.opensanca.openmeetup.repository.MeetupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by lferreira on 6/11/17.
 */
@Service
public class MeetupService {

    @Autowired
    private MeetupRepository meetupRepository;

    public Page<Meetup> findAll(Pageable pageable) {
        return meetupRepository.findAll(pageable);
    }
}
