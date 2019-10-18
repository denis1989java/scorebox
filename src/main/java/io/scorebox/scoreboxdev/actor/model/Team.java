package io.scorebox.scoreboxdev.actor.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Team.
 *
 * @author yury.yunkevich
 */
@Data
public class Team {

    @Id private long id;

    private List<User> users;
}