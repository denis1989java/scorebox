package io.scorebox.scoreboxdev.actor.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * User.
 *
 * @author yury.yunkevich
 */
@Data
public abstract class User {

    @Id private long id;

    private List<Team> teams;
}
