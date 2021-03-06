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
 * League.
 *
 * @author yury.yunkevich
 */
@Data
@Entity
@Table(name = "LEAGUE")
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LEAGUE_ID_SEQ")
    @SequenceGenerator(name = "LEAGUE_ID_SEQ", sequenceName = "LEAGUE_ID_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    private List<Team> teams;
}