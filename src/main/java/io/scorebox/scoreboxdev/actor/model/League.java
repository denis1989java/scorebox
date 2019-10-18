package io.scorebox.scoreboxdev.actor.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * League.
 *
 * @author yury.yunkevich
 */
@Data
public class League {

    @Id private long id;

    private List<Team> teams;
}