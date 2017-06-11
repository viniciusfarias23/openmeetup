package br.com.opensanca.openmeetup.domain;

import br.com.opensanca.openmeetup.ServiceConstants;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by lferreira on 6/11/17.
 */
@Data
@EqualsAndHashCode(callSuper = false, of = "id")
@Entity
public class Meetup extends ApplicationDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private LocalDateTime meetupDate;

    @ManyToOne
    private Company company;

    public String getMeetupDateStr() {
        return meetupDate == null ? null : meetupDate.format(ServiceConstants.DEFAULT_FORMATTER);
    }
}
