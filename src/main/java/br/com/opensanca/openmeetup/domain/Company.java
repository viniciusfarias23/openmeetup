package br.com.opensanca.openmeetup.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by lferreira on 6/10/17.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false, of = "id")
public class Company extends ApplicationDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
