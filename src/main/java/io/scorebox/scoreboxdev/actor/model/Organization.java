package io.scorebox.scoreboxdev.actor.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

/**
 * Organization.
 *
 * @author yury.yunkevich
 */
@Data
@Entity
@Table(name = "ORGANIZATION")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORGANIZATION_ID_SEQ")
    @SequenceGenerator(name = "ORGANIZATION_ID_SEQ", sequenceName = "ORGANIZATION_ID_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    private List<League> leagues;
}
