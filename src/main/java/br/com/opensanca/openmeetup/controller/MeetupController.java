package br.com.opensanca.openmeetup.controller;

import br.com.opensanca.openmeetup.domain.ApplicationDomain;
import br.com.opensanca.openmeetup.domain.Meetup;
import br.com.opensanca.openmeetup.service.MeetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lferreira on 6/11/17.
 */
@Controller
public class MeetupController extends ApplicationController {

    @Autowired
    private MeetupService meetupService;

    @GetMapping("/")
    public ModelAndView index(Pageable pageable) {
        Page<Meetup> meetups = meetupService.findAll(pageable);

        return new ModelAndView("home")
            .addObject("meetups", meetups);
    }
}
